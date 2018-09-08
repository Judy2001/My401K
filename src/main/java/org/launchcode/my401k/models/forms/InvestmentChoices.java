package org.launchcode.my401k.models.forms;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.ArrayList;

@Entity
public class InvestmentChoices {

    @Id
    private int userId;

    private ArrayList assetAllocation;
    private ArrayList bonds;
    private ArrayList global;
    private ArrayList largeCap;
    private ArrayList midCap;
    private ArrayList smallCap;
    private ArrayList specialty;
    private ArrayList stableValue;
    private ArrayList choices;

    private int assetAllocationPercent;
    private int bondsPercent;
    private int globalPerecent;
    private int largeCapPercent;
    private int midCapPercent;
    private int smallCapPercent;
    private int specialtyPercent;
    private int stableValuePercent;
    private int totalPercent;

    public InvestmentChoices(ArrayList assetAllocation, ArrayList bonds, ArrayList global,
                             ArrayList largeCap, ArrayList midCap, ArrayList smallCap,
                             ArrayList specialty, ArrayList stableValue) {

        this.assetAllocation = assetAllocation;
        this.bonds = bonds;
        this.global = global;
        this.largeCap = largeCap;
        this.midCap = midCap;
        this.smallCap = smallCap;
        this.specialty = specialty;
        this.stableValue = stableValue;
    }

    public ArrayList getAssetAllocation() {
        return assetAllocation;
    }

    public ArrayList getBonds() {
        return bonds;
    }

    public ArrayList getGlobal() {
        return global;
    }

    public ArrayList getLargeCap() {
        return largeCap;
    }

    public ArrayList getMidCap() {
        return midCap;
    }

    public ArrayList getSmallCap() {
        return smallCap;
    }

    public ArrayList getSpecialty() {
        return specialty;
    }

    public ArrayList getStableValue() {
        return stableValue;
    }

}