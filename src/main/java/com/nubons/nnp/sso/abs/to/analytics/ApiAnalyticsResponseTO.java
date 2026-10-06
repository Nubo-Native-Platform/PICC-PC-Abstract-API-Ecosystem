package com.nubons.nnp.sso.abs.to.analytics;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "status",
    "message"
})
@Data
public class ApiAnalyticsResponseTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2685550474663225928L;
	
	@JsonProperty("status")
    private String status;
	
	@JsonProperty("message")
    private String message;
	
	private String transactionId;
	
	public String toJson() throws JsonProcessingException {
		return new ObjectMapper().writeValueAsString(this);
	}
}
