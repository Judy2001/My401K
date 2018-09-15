/*
package org.launchcode.my401k.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.ArrayList;

@Entity
public class UserChoices {

    @Id
    @GeneratedValue
    private int choicesId;

    @Id
    private int userId;

    @ManyToMany
    private ArrayList userChoices;

    private int assetAllocationPercent;
    private int bondsPercent;
    private int globalPerecent;
    private int largeCapPercent;
    private int midCapPercent;
    private int smallCapPercent;
    private int specialtyPercent;
    private int stableValuePercent;
    private int totalPercent;


    public UserChoices (ArrayList userChoices, int assetAllocationPercent,
                        int bondsPercent,  int globalPerecent, int largeCapPercent,
                        int midCapPercent, int smallCapPercent,
                        int specialtyPercent, int stableValuePercent,
                        int totalPercent) {

        this.userChoices = userChoices;
        this.assetAllocationPercent = assetAllocationPercent;
        this.bondsPercent = bondsPercent;
        this.globalPerecent = globalPerecent;
        this.largeCapPercent = largeCapPercent;
        this.midCapPercent = midCapPercent;
        this.smallCapPercent = smallCapPercent;
        this.specialtyPercent = specialtyPercent;
        this.stableValuePercent = stableValuePercent;
        this.totalPercent = totalPercent;

    }


    public UserChoices() { }


    public void setUserChoices(UserChoices userChoices) { }


    public int getChoicesId() {
        return choicesId;
    }

    public int getUserId() {
        return userId;
    }

    public ArrayList getUserChoices() {
        return userChoices;
    }

    public void setUserChoices(ArrayList userChoices) {
        this.userChoices = userChoices;
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

    public int getGlobalPerecent() {
        return globalPerecent;
    }

    public void setGlobalPerecent(int globalPerecent) {
        this.globalPerecent = globalPerecent;
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
*/
