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
    public int getId() { System.out.println(id);return id; }
    
    public String getName() { 
        System.out.println(name); 
        return name; 
    }
    public void setName(String name) { this.name = name; }

    public String getType() { System.out.println(type); return type;}
    public void setType(String type) { this.type = type; }

    public String getLevel() { System.out.println(level); return level;}
    public void setLevel (String level) { this.level = level; }

    public String getDate() { System.out.println(date); return date;}
    public void setDate(String date) { this.date = date; }

    public String getAbility() { System.out.println(ability); return ability; }
    public void setAbililty(String ability) { this.ability = ability; }

    public String getAfinity() { System.out.println(afinity); return afinity;}
    

}
