package dev.lidia.karina.ghost_buster.model; 

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
        @DisplayName ("add ghost at list")
        public void testAddGhost_ListNotEmpty() {
            String ghost = "Ghost1";
            container.addGhost(ghost);
        }
    
    



}
