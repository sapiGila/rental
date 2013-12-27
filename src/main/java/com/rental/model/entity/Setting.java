package com.rental.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="SETTING")
public class Setting {
	@Id
	@Column(name="ID", length=30)
	private String id;
	
	@Column(name="VALUE", columnDefinition = "text")
    private String value;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
