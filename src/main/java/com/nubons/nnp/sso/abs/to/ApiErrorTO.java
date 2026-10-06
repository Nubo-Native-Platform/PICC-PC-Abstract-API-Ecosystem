package com.nubons.nnp.sso.abs.to;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Builder
@Getter
@Setter
@ToString
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "errorCode", "message", "path", "method" })
public class ApiErrorTO extends AbstractBaseTO {
	private static final long serialVersionUID = 8645916479499539926L;
	private String errorCode;
	private String message;
	private String path;
	private String method;

}
