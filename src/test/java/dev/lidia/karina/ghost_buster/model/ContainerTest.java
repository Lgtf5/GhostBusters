package dev.lidia.karina.ghost_buster.model; 

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

public class ContainerTest {
    private Container container;
    private SimulatedGhost ghost1;
    private SimulatedGhost ghost2;
    private List<SimulatedGhost> ghosts;

    @BeforeEach
    public void setUp() {
        ghosts = new ArrayList<>();
        container = new Container();
        ghost1 = new SimulatedGhost(1, "Fantasma1", "TipoA", "Nivel1", "2025-01-01", "Habilidad1", "Afinidad1");
        ghost2 = new SimulatedGhost(2, "Fantasma2", "TipoB", "Nivel2", "2025-01-02", "Habilidad2", "Afinidad2");
    }

    @Test
    public void testAddGhost() {
        container.addGhost(ghost1);
        assertEquals(1, container.getGhosts().size());
    }

    @Test
    public void testGhostList() {
        Container container = new Container();
        container.addGhost(new SimulatedGhost(1, "Fantasma1", "TipoA", "Nivel1", "2025-01-01", "Habilidad1", "Afinidad1"));
        container.addGhost(new SimulatedGhost(2, "Fantasma2", "TipoB", "Nivel2", "2025-01-02", "Habilidad2", "Afinidad2"));
        container.ghostList(); 
    }

    @Test
    public void testRemoveGhost() {
        container.addGhost(ghost1);
        container.removeGhost(1);
        assertEquals(0, container.getGhosts().size());
    }

}