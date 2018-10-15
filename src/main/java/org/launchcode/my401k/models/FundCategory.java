package org.launchcode.my401k.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;



@Entity
public class FundCategory {

    @Id
    @GeneratedValue
    private int id;

    private String name;


    public FundCategory(int id, String name) {
        this.id = id;
        this.name = name;
    }



    public FundCategory() { }



    public void setFundCategory(FundCategory newFundCategory) {
    }



    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}