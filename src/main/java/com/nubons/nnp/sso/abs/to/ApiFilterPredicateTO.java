package com.nubons.nnp.sso.abs.to;

import java.io.Serializable;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class ApiFilterPredicateTO extends AbstractBaseTO implements Serializable {
	private static final long serialVersionUID = -2140957086074757946L;

	private String name;

	private String type;

	private boolean custom;

	private String status;

}
