package br.matos.spring01.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // responde a requisiçoes no format REST
@CrossOrigin("*") // as requisiçoes podem vir de qq origem
@RequestMapping("/inicio")
public class Hello {
    
    @GetMapping("/hello") // uri e verbo (http) que este metodo responde
    public String hello(){
        return "Olá mundo!";
    }

    @PostMapping("/hello")
    public String hello2(){
        return "ola mundo com Post";
    }

}
