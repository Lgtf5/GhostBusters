package dev.lidia.karina.ghost_buster.model;

public class Ghost {
    private int id;
    private String name;
    private String type;
    private String level;
    private String date;
    private String ability;
    private String afinity;

    public Ghost(int id, String name, String type, String level, String date, String ability, String afinity) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.level = level;
        this.date = date;
        this.ability = ability;
        this.afinity = afinity;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getLevel() {
        return level;
    }

    public String getDate() {
        return date;
    }

    public String getAbility() {
        return ability;
    }

    public String getAfinity() {
    }

}
