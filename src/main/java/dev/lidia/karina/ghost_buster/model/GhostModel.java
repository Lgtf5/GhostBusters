package dev.lidia.karina.ghost_buster.model;

// Esta clase represnta un fantasma con todos sus atributos
public class GhostModel {
    private static int counter = 1;
    private int id;
    private String name;
    private String ghostClass;
    private String dangerLevel;
    private String captureDate;
    private String ability;
    private String afinity;

    // Constructor para inicializar el objeto

    public GhostModel(String name, String ghostClass, String dangerLevel, String captureDate, String ability,
            String afinity) {
        this.id = counter++;
        this.name = name;
        this.ghostClass = ghostClass;
        this.dangerLevel = dangerLevel;
        this.captureDate = captureDate;
        this.ability = ability;
        this.afinity = afinity;
    }

    // Método para resetear el contador
public static void resetCounter(){
    counter = 1;
}

    // Accedemos a los atributos a través de getters

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGhostClass() {
        return ghostClass;
    }

    public String getDangerLevel() {
        return dangerLevel;
    }

    public String getCaptureDate() {
        return captureDate;
    }

    public String getAbility() {
        return ability;
    }

    public String getAfinity() {
        return afinity;
    }

    @Override
    public String toString(){
        return String.format("%d %s %s %s %s %s %s", id, name, ghostClass, dangerLevel, captureDate, ability, afinity);
    }
}
