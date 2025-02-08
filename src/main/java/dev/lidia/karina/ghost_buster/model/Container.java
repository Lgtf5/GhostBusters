package dev.lidia.karina.ghost_buster.model;

import java.util.ArrayList;

import java.util.List;




import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
import java.util.stream.Collectors;

public class Container {
    private List<SimulatedGhost> ghosts;

    public Container() {
        ghosts = new ArrayList<>();;
    }


    public void addGhost(SimulatedGhost ghost) {
        ghosts.add(ghost);
    }
   
    public void ghostList() {
        if (ghosts.isEmpty()) {
            System.out.println("No hay fantasmas capturados.");
            return;
        } 
    
    System.out.println("\n=== Lista de Fantasmas Capturados ===");
    ghosts.forEach(ghost -> {
        System.out.println("ID: " + ghost.getId());
        System.out.println("Nombre: " + ghost.getName());
        System.out.println("Tipo: " + ghost.getType());
        System.out.println("Nivel: " + ghost.getLevel());
        System.out.println("Fecha: " + ghost.getDate());
        System.out.println("Habilidad: " + ghost.getAbility());
        System.out.println("Afinidad: " + ghost.getAfinity());
        System.out.println("----------------------------------------");
        });
    }
    public List<SimulatedGhost> getGhosts() {
    return new ArrayList<>(ghosts);
    }
    public void removeGhost(int id) {
        ghosts.removeIf(ghost -> ghost.getId() == id);
    }
}
   










