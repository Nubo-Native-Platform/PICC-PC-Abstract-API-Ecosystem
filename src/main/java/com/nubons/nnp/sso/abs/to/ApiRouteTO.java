package com.nubons.nnp.sso.abs.to;

import java.io.Serializable;

import com.nubons.nnp.sso.abs.entity.ApiRoute;
import com.fasterxml.jackson.databind.JsonNode;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * The persistent class for the api_route database table.
 * 
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
public class ApiRouteTO extends AbstractBaseTO implements Serializable {

	private static final long serialVersionUID = 3578454999577694327L;
	
	private String apiRouteId;
	
	@NotBlank
	private String name;

	private JsonNode filter;

	private JsonNode predicate;
	
	@NotBlank
	private String url;
	
	private String apiid;

	private String envCode;

	public static ApiRouteTO fromEntity(ApiRoute ent) {
		ApiRouteTO to = new ApiRouteTO();
		to.setApiRouteId(ent.getApiRouteId());
		to.setName(ent.getName());
		to.setFilter(toJSON(ent.getFilter()));
		to.setPredicate(toJSON(ent.getPredicate()));
		to.setUrl(ent.getUrl());
		to.setApiid(ent.getApiid());
		to.setEnvCode(ent.getEnvCode());
		return to;
	}

	public static ApiRoute toEntity(ApiRouteTO to) {
		ApiRoute ent = new ApiRoute();
		ent.setApiRouteId(to.getApiRouteId());
		ent.setName(to.getName());
		ent.setFilter(fromJSON(to.getFilter()));
		ent.setPredicate(fromJSON(to.getPredicate()));
		ent.setUrl(to.getUrl());
		ent.setApiid(to.getApiid());
		ent.setEnvCode(to.getEnvCode());
		return ent;
	}
	
	public static void copyToEntity(ApiRouteTO to, ApiRoute ent) {
		ent.setApiRouteId(to.getApiRouteId());
		ent.setName(to.getName());
		ent.setFilter(fromJSON(to.getFilter()));
		ent.setPredicate(fromJSON(to.getPredicate()));
		ent.setUrl(to.getUrl());
		ent.setApiid(to.getApiid());
	}
	
}