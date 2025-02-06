package dev.lidia.karina.ghost_buster.model;


// Esta clase represnta un fantasma con todos sus atributos
public class GhostModel {

	private int id;
    private String name;
    private String ghostClass;
    private String dangerLevel;
    private String captureDate;
    private String hability;
    private String afinity;
   
    // Constructor para inicializar el objeto
    
    public GhostModel(int id, String name, String ghostClass,String dangerLevel, String captureDate, String hability, String afinity){
        this.id = id;
        this.name = name;
        this.ghostClass = ghostClass;
        this.dangerLevel = dangerLevel;
        this.captureDate = captureDate;
        this.hability = hability;
        this.afinity = afinity;
    }


    public int getId(){
        return id;
    }
    
   


}
