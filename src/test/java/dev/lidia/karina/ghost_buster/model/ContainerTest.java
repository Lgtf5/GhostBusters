package dev.lidia.karina.ghost_buster.model; 

import java.util.ArrayList;

import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ContainerTest {
    private Container container;
    @BeforeEach
    void setUp() {
        container = new Container();
    }
    @Test
    public void testAddGhost() {
        SimulatedGhost ghost = new SimulatedGhost(1, "Fantasma1", "TipoA", "Nivel1", "2025-01-01", "Habilidad1", "Afinidad1");
        container.addGhost(ghost);
        container.getSize();
    }
}
