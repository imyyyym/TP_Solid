package com.example.pokedex.exception;

public class PokemonNotFoundException extends Exception {
    public PokemonNotFoundException(String message) {
        super(message);
    }
}
