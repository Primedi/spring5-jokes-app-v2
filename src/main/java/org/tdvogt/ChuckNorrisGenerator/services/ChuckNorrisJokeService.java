package org.tdvogt.ChuckNorrisGenerator.services;

import org.springframework.stereotype.Service;
import org.tdvogt.ChuckNorrisGenerator.model.Joke;

import java.util.ArrayList;
import java.util.List;

@Service
public class ChuckNorrisJokeService {

    public List<Joke> getJokes(){
        List<Joke> jokes = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            jokes.add(new Joke(new guru.springframework.norris.chuck.ChuckNorrisQuotes().getRandomQuote()));
        }
        return jokes;
    }

}
