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

        // capturamos un solo fantasma y lo agregamos a la lista

        public void capturedGhost(GhostModel ghost) {
            capturedGhost.add(ghost);
        }

        // Se obtiene una lista de fantasmas capturados con este método

        public List<GhostModel> getCapturedGhost(){
            return capturedGhost;
        }

        // Para liberar un fantasma, se implementa este método

        public void releaseGhost(int id){
            capturedGhost.removeIf(ghost -> ghost.getId() == id);
        }
    }


