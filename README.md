Rx-Pokevision
------
A Pokemon Api which leverages the PokeVision API to get a list of Pokemon near you.

## Usage
You can subscribe to the following Observables 
```java
Observable<PokeData.Pokemon> RxPoke.pokeData(double lat, double lon);
Observable<String> RxPoke.pokeStringData(double lat, double lon);
```

``` Pokemon ``` has the following fields
```java
    private Integer id;
    private Integer expiration_time;
    private Integer pokemonId;
    private Double latitude;
    private Double longitude;
    private Boolean isAlive;
```

## Dependencies
- io.reactivex:rxjava:1.1.7
- com.squareup.retrofit2:retrofit:2.1.0
- com.squareup.retrofit2:converter-gson:2.1.0
- com.squareup.retrofit2:adapter-rxjava:2.1.0

## Acknowledgements
[PokeVision](https://pokevision.com/)
