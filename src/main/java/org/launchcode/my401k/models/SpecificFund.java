package org.launchcode.my401k.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class SpecificFund {

    @Id
    @GeneratedValue
    private int id;

    private String name;

    private int fundCategoryId;



    public SpecificFund(int id, String name, int fundCatetoryId) {
    }



    public SpecificFund () { }



    public void setSpecificFund(SpecificFund newSpecificFund) {
    }



    public int getId() {
        return id;
    }

    public int getFundCategoryId() {
        return fundCategoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}