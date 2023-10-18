package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.dto.Clientes;

@Controller
public class IndexController {
    
    @GetMapping("/")
    public String viewHomePage(Model model) {
        List<Clientes> lista = new ArrayList<>();
        lista.add(new Clientes("30", "Fernando", "651654"));
        lista.add(new Clientes("40", "Mireya", "516516"));
        lista.add(new Clientes("50", "Fernanda", "65218"));
		 lista.add(new Clientes("60", "Fernanda 2 ", "65218"));
        model.addAttribute("listaCliente", lista);
        return "index";
    }
}
