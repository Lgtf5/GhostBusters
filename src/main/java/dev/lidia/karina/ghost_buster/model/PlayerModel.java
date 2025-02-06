package dev.lidia.karina.ghost_buster.model;

import java.util.ArrayList;
import java.util.List;

public class PlayerModel {
    
    private String playerName; // Jugador
    private List<GhostModel> capturedGhost; // Lista de los fantasmas atrapados

    // Inicializamos el jugador con su nombre, con un constructor

    public PlayerModel(String playerName){
        this.playerName = playerName;
        this.capturedGhost = new ArrayList<>();
        } // inicializamos la lista de fantasmas vacía

        // Se obtiene el nombre de un jugando con un getter

        public String getPlayerName() {
            return playerName;
        }
    }


