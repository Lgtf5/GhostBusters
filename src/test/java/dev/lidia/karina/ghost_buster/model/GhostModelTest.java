package dev.lidia.karina.ghost_buster.model;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GhostModelTest {

   private GhostModel ghost;
   
   @BeforeEach
   void setUp(){
    ghost = new GhostModel(1, "Casper", "Friendly", "High", "05-02-2025", "Change apparence", "Low");
   }

    @Test
    void testGetId() {
        assertEquals(1, ghost.getId());
    }

    @Test
    void testGetName(){
        assertEquals("Casper", ghost.getName());
    }

    @Test
    void testGetGhostClass(){
        assertEquals("Friendly", ghost.getGhostClass());
    }

    @Test
    void testDangerLevel(){
        assertEquals("High", ghost.getDangerLevel());
    }

    @Test
    void testCaptureDate(){
        assertEquals("05-02-2025", ghost.getCaptureDate());
    }

    @Test
    void testHability(){
        assertEquals("Change apparence", ghost.getHability());
    }

    @Test
    void testAfinity(){
        assertEquals("Low", ghost.getAfinity());
    }




}