package com.nubons.nnp.sso.abs.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * The persistent class for the api_route database table.
 * 
 */
@Getter
@Setter
@Entity
@Table(name = "api_route_draft")
@NamedQuery(name = "ApiRouteDraft.findAll", query = "SELECT a FROM ApiRouteDraft a")
@ToString
public class ApiRouteDraft extends AbstractBaseEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "api_route_id")
	private String apiRouteId;

	@Column(name = "route_name")
	private String name;

	private String filter;

	private String predicate;

	private String url;
	
	private String apiid;

	private String status;

	@Column(name = "env_code")
	private String envCode;
	
	// bi-directional many-to-one association to ApiRegistry
	@ManyToOne
	@JoinColumn(name = "apiid", insertable=false, updatable=false)
	private ApiRegistry apiRegistry;
	
	@Column(name = "scheduled_time")
	private Timestamp scheduledTime;
	
}