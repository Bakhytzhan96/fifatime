package kz.kaznitu.lessons.mod;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Club{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String label;
    private String description;

    public Club(){
        super();
    }

    public Club(int id, String label, String description){
        this.id=id;
        this.label=label;
        this.description=description;
    }
    public Club(String label,String description){
        this.label=label;
        this.description=description;
    }

    public int getId(){
        return id;
    }
    public void setId(){
        this.id=id;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description){
        this.description=description;
    }

    public String getLabel() {
        return label;
    }
    public void setLabel(String label){
        this.label=label;
    }
}