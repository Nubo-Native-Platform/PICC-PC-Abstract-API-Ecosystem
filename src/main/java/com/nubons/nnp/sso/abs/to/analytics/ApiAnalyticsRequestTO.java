
package com.nubons.nnp.sso.abs.to.analytics;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import jakarta.annotation.Generated;
import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_NULL)

@Data
@Generated("jsonschema2pojo")
public class ApiAnalyticsRequestTO implements Serializable {

	@JsonProperty("apiTransaction")
	private ApiTransactionTO apiTransaction;

	private final static long serialVersionUID = 7721343207013553704L;

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public ApiAnalyticsRequestTO() {
	}

	public ApiAnalyticsRequestTO(ApiTransactionTO apiTransaction) {
		super();
		this.apiTransaction = apiTransaction;
	}

	@Override
	public String toString() {
		return "ApiAnalyticsRequestTO [apiTransaction=" + apiTransaction + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ApiAnalyticsRequestTO other = (ApiAnalyticsRequestTO) obj;
		return Objects.equals(apiTransaction, other.apiTransaction);
	}

	@Override
	public int hashCode() {
		return Objects.hash(apiTransaction);
	}
	
	public String toJson() throws JsonProcessingException {
		return new ObjectMapper().writeValueAsString(this);
	}

}
