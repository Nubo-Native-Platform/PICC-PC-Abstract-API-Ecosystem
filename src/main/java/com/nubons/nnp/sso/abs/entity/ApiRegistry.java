package com.nubons.nnp.sso.abs.entity;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/**
 * The persistent class for the api_registry database table.
 * 
 */
@Getter
@Setter
@Entity
@Table(name = "api_registry")
@NamedQuery(name = "ApiRegistry.findAll", query = "SELECT a FROM ApiRegistry a")
public class ApiRegistry extends AbstractBaseEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
	private String apiid;

	@Column(name = "api_description")
	private String apiDescription;

	@Column(name = "api_group")
	private String apiGroup;

	@Column(name = "api_name")
	private String apiName;

	@Column(name = "api_param1")
	private String apiParam1;

	@Column(name = "api_param2")
	private String apiParam2;

	@Column(name = "api_param3")
	private String apiParam3;

	@Column(name = "api_param4")
	private String apiParam4;

	@Column(name = "api_param5")
	private String apiParam5;

	@Column(name = "api_protocol")
	private String apiProtocol;

	@Column(name = "api_status")
	private String apiStatus;

	@Column(name = "api_subgroup")
	private String apiSubgroup;
	
	@Column(name="srid")
	private String srid;
	
	@Column(name="uri")
	private String uri;

	@Column(name="env_code")
	private String envCode;
	
	@ManyToOne
	@JoinColumn(name = "provid")
	private ApiServiceProvider apiServiceProvider;
	
	
	// bi-directional many-to-one association to ApiRegistry
	@ManyToOne
	@JoinColumn(name = "pr_apiid")
	private ApiRegistry apiRegistry;

	// bi-directional many-to-one association to ApiRegistry
	@OneToMany(mappedBy = "apiRegistry")
	private List<ApiRegistry> apiRegistries;

	
	// bi-directional many-to-one association to ApiRoute
	@OneToMany(mappedBy = "apiRegistry", fetch = FetchType.LAZY)
	private List<ApiRoute> apiRoutes;
	
	// bi-directional many-to-one association to ApiRouteDraft
	@OneToMany(mappedBy = "apiRegistry", fetch = FetchType.LAZY)
	private List<ApiRouteDraft> apiRouteDrafts;

	public ApiRegistry() {

	}

	public ApiRegistry addApiRegistry(ApiRegistry apiRegistry) {
		getApiRegistries().add(apiRegistry);
		apiRegistry.setApiRegistry(this);

		return apiRegistry;
	}

	public ApiRegistry removeApiRegistry(ApiRegistry apiRegistry) {
		getApiRegistries().remove(apiRegistry);
		apiRegistry.setApiRegistry(null);

		return apiRegistry;
	}


	@Override
	public String toString() {
		return "ApiRegistry [apiid=" + apiid + ", apiDescription=" + apiDescription + ", apiGroup=" + apiGroup
				+ ", apiName=" + apiName + ", apiParam1=" + apiParam1 + ", apiParam2=" + apiParam2 + ", apiParam3="
				+ apiParam3 + ", apiParam4=" + apiParam4 + ", apiParam5=" + apiParam5 + ", apiProtocol=" + apiProtocol
				+ ", apiStatus=" + apiStatus + ", apiSubgroup=" + apiSubgroup + ", srid=" + srid + ", uri=" + uri
				+ ", apiServiceProvider=" + apiServiceProvider + ", apiRegistry=" + apiRegistry + ", apiRegistries="
				+ apiRegistries + "]";
	}

}