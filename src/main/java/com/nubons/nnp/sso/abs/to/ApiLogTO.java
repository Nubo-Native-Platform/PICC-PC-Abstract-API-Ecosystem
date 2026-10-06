package com.nubons.nnp.sso.abs.to;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@Builder
public class ApiLogTO extends AbstractBaseTO {
	
	private static final long serialVersionUID = 2064535667;
	
	private String userId;
	private String requestUrl;
	private String routeId;
	private String routeUrl;
	private String requestTs;
	private String responseTs;
	private boolean status;
	private String respStatusCode;
}
