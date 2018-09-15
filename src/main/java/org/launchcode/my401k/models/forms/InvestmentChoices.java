package org.launchcode.my401k.models.forms;

//import org.launchcode.my401k.models.UserChoices;

import java.util.ArrayList;

public class InvestmentChoices {


    private ArrayList assetAllocation;
    private ArrayList bonds;
    private ArrayList global;
    private ArrayList largeCap;
    private ArrayList midCap;
    private ArrayList smallCap;
    private ArrayList specialty;
    private ArrayList stableValue;


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


    public InvestmentChoices() { }


    public void setInvestmentChoices(InvestmentChoices investmentChoices) {
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