package dev.lidia.karina.ghost_buster.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class GhostModelTest {

    @Test
    void testGhostModeInit(){
        // Objeto GhostModel de prueba 

        GhostModel ghost = new GhostModel(1, "Casper", "Class V", "Slow", "06-02-2025", "change into human form", "7");

        // Para verificar que los valores asignados son correctos:

        assertEquals(1, ghost.getId());
        assertEquals("Casper" ghost.getName());
        assertEquals("Class V", ghost.getClass());
        assertEquals("Slow", ghost.getDangerLevel());
        assertEquals("06-02-2025", ghost.getCaptureDate());
        assertEquals("change into human form", ghost.getHability());
        assertEquals("7", ghost.getAfinity());
    }

}
