package com.domain.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@RequestMapping("/home")
	public String goIndex() {
		
		return "detalle";
	}
	
	@RequestMapping("/")
	public String goDetalle(Model model) {
		model.addAttribute("msg","Mensaje desde indexController to index.jsp");
		
		return "index";
	}
}
