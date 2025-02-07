package dev.lidia.karina.ghost_buster.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GhostModelTest {

    private GhostModel ghost;

    // Método setUp con @BeforeEach para inicializar el objeto GhostModel antes de
    // cada prueba para garantizar que cada test funcione con el mismo objeto
    // inicial

    @BeforeEach
    void setUp() {
        ghost = new GhostModel("Casper", "Friendly", "High", "05-02-2025", "Change apparence", "Low");
    }

    @Test
    void testGetId() {
        // Verifica que el ID se inicializa correctamente
        assertEquals(1, ghost.getId());
    }

    @Test
    void testGetName() {
        assertEquals("Casper", ghost.getName());
    }

    @Test
    void testGetGhostClass() {
        assertEquals("Friendly", ghost.getGhostClass());
    }

    @Test
    void testDangerLevel() {
        assertEquals("High", ghost.getDangerLevel());
    }

    @Test
    void testCaptureDate() {
        assertEquals("05-02-2025", ghost.getCaptureDate());
    }

    @Test
    void testAbility() {
        assertEquals("Change apparence", ghost.getAbility());
    }

    @Test
    void testAfinity() {
        assertEquals("Low", ghost.getAfinity());
    }
}