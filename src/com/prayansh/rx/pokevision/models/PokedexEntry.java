package com.prayansh.rx.pokevision.models;

/**
 * Created by Prayansh on 2016-07-27.
 */
public class PokedexEntry {
    private int id;
    private String name;

    public PokedexEntry(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return id + ":" + name;
    }
}
