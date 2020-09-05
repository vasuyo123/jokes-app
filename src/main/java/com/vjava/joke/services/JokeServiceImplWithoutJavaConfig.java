package com.vjava.joke.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

//@Service
public class JokeServiceImplWithoutJavaConfig implements JokeService {

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public JokeServiceImplWithoutJavaConfig() {
        chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
