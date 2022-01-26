package com.prueba.controllers;
import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.models.PaginacionResponse;
import com.prueba.models.PersonaReestructuradaModel;
import com.prueba.services.IPruebaService;


public @RestController class pruebaController {

	
	
	private IPruebaService pruebaService;
	
	public pruebaController(IPruebaService pruebaService) {
		this.pruebaService = pruebaService;
	}
	
	@PostMapping("/reestructurado")
	public List<PersonaReestructuradaModel> obtenerData() {
		PaginacionResponse data = pruebaService.obtenerInfoApi();

		return pruebaService.reestructurarInfo(data);
		

	}
	
}
