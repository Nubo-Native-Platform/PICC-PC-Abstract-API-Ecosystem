package com.nubons.nnp.sso.abs.to;

import java.io.Serializable;
import java.sql.Timestamp;

import com.nubons.nnp.sso.abs.entity.ApiRouteDraft;
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
public class ApiRouteDraftTO extends AbstractBaseTO implements Serializable {

	private static final long serialVersionUID = 3578454999577694327L;
	
	private String apiRouteId;
	
	@NotBlank
	private String name;

	private JsonNode filter;

	private JsonNode predicate;
	
	private String url;
	
	private String apiid;
	
	private String status;
	
	private Timestamp scheduledTime;

	private String envCode;


	public static ApiRouteDraftTO fromEntity(ApiRouteDraft ent) {
		ApiRouteDraftTO to = new ApiRouteDraftTO();
		to.setApiRouteId(ent.getApiRouteId());
		to.setName(ent.getName());
		to.setFilter(toJSON(ent.getFilter()));
		to.setPredicate(toJSON(ent.getPredicate()));
		to.setUrl(ent.getUrl());
		to.setApiid(ent.getApiid());
		to.setStatus(ent.getStatus());
		to.setScheduledTime(ent.getScheduledTime());
		to.setEnvCode(ent.getEnvCode());
		return to;
	}

	public static ApiRouteDraft toEntity(ApiRouteDraftTO to) {
		ApiRouteDraft ent = new ApiRouteDraft();
		ent.setApiRouteId(to.getApiRouteId());
		ent.setName(to.getName());
		ent.setFilter(fromJSON(to.getFilter()));
		ent.setPredicate(fromJSON(to.getPredicate()));
		ent.setUrl(to.getUrl());
		ent.setApiid(to.getApiid());
		ent.setStatus(to.getStatus());
		ent.setScheduledTime(to.getScheduledTime());
		ent.setEnvCode(to.getEnvCode());
		return ent;
	}
	
	public static void copyToEntity(ApiRouteDraftTO to, ApiRouteDraft ent) {
		ent.setApiRouteId(to.getApiRouteId());
		ent.setName(to.getName());
		ent.setFilter(fromJSON(to.getFilter()));
		ent.setPredicate(fromJSON(to.getPredicate()));
		ent.setUrl(to.getUrl());
		ent.setApiid(to.getApiid());
		ent.setStatus(to.getStatus());
		ent.setScheduledTime(to.getScheduledTime());
	}
	
}