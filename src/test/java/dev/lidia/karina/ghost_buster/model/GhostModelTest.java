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
        GhostModel.resetCounter(); // hace un reset del contador antes de cada prueba
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

    @Test
    void testToString(){
        String expected = "1 Casper Friendly High 05-02-2025 Change apparence Low";
        assertEquals(expected, ghost.toString());
    }

    // Se añaden más test para dar una mayor cobertura a la clase GhostModel

    // Este test verifica que se incrementa correctamente el ID al crear múltiples instancias. Se crea una segunda instancia de GhostModel para ponerlo en práctica.

    @Test 
    void testMultipleInstances(){
        GhostModel ghost2 = new GhostModel("Boo", "Scary", "Low", "07-02-2025", "invisibility", "Medium");
        assertEquals(2, ghost2.getId());
        assertEquals("Boo", ghost2.getName());
        assertEquals("Scary", ghost2.getGhostClass());
        assertEquals("Low", ghost2.getDangerLevel());
        assertEquals("07-02-2025", ghost2.getCaptureDate());
        assertEquals("invisibility", ghost2.getAbility());
        assertEquals("Medium", ghost2.getAfinity());
    }
}