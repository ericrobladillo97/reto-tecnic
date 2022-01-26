package com.prueba.controllers;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;

import com.prueba.models.PersonaReestructuradaModel;

@Configuration
@PropertySource({"classpath:application.properties"})
public class PruebaControllerTest {

	@Autowired
	private MockMvc mvc;
	
	private List<PersonaReestructuradaModel> listaReestructurada;
	
	@BeforeEach
	void setUp() {
		MockitoAnnotations.openMocks(this);
		
		
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
//	void obtenerData() throws Exception{
//		RequestBuilder request = post("/reestructurado");
//		MvcResult result = mvc.perform(request).andReturn();
//		assertEquals(listaReestructurada, result.getResponse());
//	}
}
