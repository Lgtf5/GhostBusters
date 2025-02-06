package dev.lidia.karina.ghost_buster.model;

import org.junit.jupiter.api.BeforeEach;

public class PlayerModelTest {

    private PlayerModel player;
    private GhostModel ghost;


    @BeforeEach
    void setUp(){
        player = new PlayerModel("Jeremih");
        ghost = new GhostModel(1, "Casper", "Friendly", "High", "05-02-2025", "Change apparence", "Low");   
     }


}
