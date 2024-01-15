package com.example.pokedex.service;

import com.example.pokedex.model.Pokemon;
import com.example.pokedex.exception.PokemonNotFoundException;

public class PokemonService {
    public Pokemon getPokemonById(int id) throws PokemonNotFoundException {
        // Récupérer un Pokémon
        Pokemon pokemon = fetchPokemonFromDataSource(id);
        if (pokemon == null) {
            throw new PokemonNotFoundException("Pokemon with ID " + id + " not found.");
        }
        return pokemon;
    }

    private Pokemon fetchPokemonFromDataSource(int id) {
        return null;
    }
}
