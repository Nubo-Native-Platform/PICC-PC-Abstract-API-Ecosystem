package com.nubons.nnp.sso.abs.entity;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * The persistent class for the api_service_provider database table.
 *
 */
@Getter
@Setter
@Entity
@Table(name = "api_service_provider")
@NamedQuery(name = "ApiServiceProvider.findAll", query = "SELECT a FROM ApiServiceProvider a")
@ToString
public class ApiServiceProvider extends AbstractBaseEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private String provid;

	@Column(name = "prov_category")
	private String provCategory;

	@Column(name = "prov_description")
	private String provDescription;

	@Column(name = "prov_name")
	private String provName;

	@Column(name = "prov_organization")
	private String provOrganization;

	@Column(name = "prov_param1")
	private String provParam1;

	@Column(name = "prov_param2")
	private String provParam2;

	@Column(name = "prov_param3")
	private String provParam3;

	@Column(name = "prov_param4")
	private String provParam4;

	@Column(name = "prov_param5")
	private String provParam5;

	@Column(name = "status")
	private String status;

	@Column(name = "env_code")
	private String envCode;

	@OneToMany(mappedBy = "apiServiceProvider")
	private List<ApiRegistry> apiRegistries;

	public ApiServiceProvider() {
	}



}