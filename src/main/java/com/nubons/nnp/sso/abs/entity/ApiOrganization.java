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
 * The persistent class for the api_consumer_org database table.
 * 
 */
@Getter
@Setter
@Entity
@Table(name = "api_organization")
@NamedQuery(name = "ApiOrganization.findAll", query = "SELECT a FROM ApiOrganization a")
@ToString
public class ApiOrganization extends AbstractBaseEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	// @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "org_id")
	private String orgId;

	@Column(name = "org_name")
	private String orgName;

	@Column(name = "org_type")
	private String orgType;

	public ApiOrganization() {
	}

}