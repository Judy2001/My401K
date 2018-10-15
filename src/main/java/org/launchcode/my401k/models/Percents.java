package org.launchcode.my401k.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;



@Entity
public class Percents {

    @Id
    @GeneratedValue
    private int id;

    private int investmentPercent;

    private int specificFundId;

    private int userId;




    public Percents(int id, int investmentPercent, int specificFundId, int userId){

        this.id = id;
        this.investmentPercent = investmentPercent;
        this.specificFundId = specificFundId;
        this.userId = userId;

    }


    public Percents() { }



    public void setPercents(Percents newPercents) {
    }


    public int getId() {
        return id;
    }

    public int getSpecificFundId() {
        return specificFundId;
    }

    public int getUserId() {
        return userId;
    }

    public int getInvestmentPercent() {
        return investmentPercent;
    }

    public void setInvestmentPercent(int investmentPercent) {
        this.investmentPercent = investmentPercent;
    }

}