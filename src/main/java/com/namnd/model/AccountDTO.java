package com.namnd.model;

import lombok.Getter;
import lombok.Setter;


public class AccountDTO {
	private String name;
	
	private String email;


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
