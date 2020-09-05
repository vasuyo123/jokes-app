package com.vjava.joke.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

//@Service
public class JokeServiceConstructorInjection implements JokeService{

    private ChuckNorrisQuotes chuckNorrisQuotes;

    public JokeServiceConstructorInjection(ChuckNorrisQuotes chuckNorrisQuotes) {
        this.chuckNorrisQuotes = chuckNorrisQuotes;
    }

    @Override
    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
