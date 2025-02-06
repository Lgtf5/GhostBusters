package dev.lidia.karina.ghost_buster.model; 

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ContainerTest {

    @Test
    @DisplayName ("create the list of Ghost")
    void testCreateList() {
        Container container = new Container();
        container.createList();
        assertThat (container.addGhost(), contains ("casper"));

    }



}
