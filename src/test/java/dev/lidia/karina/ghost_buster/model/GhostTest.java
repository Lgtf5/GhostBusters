package dev.lidia.karina.ghost_buster.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class GhostTest {

    @BeforeEach
    void setUp() {
        ghost = new Ghost();
    }

    @Test
    @DisplayName("Id for Ghost tested");
    public void testId(){
        assertEquals(1, ghost.getId());


    }

}
