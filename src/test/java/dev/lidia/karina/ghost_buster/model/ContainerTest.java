package dev.lidia.karina.ghost_buster.model; 

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContainerTest {
    private Container container;
    private SimulatedGhost ghost1;
    private SimulatedGhost ghost2;

    @BeforeEach
    void setUp() {
        container = new Container();
        ghost1 = new SimulatedGhost(1, "Fantasma1", "TipoA", "Nivel1", "2025-01-01", "Habilidad1", "Afinidad1");
        ghost2 = new SimulatedGhost(2, "Fantasma2", "TipoB", "Nivel2", "2025-01-02", "Habilidad2", "Afinidad2");
    }

    @Test
    void testAddGhost() {
        container.addGhost(ghost1);
        assertEquals(1, container.getGhosts().size());
    }

}