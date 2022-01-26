package com.prueba.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.prueba.models.PaginacionResponse;
import com.prueba.models.PersonaReestructuradaModel;

@Service
@Configuration
@PropertySource({"classpath:application.properties"})
public class PruebaServiceImpl implements IPruebaService{

	@Value("${restClient.url}")
	private String url;
	
	@Override
	public PaginacionResponse obtenerInfoApi() {
		ResponseEntity<PaginacionResponse> personaModelEntity = null;
		
		try {
			RestTemplate restTemplate = new RestTemplate();
			personaModelEntity = restTemplate.getForEntity(url, PaginacionResponse.class);
			
		}catch(Exception e){
			System.out.println("Error: "+e);
		}
		return (PaginacionResponse) personaModelEntity.getBody();
	}

	@Override
	public List<PersonaReestructuradaModel> reestructurarInfo(PaginacionResponse data) {

		List<PersonaReestructuradaModel> dataReestructurada = new ArrayList<>();
		
		data.getData().forEach(e -> {
			PersonaReestructuradaModel persona = new PersonaReestructuradaModel();

			persona.setEmail(e.getEmail());
			persona.setId(e.getId());
			persona.setLast_name(e.getLast_name());
			
			dataReestructurada.add(persona);
		});
		
		System.out.println("LIsta: "+dataReestructurada);
		return dataReestructurada;
	}

}
