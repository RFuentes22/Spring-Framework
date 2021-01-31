package com.domain.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/productos")
public class ProductosController {

	@RequestMapping("/list")
	public String goListProductos(Model model) {
		List<String> categories = new ArrayList<String>();
		categories.add("vestimenta");
		categories.add("jewerly");
		categories.add("games");
		categories.add("sprays");
		
		model.addAttribute("categoryList",categories);
		
		List<String> productos = new ArrayList<String>();
		productos.add("Ring");
		productos.add("GTAV");
		productos.add("Tshirt");
		productos.add("Adidas");
		
		model.addAttribute("productList",productos);
		
		return "productos/listProductos";
	}
}
