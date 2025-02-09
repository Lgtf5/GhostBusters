package dev.lidia.karina.ghost_buster.model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Container {
    private List<Ghost> ghosts;
    
    public Container() {
        this.ghosts = new ArrayList<>();
    }
    
    public List<Ghost> getGhosts() {
        return new ArrayList<>(ghosts);
    } 
    public void addGhost(Ghost ghost) {
        ghosts.add(ghost);
    } 
    public void ghostList() {
        
    }   
}
