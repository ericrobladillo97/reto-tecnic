package com.prueba.models;

public class PersonaReestructuradaModel {

	private int id;
	private String last_name;
	private String email;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public PersonaReestructuradaModel () {

	}
	
	public PersonaReestructuradaModel (int id, String last_name, String email) {
		this.id = id;
		this.last_name = last_name;
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "id: "+id+"- last_name: "+last_name+"- email: "+email;
	}
}
