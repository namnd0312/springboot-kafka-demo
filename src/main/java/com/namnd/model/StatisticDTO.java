package com.namnd.model;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class StatisticDTO {
	
	private String message;
	
	private Date creationDate;

	public StatisticDTO(String message, Date creationDate) {
		super();
		this.message = message;
		this.creationDate = creationDate;
	}

	public StatisticDTO() {
		super();
	}
	
	

}
