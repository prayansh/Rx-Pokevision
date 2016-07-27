package com.prayansh.rx.pokevision;

import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonReader;

import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * Created by Prayansh on 2016-07-27.
 */
public class Pokedex {
    private static Pokedex instance;
    private static Pokemon[] pokedex;
    private static final String POKEDEX_PATH = "res/pokedex.json";

    private Pokedex() throws FileNotFoundException {
        generatePokedex();
    }

    public static Pokedex getPokedex() throws FileNotFoundException {
        if (instance == null)
            instance = new Pokedex();
        return instance;
    }

    public Pokemon pokemonById(int id) {
        return pokedex[id];
    }

    private static void generatePokedex() throws FileNotFoundException {
        JsonReader reader = new JsonReader(new FileReader(POKEDEX_PATH));
        pokedex = new GsonBuilder().create().fromJson(reader, Pokemon[].class);
    }
}
