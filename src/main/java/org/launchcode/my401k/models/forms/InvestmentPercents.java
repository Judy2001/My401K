package org.launchcode.my401k.models.forms;



public class InvestmentPercents {

    private int assetAllocationPercent;
    private int bondsPercent;
    private int globalPercent;
    private int largeCapPercent;
    private int midCapPercent;
    private int smallCapPercent;
    private int specialtyPercent;
    private int stableValuePercent;
    private int totalPercent;


    public InvestmentPercents (int assetAllocationPercent, int bondsPercent,
                               int globalPercent, int largeCapPercent, int midCapPercent,
                               int smallCapPercent, int specialtyPercent,
                               int stableValuePercent, int totalPercent) {

        this.assetAllocationPercent = assetAllocationPercent;
        this.bondsPercent = bondsPercent;
        this.globalPercent = globalPercent;
        this.largeCapPercent = largeCapPercent;
        this.midCapPercent = midCapPercent;
        this.smallCapPercent = smallCapPercent;
        this.specialtyPercent = specialtyPercent;
        this.stableValuePercent = stableValuePercent;
        this.totalPercent = totalPercent;

    }


    public InvestmentPercents() { }


    public InvestmentPercents createAssetAllocationPercent(InvestmentPercents assetAllocationPercent) {

            InvestmentPercents newAssetAllocationPercent = new InvestmentPercents();

            return (assetAllocationPercent);

        }


    public InvestmentPercents createBondsPercent(InvestmentPercents bondsPercent) {

        InvestmentPercents newBondsPercent = new InvestmentPercents();

        return (bondsPercent);

    }


    public InvestmentPercents createGlobalPercent(InvestmentPercents globalPercent) {

        InvestmentPercents newGlobalPercent = new InvestmentPercents();

        return (globalPercent);

    }


    public InvestmentPercents createLargeCapPercent(InvestmentPercents largeCapPercent) {

        InvestmentPercents newLargeCapPercent = new InvestmentPercents();

        return (largeCapPercent);

    }


    public InvestmentPercents createMidCapPercent(InvestmentPercents midCapPercent) {

        InvestmentPercents newMidCapPercent = new InvestmentPercents();

        return (midCapPercent);

    }


    public InvestmentPercents createSmallCapPercent(InvestmentPercents smallCapPercent) {

        InvestmentPercents newSmallCapPercent = new InvestmentPercents();

        return (smallCapPercent);

    }


    public InvestmentPercents createSpecialtyPercent(InvestmentPercents specialtyPercent) {

        InvestmentPercents newSpecialtyPercent = new InvestmentPercents();

        return (specialtyPercent);

    }


    public InvestmentPercents createStableValuePercent(InvestmentPercents stableValuePercent) {

        InvestmentPercents newStableValuePercent = new InvestmentPercents();

        return (stableValuePercent);

    }


    public InvestmentPercents createTotalPercent(InvestmentPercents totalPercent) {

        InvestmentPercents newTotalPercent = new InvestmentPercents();

        return (totalPercent);

    }



    public int getAssetAllocationPercent() {
        return assetAllocationPercent;
    }

    public void setAssetAllocationPercent(int assetAllocationPercent) {
        this.assetAllocationPercent = assetAllocationPercent;
    }

    public int getBondsPercent() {
        return bondsPercent;
    }

    public void setBondsPercent(int bondsPercent) {
        this.bondsPercent = bondsPercent;
    }

    public int getGlobalPercent() {
        return globalPercent;
    }

    public void setGlobalPercent(int globalPercent) {
        this.globalPercent = globalPercent;
    }

    public int getLargeCapPercent() {
        return largeCapPercent;
    }

    public void setLargeCapPercent(int largeCapPercent) {
        this.largeCapPercent = largeCapPercent;
    }

    public int getMidCapPercent() {
        return midCapPercent;
    }

    public void setMidCapPercent(int midCapPercent) {
        this.midCapPercent = midCapPercent;
    }

    public int getSmallCapPercent() {
        return smallCapPercent;
    }

    public void setSmallCapPercent(int smallCapPercent) {
        this.smallCapPercent = smallCapPercent;
    }

    public int getSpecialtyPercent() {
        return specialtyPercent;
    }

    public void setSpecialtyPercent(int specialtyPercent) {
        this.specialtyPercent = specialtyPercent;
    }

    public int getStableValuePercent() {
        return stableValuePercent;
    }

    public void setStableValuePercent(int stableValuePercent) {
        this.stableValuePercent = stableValuePercent;
    }

    public int getTotalPercent() {
        return totalPercent;
    }

    public void setTotalPercent(int totalPercent) {
        this.totalPercent = totalPercent;
    }

}