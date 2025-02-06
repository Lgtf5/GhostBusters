package dev.lidia.karina.ghost_buster.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

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

}
