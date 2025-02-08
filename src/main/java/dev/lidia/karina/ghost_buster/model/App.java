package dev.lidia.karina.ghost_buster.model;

public final class App {
    private App() {
    }

    
    
    public class Main {
        public static void main(String[] args) {
            GhostContainer container = new GhostContainer();
            
            // Añadir fantasmas
            container.addGhost(new SimulatedGhost(1, "Fantasma1", "TipoA", "Nivel1", "2025-01-01", "Habilidad1", "Afinidad1"));
            container.addGhost(new SimulatedGhost(2, "Fantasma2", "TipoB", "Nivel2", "2025-01-02", "Habilidad2", "Afinidad2"));
            
            // Mostrar la lista de fantasmas
            container.ghostList();
        }
    }
        
    

    
}
