package com.prueba.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PaginacionResponse {
	
	@JsonProperty("page")
	private int page;	
	@JsonProperty("per_page")
	private int perPage;
	@JsonProperty("total")
	private int total;
	@JsonProperty("total_pages")
	private int totalPages;
	@JsonProperty("data")
	private List<PersonaModel> data;
	
	
	
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getPerPage() {
		return perPage;
	}
	public void setPerPage(int perPage) {
		this.perPage = perPage;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getTotalPages() {
		return totalPages;
	}
	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}
	public List<PersonaModel> getData() {
		return data;
	}
	public void setData(List<PersonaModel> data) {
		this.data = data;
	}
}
