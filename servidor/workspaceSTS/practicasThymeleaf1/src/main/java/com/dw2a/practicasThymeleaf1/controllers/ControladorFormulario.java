package com.dw2a.practicasThymeleaf1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ControladorFormulario {

	@RequestMapping("formulario")
	public String formulario(Model modelo) {

		return "formulario";
	}

	@RequestMapping(value = "formulario", method = RequestMethod.POST)
	public String datosFormulario(Model modelo, @RequestParam String nombre, @RequestParam int nacido,
			@RequestParam String hm) {
		
		modelo.addAttribute("nombre", nombre);
		modelo.addAttribute("nacido", nacido);
		modelo.addAttribute("hm", hm);

		return "datos_formulario";
	}
}
