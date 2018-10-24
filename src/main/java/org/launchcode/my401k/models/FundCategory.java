package org.launchcode.my401k.models;


import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class FundCategory {

    @Id
    private int id;

    private String type;


    public FundCategory(Integer id, String type) {
        this.id = id;
        this.type = type;
    }


    public FundCategory() { }


    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public void setType(String name) {
        this.type = type;
    }

}