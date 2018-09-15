package org.launchcode.my401k.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller
@RequestMapping(value = "investment_choices")
public class InvestmentChoicesController {

    static ArrayList<String> assetAllocation = new ArrayList<>();
    static ArrayList<String> bonds = new ArrayList<>();
    static ArrayList<String> global = new ArrayList<>();
    static ArrayList<String> largeCap = new ArrayList<>();
    static ArrayList<String> midCap = new ArrayList<>();
    static ArrayList<String> smallCap = new ArrayList<>();
    static ArrayList<String> specialty = new ArrayList<>();
    static ArrayList<String> stableValue = new ArrayList<>();
    static ArrayList<String> choices = new ArrayList<>();


    @RequestMapping(value = "display_form", method = RequestMethod.GET)
    public String displayInvestmentChoicesForm(Model model) {

        model.addAttribute("title", "My 401k");

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

        model.addAttribute("assetAllocation", assetAllocation);


        bonds.add("ABHighIncome");
        bonds.add("BairdAggregateBondInst");
        bonds.add("LordAbbottTotalReturn");

        model.addAttribute("bonds", bonds);


        global.add("VanDevelopedMrktsIdxAdmr");
        global.add("DVAEmrgngMrktsCoreEquity");
        global.add("HartfordIntlOpportunities");

        model.addAttribute("global", global);


        largeCap.add("SchwabSandP500Index");
        largeCap.add("ABLargeCapGrowth");
        largeCap.add("DFAUSLargeCapValue");

        model.addAttribute("largeCap", largeCap);


        midCap.add("HartfordMidCap");
        midCap.add("VandguardMidCapIndexAdm");
        midCap.add("HarborMidCapValue");

        model.addAttribute("midCap", midCap);


        smallCap.add("SchwabSmallCapIndex");
        smallCap.add("DFAUSTargetedValue");
        smallCap.add("JanusTritonN");

        model.addAttribute("smallCap", smallCap);


        specialty.add("VanguardRealEstateIdxAdmr");

        model.addAttribute("specialty", specialty);


        stableValue.add("FedCapitalPreservation");

        model.addAttribute("stableValue", stableValue);


        return "investment_choices/display_form";

    }

    @RequestMapping(value = "display_form", method = RequestMethod.POST)
    public String processInvestmentChoicesForm(@RequestParam int userId, @RequestParam ArrayList<String> assetAllocation,
                                               @RequestParam ArrayList<String> bonds,
                                               @RequestParam ArrayList<String> global,
                                               @RequestParam ArrayList<String> largeCap,
                                               @RequestParam ArrayList<String> midCap,
                                               @RequestParam ArrayList<String> smallCap,
                                               @RequestParam ArrayList<String> specialty,
                                               @RequestParam ArrayList<String> stableValue,
                                               Model model) {

        return "investment_choices/process_form";

    }

}
