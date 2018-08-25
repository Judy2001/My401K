package org.launchcode.my401k.models.forms;

import javax.persistence.Entity;

@Entity
public class InvestmentChoices {

    private Integer assetAllocationPct;

    private Integer bondsPct;

    private Integer globalPct;

    private Integer largeCapPct;

    private Integer midCapPct;

    private Integer smallCapPct;

    private Integer specialtyPct;

    private Integer stableValuePct;

    public InvestmentChoicesForm(assetAllocationPct, bondsPct, globalPct, largeCapPct, midCapPct; smallCapPct,
                                 specialtyPct, stableValuePct) {



    }

}
