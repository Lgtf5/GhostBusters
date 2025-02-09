package dev.lidia.karina.ghost_buster.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

public class ContainerTest {
    private Container container;
    private Ghost ghost1;
    private Ghost ghost2;
    private List<Ghost> ghosts;

    @BeforeEach
    public void setUp() {
        ghosts = new ArrayList<>();
        container = new Container();
        ghost1 = new Ghost(1, "Fantasma1", "TipoA", "Nivel1", "2025-01-01", "Habilidad1", "Afinidad1");
        ghost2 = new Ghost(2, "Fantasma2", "TipoB", "Nivel2", "2025-01-02", "Habilidad2", "Afinidad2");
    }

    @Test
    public void testAddGhost() {
        container.addGhost(ghost1);
        assertEquals(1, container.getGhosts().size());
    }
}