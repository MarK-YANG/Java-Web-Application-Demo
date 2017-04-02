package sample.data.jpa.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by mark on 4/2/17.
 */
@Entity
@Table(name = "roster")
public class Roster implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String email;


    protected Roster() {
    }

    public Roster(String name, String email){
        this.name = name;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString(){
        return getId() + "," + getName() + "," + getEmail();
    }
}
