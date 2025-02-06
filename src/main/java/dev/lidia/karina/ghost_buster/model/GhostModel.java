package dev.lidia.karina.ghost_buster.model;

// Esta clase represnta un fantasma con todos sus atributos
public class GhostModel {

    private int id;
    private String name;
    private String ghostClass;
    private String dangerLevel;
    private String captureDate;
    private String ability;
    private String afinity;

    // Constructor para inicializar el objeto

    public GhostModel(int id, String name, String ghostClass, String dangerLevel, String captureDate, String ability,
            String afinity) {
        this.id = id;
        this.name = name;
        this.ghostClass = ghostClass;
        this.dangerLevel = dangerLevel;
        this.captureDate = captureDate;
        this.ability = ability;
        this.afinity = afinity;
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
}
