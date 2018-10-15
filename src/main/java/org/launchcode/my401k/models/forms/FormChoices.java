package org.launchcode.my401k.models.forms;

import java.util.ArrayList;


public class FormChoices {

    private ArrayList assetAllocation;
    private ArrayList bonds;
    private ArrayList global;
    private ArrayList largeCap;
    private ArrayList midCap;
    private ArrayList smallCap;
    private ArrayList specialty;
    private ArrayList stableValue;


    public FormChoices(ArrayList assetAllocation, ArrayList bonds, ArrayList global,
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


    public FormChoices() {
    }


    public ArrayList getAssetAllocation() {
        return assetAllocation;
    }

    public void setAssetAllocation(ArrayList assetAllocation) {
        this.assetAllocation = assetAllocation;
    }

    public ArrayList getBonds() {
        return bonds;
    }

    public void setBonds(ArrayList bonds) {
        this.bonds = bonds;
    }

    public ArrayList getGlobal() {
        return global;
    }

    public void setGlobal(ArrayList global) {
        this.global = global;
    }

    public ArrayList getLargeCap() {
        return largeCap;
    }

    public void setLargeCap(ArrayList largeCap) {
        this.largeCap = largeCap;
    }

    public ArrayList getMidCap() {
        return midCap;
    }

    public void setMidCap(ArrayList midCap) {
        this.midCap = midCap;
    }

    public ArrayList getSmallCap() {
        return smallCap;
    }

    public void setSmallCap(ArrayList smallCap) {
        this.smallCap = smallCap;
    }

    public ArrayList getSpecialty() {
        return specialty;
    }

    public void setSpecialty(ArrayList specialty) {
        this.specialty = specialty;
    }

    public ArrayList getStableValue() {
        return stableValue;
    }

    public void setStableValue(ArrayList stableValue) {
        this.stableValue = stableValue;
    }

    public FormChoices createInvestmentChoices() {

        FormChoices formChoices = new FormChoices();
        formChoices.setAssetAllocation(this.assetAllocation);
        formChoices.setBonds(this.bonds);
        formChoices.setGlobal(this.global);
        formChoices.setLargeCap(this.largeCap);
        formChoices.setMidCap(this.midCap);
        formChoices.setSmallCap(this.smallCap);
        formChoices.setSpecialty(this.specialty);
        formChoices.setStableValue(this.stableValue);


        assetAllocation.add("VanTargetRetirement2020Inv");
        assetAllocation.add("VanTargetRetirement2025Inv");
        assetAllocation.add("VanTargetRetirement2030Inv");
        assetAllocation.add("VanTargetRetirement2035Inv");
        assetAllocation.add("VanTargetRetirement2040Inv");
        assetAllocation.add("VanTargetRetirement2045Inv");
        assetAllocation.add("VanTargetRetirement2050Inv");
        assetAllocation.add("VanTargetRetirement2055Inv");
        assetAllocation.add("VanTargetRetirement2060Inv");
        assetAllocation.add("VanTargetRetirementIncInv");
        assetAllocation.add("VanguardStarInv");

        bonds.add("ABHighIncome");
        bonds.add("BairdAggregateBondInst");
        bonds.add("LordAbbottTotalReturn");

        global.add("VanDevelopedMrktsIdxAdmr");
        global.add("DVAEmrgngMrktsCoreEquity");
        global.add("HartfordIntlOpportunities");

        largeCap.add("SchwabSandP500Index");
        largeCap.add("ABLargeCapGrowth");
        largeCap.add("DFAUSLargeCapValue");

        midCap.add("HartfordMidCap");
        midCap.add("VandguardMidCapIndexAdm");
        midCap.add("HarborMidCapValue");

        smallCap.add("SchwabSmallCapIndex");
        smallCap.add("DFAUSTargetedValue");
        smallCap.add("JanusTritonN");

        specialty.add("VanguardRealEstateIdxAdmr");

        stableValue.add("FedCapitalPreservation");

        return (formChoices);
    }

}
