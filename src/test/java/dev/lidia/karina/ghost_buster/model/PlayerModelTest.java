package dev.lidia.karina.ghost_buster.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PlayerModelTest {

    private PlayerModel player;
    private GhostModel ghost;

    @BeforeEach
    void setUp() {
        player = new PlayerModel("Jeremih");
        ghost = new GhostModel(1, "Casper", "Friendly", "High", "05-02-2025", "Change apparence", "Low");
    }

    @Test 
    void testGetPlayerName(){
        assertEquals("Jeremih", player.getPlayerName());
     }

    @Test
     void testCaptureGhost() {
        // Verifica que un fantasma puede ser capturado y añadido a la lista de fantasmas capturados
        player.capturedGhost(ghost); // Captura el fantasma y lo añade a la lista de player
        List<GhostModel> capturedGhosts = player.getCapturedGhost(); // Obtiene la lista de fantasmas capturados
        assertEquals(1, capturedGhosts.size()); // Comprueba que la lista tiene un tamaño de 1
        assertTrue(capturedGhosts.contains(ghost)); // Comprueba que la lista contiene el objeto ghost
    }

}
