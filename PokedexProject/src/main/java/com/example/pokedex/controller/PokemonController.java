package com.example.pokedex.controller;

import com.example.pokedex.exception.PokemonNotFoundException;
import com.example.pokedex.model.Pokemon;
import com.example.pokedex.service.PokemonDataService;
import com.example.pokedex.view.PokemonConsoleView;

import java.sql.SQLException;

public class PokemonController {
    private PokemonDataService service;
    private PokemonConsoleView view;

    // Constructor to initialize the controller with data service and view
    public PokemonController(PokemonDataService service, PokemonConsoleView view) {
        this.service = service;
        this.view = view;
    }

    // Method to show information about a Pokemon by its ID
    public void showPokemon(int id) throws PokemonNotFoundException, SQLException {
        // Get the Pokemon information from the data service
        Pokemon pokemon = service.getPokemonById(id);

        // Display the Pokemon information using the view
        view.displayPokemon(pokemon);
    }
}
