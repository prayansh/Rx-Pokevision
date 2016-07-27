package com.prayansh.rx.pokevision;

import com.prayansh.rx.pokevision.models.PokeData;
import com.prayansh.rx.pokevision.models.PokeScan;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Observable;

import java.io.FileNotFoundException;

/**
 * Created by Prayansh on 2016-07-25.
 */
public class RxPoke {
    private static final double LAT = 19.0291;
    private static final double LON = 72.8775;

    public static void main(String[] args) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(PokeVisionService.SERVICE_ENDPOINT)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();
        final PokeVisionService service = retrofit.create(PokeVisionService.class);
        Observable<Response<PokeScan>> requestStream = service.getScan(LAT, LON);
        Observable<String> jobIdStream = requestStream
                .filter(response -> (response.isSuccessful()
                        && response.body().getStatus().equals("success")))
                .map(Response::body)
                .map(PokeScan::getJobId);
        Observable<Response<PokeData>> dataStream = jobIdStream
                .flatMap(jobId -> {
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    return service.getNearbyData(LAT, LON, jobId);
                });
        dataStream.flatMap(pokeDataResponse -> Observable.from(pokeDataResponse.body().getPokemon()))
                .map(RxPoke::prettyPrint);
    }

    private static String prettyPrint(PokeData.Pokemon pokemon) {
        String result = "";
        try {
            result += Pokedex.getPokedex().pokemonById(pokemon.getId());
        } catch (FileNotFoundException e) {
            result += pokemon.getId();
        }
        result += "@" + pokemon.getLatitude() + "," + pokemon.getLongitude() + " available for " + Utils.printTime(Utils
                .getTimeTillExpiration
                        (pokemon.getExpiration_time()));
        return result;
    }

}
