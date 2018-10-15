package org.launchcode.my401k.controllers;

import org.launchcode.my401k.models.data.UserDao;
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


    @RequestMapping(value = "display_form", method = RequestMethod.GET)
    public String displayInvestmentChoicesForm(Model model) {

        model.addAttribute("title", "My 401k");

        return "investment_choices/display_form";
    }


    @RequestMapping(value = "process_form", method = RequestMethod.POST)
    public String processInvestmentChoicesForm(Model model) {

        return "investment_choices/process_form";
    }

}
