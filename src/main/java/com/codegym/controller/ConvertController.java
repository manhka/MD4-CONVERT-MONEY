package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ConvertController {
@GetMapping("/")
    public String index(){
    return "index";
}
@PostMapping("/result")
    public void greeting(Model model, @RequestParam("usd") double usd){
double currency=usd*23000;
model.addAttribute("usd",usd);
model.addAttribute("result",currency);
}
}
