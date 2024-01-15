package com.example.pokedex.service;

import com.example.pokedex.model.Pokemon;
import com.example.pokedex.exception.PokemonNotFoundException;

import java.sql.SQLException;

public interface PokemonDataService {
    Pokemon getPokemonById(int id) throws PokemonNotFoundException, SQLException;
}