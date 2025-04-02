package sef.CtrOutPrint.api_CtrOutPrint.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping
    public String hello(){
        return "Olá Mundo! Este é um projeto de API para acesso aos dados do Outsourcing de Impressão da SEF";
    }
}
