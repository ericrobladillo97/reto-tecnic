package com.prueba.services;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.prueba.models.PaginacionResponse;
import com.prueba.models.PersonaReestructuradaModel;

public interface IPruebaService {

	public PaginacionResponse obtenerInfoApi();
	
	public List<PersonaReestructuradaModel> reestructurarInfo(PaginacionResponse data);
}
