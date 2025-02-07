package dev.lidia.karina.ghost_buster.model;

public class SimulatedGhost {
    private int id;
    private String name;
    private String type;
    private String level;
    private String date;
    private String ability;
    private String afinity;

    public SimulatedGhost(int id, String name, String type, String level, String date, String ability, String afinity) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.level = level;
        this.date = date;
        this.ability = ability;
        this.afinity = afinity;
    }

    // Getters y setters
    public void getId() { System.out.println(id); }
    
    public void getName() { System.out.println(name); }
    public void setName(String name) { this.name = name; }

    public void getType() { System.out.println(type); }
    public void setType(String type) { this.type = type; }

    public void getLevel() { System.out.println(level); }
    public void setLevel (String level) { this.level = level; }

    public void getDate() { System.out.println(date); }
    public void setDate(String date) { this.date = date; }

    public void getAbility() { System.out.println(ability); }
    public void setAbililty(String ability) { this.ability = ability; }

    public void getAfinity() { System.out.println(afinity); }
    

}
