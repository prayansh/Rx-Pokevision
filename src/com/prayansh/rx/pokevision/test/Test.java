package com.prayansh.rx.pokevision.test;

import com.prayansh.rx.pokevision.RxPoke;

/**
 * Created by Prayansh on 2016-07-28.
 */
public class Test {
    public static void main(String[] args) {
        RxPoke.pokeStringData(19.029625, 72.879968)
                .subscribe(System.out::println);
    }
}
