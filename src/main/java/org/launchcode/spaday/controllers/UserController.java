package org.launchcode.spaday.controllers;

import org.launchcode.spaday.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "User")
public class UserController {

    @GetMapping("user")
    public String displayAddUserForm(){
        return "user/add";
    }

    @PostMapping("user")
    public String processAddUserForm(Model model, @ModelAttribute User user, String verify) {
        if (verify == user.getPassword()){
            return "user/index.html";
        }
        return "user/add.html";
    }


}
