package com.nubons.nnp.sso.abs.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
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
@Table(name = "api_route")
@NamedQuery(name = "ApiRoute.findAll", query = "SELECT a FROM ApiRoute a")
@ToString
public class ApiRoute extends AbstractBaseEntity implements Serializable {
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
	
	@Column(name = "created_on")
    private Timestamp createdOn;
	
	@Column(name = "updated_on")
    private Timestamp updatedOn;

	@Column(name = "env_code")
	private String envCode;
	
	// bi-directional many-to-one association to ApiRegistry
	@ManyToOne
	@JoinColumn(name = "apiid", insertable=false, updatable=false)
	private ApiRegistry apiRegistry;
	
	@PrePersist
    protected void onCreate() {
		createdOn = updatedOn = new Timestamp(System.currentTimeMillis());
    }

    @PreUpdate
    protected void onUpdate() {
    	updatedOn = new Timestamp(System.currentTimeMillis());
    }

}