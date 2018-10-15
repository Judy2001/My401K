package org.launchcode.my401k.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;



@Entity
public class FundCategory {

    @Id
    @GeneratedValue
    private int id;



    private String assetAllocation;
    private String bonds;
    private String global;
    private String largeCap;
    private String midCap;
    private String smallCap;
    private String specialty;
    private String stableValue;



    public FundCategory(int id, String assetAllocation, String bonds, String global,
                        String largeCap, String midCap, String smallCap, String specialty,
                        String stableValue) {
        this.id = id;
        this.assetAllocation = assetAllocation;
        this.bonds = bonds;
        this.global = global;
        this.largeCap = largeCap;
        this.midCap = midCap;
        this.smallCap = smallCap;
        this.specialty = specialty;
        this.stableValue = stableValue;
    }



    public FundCategory() { }



    public void setFundCategory(FundCategory newFundCategory) {
    }



    public int getId() {
        return id;
    }

    public String getAssetAllocation() {
        return assetAllocation;
    }

    public void setAssetAllocation(String assetAllocation) {
        this.assetAllocation = assetAllocation;
    }

    public String getBonds() {
        return bonds;
    }

    public void setBonds(String bonds) {
        this.bonds = bonds;
    }

    public String getGlobal() {
        return global;
    }

    public void setGlobal(String global) {
        this.global = global;
    }

    public String getLargeCap() {
        return largeCap;
    }

    public void setLargeCap(String largeCap) {
        this.largeCap = largeCap;
    }

    public String getMidCap() {
        return midCap;
    }

    public void setMidCap(String midCap) {
        this.midCap = midCap;
    }

    public String getSmallCap() {
        return smallCap;
    }

    public void setSmallCap(String smallCap) {
        this.smallCap = smallCap;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getStableValue() {
        return stableValue;
    }

    public void setStableValue(String stableValue) {
        this.stableValue = stableValue;
    }

}