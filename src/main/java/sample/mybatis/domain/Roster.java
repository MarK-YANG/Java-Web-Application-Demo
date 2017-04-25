package sample.mybatis.domain;

import java.io.Serializable;

/**
 * Created by mark on 4/2/17.
 */
public class Roster implements Serializable{

    private static final long serialVersionUID = 1L;

    private int id;

    private String name;

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
