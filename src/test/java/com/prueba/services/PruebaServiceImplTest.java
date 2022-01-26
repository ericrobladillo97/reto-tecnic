package com.prueba.services;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.prueba.models.PaginacionResponse;
import com.prueba.models.PersonaModel;
import com.prueba.models.PersonaReestructuradaModel;

@Configuration
@PropertySource({"classpath:application.properties"})
class PruebaServiceImplTest {

	@InjectMocks
	private PruebaServiceImpl pruebaService;

	private PaginacionResponse paginacionResponse;
	
	private List<PersonaModel> lista;
	
	private List<PersonaReestructuradaModel> listaReestructurada;
	
	@BeforeEach
	void setUp() {
		MockitoAnnotations.openMocks(this);
		lista = new ArrayList<PersonaModel>();
		
		paginacionResponse = new PaginacionResponse();
		paginacionResponse.setPage(1);
		paginacionResponse.setPerPage(6);
		paginacionResponse.setTotal(12);
		paginacionResponse.setTotalPages(2);
		
		lista.add(new PersonaModel(1,"george.bluth@reqres.in","George","Bluth","https://reqres.in/img/faces/1-image.jpg"));
		lista.add(new PersonaModel(2, "janet.weaver@reqres.in","Janet","Weaver","https://reqres.in/img/faces/2-image.jpg"));
		lista.add(new PersonaModel(3,"emma.wong@reqres.in","Emma","Wong","https://reqres.in/img/faces/3-image.jpg"));
		lista.add(new PersonaModel(4,"eve.holt@reqres.in","Eve","Holt","https://reqres.in/img/faces/4-image.jpg"));
		lista.add(new PersonaModel(5,"charles.morris@reqres.in","Charles","Morris","https://reqres.in/img/faces/5-image.jpg"));
		lista.add(new PersonaModel(6,"tracey.ramos@reqres.in","Tracey","Ramos","https://reqres.in/img/faces/6-image.jpg"));
		
		paginacionResponse.setData(lista);
		
		//------------------------
		listaReestructurada = new ArrayList<>();
		listaReestructurada.add(new PersonaReestructuradaModel(1,"Bluth","george.bluth@reqres.in"));
		listaReestructurada.add(new PersonaReestructuradaModel(2,"Weaver","janet.weaver@reqres.in"));
		listaReestructurada.add(new PersonaReestructuradaModel(3,"Wong","emma.wong@reqres.in"));
		listaReestructurada.add(new PersonaReestructuradaModel(4,"Holt","eve.holt@reqres.in"));
		listaReestructurada.add(new PersonaReestructuradaModel(5,"Morris","charles.morris@reqres.in"));
		listaReestructurada.add(new PersonaReestructuradaModel(6,"Ramos","tracey.ramos@reqres.in"));
	}
	
//	@Test
//	void obtenerInfoApi() {
//		PaginacionResponse pag = pruebaService.obtenerInfoApi();
//		Assertions.assertEquals(lista,pag);
//
//	}
	
//	@Test
//	void reestructurarInfo() {
//		List<PersonaReestructuradaModel> listaRees = pruebaService.reestructurarInfo(paginacionResponse);
//		Assertions.assertEquals(listaReestructurada,listaRees);
//	}
}
