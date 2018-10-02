package org.launchcode.my401k.controllers;

import org.launchcode.my401k.models.data.UserChoicesDao;
import org.launchcode.my401k.models.data.UserDao;
import org.launchcode.my401k.models.forms.UserChoices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping(value = "userChoices")
public class UserChoicesController {

    @Autowired
    UserDao userDao;

    @Autowired
    UserChoicesDao userChoicesDao;

    private UserChoices userChoices;

    private int assetAllocationPercent;

    private int bondsPercent;

    private int globalPerecent;

    private int largeCapPercent;

    private int midCapPercent;

    private int smallCapPercent;

    private int specialtyPercent;

    private int stableValuePercent;

    private int totalPercent;


    @RequestMapping(value = "display_form", method = RequestMethod.GET)
    public String displayInvestmentChoicesForm(Model model) {

        model.addAttribute("title", "My 401k");
        model.addAttribute("userChoices", userChoicesDao.findAll());
        model.addAttribute(new UserChoices());

        return "investment_choices/display_form";
    }


    @RequestMapping(value = "process_form", method = RequestMethod.POST)
    public String processInvestmentChoicesForm(Model model) {

        userChoicesDao.save(userChoices);
        return "investment_choices/process_form";
    }

}