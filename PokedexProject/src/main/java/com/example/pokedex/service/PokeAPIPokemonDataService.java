package com.example.pokedex.service;

import com.example.pokedex.model.Pokemon;
import com.example.pokedex.exception.PokemonNotFoundException;

public class PokeAPIPokemonDataService implements PokemonDataService {

    @Override
    public Pokemon getPokemonById(int id) throws PokemonNotFoundException {
        // Récupérer les données Pokémon depuis l'API PokeAPI.
        return null;
    }
}