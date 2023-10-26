package com.travel_agency.travel_agency.controllers;

import com.travel_agency.travel_agency.models.ClientInfo;
import com.travel_agency.travel_agency.repo.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Map;

@Controller
public class RegistrationController {
    @Autowired
    private ClientRepository clientRepo;
    @GetMapping("/registration")
    public String registration(){
        return "registration";
    }
    @PostMapping("/registration")
    public String addUser(ClientInfo client, Map<String, Object> model){
        ClientInfo clientFromDb = clientRepo.findByEmail(client.getEmail());
        if (clientFromDb != null){
            model.put("message", "User exist!");
            return "registration";
        }
        clientRepo.save(client);

        return "redirect:/login";
    }

}
