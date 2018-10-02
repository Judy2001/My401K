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
    static ArrayList<String> investmentChoices = new ArrayList<>();


    @RequestMapping(value = "display_form", method = RequestMethod.GET)
    public String displayInvestmentChoicesForm(Model model) {

        model.addAttribute("title", "My 401k");
        model.addAttribute("assetAllocation", assetAllocation);
        model.addAttribute("bonds", bonds);
        model.addAttribute("global", global);
        model.addAttribute("largeCap", largeCap);
        model.addAttribute("midCap", midCap);
        model.addAttribute("smallCap", smallCap);
        model.addAttribute("specialty", specialty);
        model.addAttribute("stableValue", stableValue);


        return "investment_choices/display_form";

    }


    @RequestMapping(value = "process_form", method = RequestMethod.POST)
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