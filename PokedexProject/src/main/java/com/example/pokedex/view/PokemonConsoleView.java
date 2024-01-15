package com.example.pokedex.view;

import com.example.pokedex.model.DetailedPokemon;
import com.example.pokedex.model.Pokemon;
import com.example.pokedex.utilities.CSVFormatGenerator;
import com.example.pokedex.utilities.HTMLFormatGenerator;
import com.example.pokedex.utilities.TextFormatGenerator;

public class PokemonConsoleView implements TextFormatGenerator, HTMLFormatGenerator, CSVFormatGenerator {
    public void displayPokemon(Pokemon pokemon) {
        if (pokemon != null) { // Vérifiez si pokemon n'est pas null
            System.out.println("Nom: " + pokemon.getName());

            // Vérifiez si l'objet est une instance de DetailedPokemon
            if (pokemon instanceof DetailedPokemon) {
                System.out.println("Description: " + ((DetailedPokemon) pokemon).getDescription());
            }
        } else {
            System.out.println("Le Pokémon est null.");
        }
    }


    @Override
    public String generateCSV() {
        // Générer et retourner la sortie texte
        return null;
    }

    @Override
    public String generateHTML() {
        // Générer et retourner la sortie HTML
        return null;
    }

    @Override
    public String generateHumanReadableText() {
        // Générer et retourner la sortie texte
        return null;
    }
}