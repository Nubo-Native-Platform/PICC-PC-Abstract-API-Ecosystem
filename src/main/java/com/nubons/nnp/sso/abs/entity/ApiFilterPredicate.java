package com.nubons.nnp.sso.abs.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * The persistent class for the api_filter_predicate database table.
 * 
 */
@Getter
@Setter
@Entity
@Table(name = "api_filter_predicate")
@NamedQuery(name = "ApiFilterPredicate.findAll", query = "SELECT a FROM ApiFilterPredicate a")
@ToString
public class ApiFilterPredicate extends AbstractBaseEntity implements Serializable {
	/**
	* 
	*/
	private static final long serialVersionUID = 2434862185838906914L;

	@Id
	@Column(name = "name")
	private String name;

	@Column(name = "type")
	private String type;

	@Column(name = "custom")
	private boolean custom;

	@Column(name = "status")
	private String status;

}
