package com.travel_agency.travel_agency.controllers;

import com.travel_agency.travel_agency.models.ClientInfo;
import com.travel_agency.travel_agency.repo.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @Autowired
    private ClientRepository clientRepository;

    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("title", "Main page");
        return "sign-in";
    }
    @PostMapping("/")
    public String getUserInfo(@RequestParam String First_Name, @RequestParam String Second_Name, @RequestParam String Email, @RequestParam String Pass, Model model){
        ClientInfo client = new ClientInfo(First_Name, Second_Name, Email, Pass);
        clientRepository.save(client);
        return "redirect:/main-page";
    }
}
