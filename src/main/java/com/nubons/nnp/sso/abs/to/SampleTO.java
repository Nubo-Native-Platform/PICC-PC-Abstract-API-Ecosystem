package com.nubons.nnp.sso.abs.to;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class SampleTO implements Serializable{

	private static final long serialVersionUID = 7849464210509183488L;
	private String id;
	private String name;
	
	public SampleTO(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public SampleTO() {
		super();
	}
	
	
	
}
