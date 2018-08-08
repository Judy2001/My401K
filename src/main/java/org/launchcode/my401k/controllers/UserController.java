package org.launchcode.my401k.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @RequestMapping(value = "")
    @ResponseBody
    public String index() {
        return "my401k (Hello, world!)  Liftoff mentor Dave is awesome!";
    }

}
