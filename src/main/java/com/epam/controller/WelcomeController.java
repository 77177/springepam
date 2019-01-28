package com.epam.controller;

import com.epam.model.Student;
import com.epam.model.Tutor;
import com.epam.model.User;
import com.epam.persistance.DAO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/welcome")
public class WelcomeController {


    private DAO dao;

    public WelcomeController(DAO dao) {
        this.dao = dao;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String welcome(Model model) {
        List<Tutor> userList = (List<Tutor>) dao.findAll();
        model.addAttribute("listOfUsers", userList);
        return "welcome";
    }
}
