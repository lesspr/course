package com.egartech.course.controller;

import com.egartech.course.model.Client;
import com.egartech.course.service.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class ClientController {
    private final ClientService clientService;

    @GetMapping("/client-register")
    public String clientRegister(Model model) {
        List<Client> clients = clientService.listClientRegistry();
        model.addAttribute("clients", clients);
        return "clients";
    }

    @GetMapping("/client/{id}")
    public String clientInfo(@PathVariable Long id, Model model) {
        model.addAttribute("client", clientService.getClientById(id));
        return "client-info";
    }

}
