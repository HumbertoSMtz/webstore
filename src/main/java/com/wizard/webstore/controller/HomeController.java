package com.wizard.webstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String welcome(Model model) {
		model.addAttribute("greeting", "Bienvenido a la tienda en linea!");
		model.addAttribute("tagline", "Navegue por nuestros productos");
		return "welcome";
	}
}