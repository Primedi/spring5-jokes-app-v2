package org.tdvogt.ChuckNorrisGenerator.services;

import org.springframework.stereotype.Service;
import org.tdvogt.ChuckNorrisGenerator.model.Joke;

import java.util.ArrayList;
import java.util.List;

@Service
public class ChuckNorrisJokeService {

    public Joke getJoke(){
         return new Joke(new guru.springframework.norris.chuck.ChuckNorrisQuotes().getRandomQuote());
    }

}
