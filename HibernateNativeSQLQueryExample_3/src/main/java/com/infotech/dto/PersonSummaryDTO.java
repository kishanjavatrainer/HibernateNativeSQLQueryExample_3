package com.infotech.dto;

public class PersonSummaryDTO {

	private Number id;
    private String name;
    
	public Number getId() {
		return id;
	}
	public void setId(Number id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "PersonSummaryDTO [id=" + id + ", name=" + name + "]";
	}
}
