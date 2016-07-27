package com.prayansh.rx.pokevision;

import com.prayansh.rx.pokevision.models.PokeData;
import com.prayansh.rx.pokevision.models.PokeScan;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

/**
 * Created by Prayansh on 2016-07-25.
 */
public interface PokeVisionService {
    String SERVICE_ENDPOINT = "https://pokevision.com/map/";

    @GET("scan/{lat}/{lon}")
    Observable<Response<PokeScan>> getScan(@Path("lat") double lat,
                                           @Path("lon") double lon);

    @GET("data/{lat}/{lon}/{jobId}")
    Observable<Response<PokeData>> getNearbyData(@Path("lat") double lat,
                                                 @Path("lon") double lon,
                                                 @Path("jobId") String jobId);
}
