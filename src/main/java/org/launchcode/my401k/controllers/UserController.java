package org.launchcode.my401k.controllers;


import org.launchcode.my401k.models.Login;
import org.launchcode.my401k.models.Signup;
import org.launchcode.my401k.models.data.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;


@Controller
@RequestMapping(value = "user")
public class UserController {

    @Autowired
    UserDao userDao;


    @RequestMapping(value = "")
    public String index(Model model) {
        model.addAttribute("title", "My 401k");
        return "user/index";
    }


    @RequestMapping(value = "signup", method = RequestMethod.GET)
    public String displaySignupForm(Model model) {
        model.addAttribute("title", "My 401k");
        model.addAttribute("userIds", userDao.findAll());
        model.addAttribute(new Signup());
        return "user/signup";
    }

    @RequestMapping(value = "signup", method = RequestMethod.POST)
    public String processSignupForm(@ModelAttribute @Valid Signup newSignup,
                                    Errors errors, @RequestParam int userId, Model model) {

        if (errors.hasErrors()) {
            model.addAttribute("title", "My 401k");
            return "user/signup";
        }

        Signup newUser = userDao.findOne(userId);
        newSignup.setSignup(newUser);
        userDao.save(newSignup);
        return "redirect:/investment_choices/display_form";

    }


    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String displayLoginForm(Model model) {
        model.addAttribute("title", "My 401k");
        model.addAttribute("userIds", userDao.findAll());
        model.addAttribute(new Login());
        return "user/login";
    }

    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String processLoginForm(@ModelAttribute @Valid Login login, Errors errors,
                                   @RequestParam int userId, Model model) {

        if (errors.hasErrors()) {
            model.addAttribute("title", "My 401k");
            model.addAttribute("userId", userDao.findAll());
            return "user/login";
        }
        return "redirect:/investment_choices/display_form";
    }

}