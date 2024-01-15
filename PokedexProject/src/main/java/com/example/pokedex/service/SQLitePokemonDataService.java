package com.example.pokedex.service;

import com.example.pokedex.exception.PokemonNotFoundException;
import com.example.pokedex.model.DetailedPokemon;
import com.example.pokedex.model.Pokemon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SQLitePokemonDataService implements PokemonDataService {

    private final String databasePath;

    public SQLitePokemonDataService(String databasePath) {
        this.databasePath = databasePath;
    }

    @Override
    public Pokemon getPokemonById(int id) throws PokemonNotFoundException, SQLException {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        DetailedPokemon pokemon = null;

        try {
            // Établir la connexion avec la base de données SQLite
            String url = "jdbc:sqlite:" + databasePath;
            conn = DriverManager.getConnection(url);

            // Préparer et exécuter la requête SQL
            String sql = "SELECT name, height, weight, description FROM pokemons WHERE id = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, id);
            rs = pstmt.executeQuery();

            if (rs.next()) {
                pokemon = new DetailedPokemon();
                pokemon.setName(rs.getString("name"));
                pokemon.setHeight(rs.getInt("height"));
                pokemon.setWeight(rs.getInt("weight"));
                pokemon.setDescription(rs.getString("description"));
            } else {
                throw new PokemonNotFoundException("Pokemon with ID " + id + " not found in SQLite database.");
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error connecting to SQLite database", e);
        } finally {
            try {
                if (rs != null) rs.close();
                if (pstmt != null) pstmt.close();
                if (conn != null) conn.close();
            } catch (SQLException ex) {
                System.err.println(ex.getMessage());
            }
        }

        return pokemon;
    }
}