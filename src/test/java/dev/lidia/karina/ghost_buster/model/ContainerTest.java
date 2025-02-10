package dev.lidia.karina.ghost_buster.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

public class ContainerTest {
    private Container container;
    private Ghost ghost2;
    private Ghost ghost3;
    private List<Ghost> ghosts;

    @BeforeEach
    public void setUp() {
        ghosts = new ArrayList<>();
        container = new Container();
        ghost2 = new Ghost(2, "Fantasma1", "TipoA", "Nivel1", "2025-01-01", "Habilidad1", "Afinidad1");
        ghost3 = new Ghost(3, "Fantasma2", "TipoB", "Nivel2", "2025-01-02", "Habilidad2", "Afinidad2");
    }

    @Test
    public void testAddGhost() {
        container.addGhost(ghost2);
        assertEquals(1, container.getGhosts().size());
    }

	@Test
    @DisplayName ("display list of ghosts captured")
	public void testGhostList() {
        Container container = new Container();
        container.addGhost(new Ghost(2, "Fantasma1", "TipoA", "Nivel1", "2025-01-01", "Habilidad1", "Afinidad1"));
        container.addGhost(new Ghost(3, "Fantasma2", "TipoB", "Nivel2", "2025-01-02", "Habilidad2", "Afinidad2"));
        container.ghostList(); 
        
	}

    @Test
    @DisplayName ("release ghost from ghost captured list")
    void testRemoveGhost() {
        container.addGhost();
        container.removeGhost();
        assertEquals(1, container.getGhosts().size());
    }
    }
