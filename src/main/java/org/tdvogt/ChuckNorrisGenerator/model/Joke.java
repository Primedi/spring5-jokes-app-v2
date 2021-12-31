package org.tdvogt.ChuckNorrisGenerator.model;

import java.util.List;

public class Joke {

    public Joke(String chuckNorrisJoke) {
        this.chuckNorrisJoke = chuckNorrisJoke;
    }

    public Joke(){
    }

    private String chuckNorrisJoke;

    public String getChuckNorrisJoke() {
        return chuckNorrisJoke;
    }
}
