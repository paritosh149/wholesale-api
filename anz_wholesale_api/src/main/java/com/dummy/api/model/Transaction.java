package com.dummy.api.model;

import javax.persistence.*;

@Entity
public class Transaction {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private long description;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getDescription() {
		return description;
	}

	public void setDescription(long description) {
		this.description = description;
	}
	

}
