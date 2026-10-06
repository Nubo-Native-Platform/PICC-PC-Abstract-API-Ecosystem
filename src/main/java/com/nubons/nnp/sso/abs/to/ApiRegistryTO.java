package com.nubons.nnp.sso.abs.to;

import java.util.Objects;

import com.nubons.nnp.sso.abs.entity.ApiRegistry;

import com.nubons.nnp.sso.abs.entity.ApiServiceProvider;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class ApiRegistryTO extends AbstractBaseTO {

	private static final long serialVersionUID = -8244124959902785691L;

	private String apiid;

	private String apiDescription;

	private String apiGroup;

	@NotBlank
	private String apiName;

	private String apiParam1;

	private String apiParam2;

	private String apiParam3;

	private String apiParam4;

	private String apiParam5;

	private String apiProtocol;

	private String apiStatus;

	private String apiSubgroup;

	private String srid;

	@NotBlank
	private String uri;

	private String type;

	private String prApiid;
	
	private String provId;

	private String envCode;

	public static ApiRegistryTO fromEntity(ApiRegistry ent) {
		ApiRegistryTO to = new ApiRegistryTO();
		to.setApiid(ent.getApiid());
		to.setApiDescription(ent.getApiDescription());

		to.setApiName(ent.getApiName());
		to.setApiParam1(ent.getApiParam1());
		to.setApiParam2(ent.getApiParam2());
		to.setApiParam3(ent.getApiParam3());
		to.setApiParam4(ent.getApiParam4());
		to.setApiParam5(ent.getApiParam5());
		to.setApiProtocol(ent.getApiProtocol());
		to.setApiStatus(ent.getApiStatus());
		to.setApiSubgroup(ent.getApiSubgroup());
		to.setSrid(ent.getSrid());
		to.setUri(ent.getUri());
		if (ent.getApiRegistry() != null) {
			to.setPrApiid(ent.getApiRegistry().getApiid());
//			to.setApiGroup(ent.getApiRegistry().getApiGroup());
		}
		to.setApiGroup(ent.getApiGroup());
		if(Objects.nonNull(ent.getApiServiceProvider()))
			to.setProvId(ent.getApiServiceProvider().getProvid());
		to.setEnvCode(ent.getEnvCode());
		return to;
	}

	public static ApiRegistry toEntity(ApiRegistryTO to) {
		ApiRegistry ent = new ApiRegistry();
		ent.setApiid(to.getApiid());
		ent.setApiDescription(to.getApiDescription());
		ent.setApiGroup(to.getApiGroup());
		ent.setApiName(to.getApiName());
		ent.setApiParam1(to.getApiParam1());
		ent.setApiParam2(to.getApiParam2());
		ent.setApiParam3(to.getApiParam3());
		ent.setApiParam4(to.getApiParam4());
		ent.setApiParam5(to.getApiParam5());
		ent.setApiProtocol(to.getApiProtocol());
		ent.setApiStatus(to.getApiStatus());
		ent.setApiSubgroup(to.getApiSubgroup());
		ent.setSrid(to.getSrid());
		ent.setUri(to.getUri());
		if (to.getPrApiid() != null) {
			ApiRegistry parent = new ApiRegistry();
			parent.setApiid(to.getPrApiid());
			ent.setApiRegistry(parent);
		}
		if(Objects.nonNull(to.getProvId())) {
			ApiServiceProvider svcProvider = new ApiServiceProvider();
			svcProvider.setProvid(to.getProvId());
			ent.setApiServiceProvider(svcProvider);
		}
		ent.setEnvCode(to.getEnvCode());
		return ent;
	}

	public static void copyToEntity(ApiRegistryTO to, ApiRegistry ent) {
		ent.setApiid(to.getApiid());
		ent.setApiDescription(to.getApiDescription());
		ent.setApiGroup(to.getApiGroup());
		ent.setApiName(to.getApiName());
		ent.setApiParam1(to.getApiParam1());
		ent.setApiParam2(to.getApiParam2());
		ent.setApiParam3(to.getApiParam3());
		ent.setApiParam4(to.getApiParam4());
		ent.setApiParam5(to.getApiParam5());
		ent.setApiProtocol(to.getApiProtocol());
		ent.setApiStatus(to.getApiStatus());
		ent.setApiSubgroup(to.getApiSubgroup());
		ent.setSrid(to.getSrid());
		ent.setUri(to.getUri());
		if (Objects.nonNull(ent.getApiRegistry())) {
			ent.getApiRegistry().setApiid(to.getPrApiid());
		}
		if(Objects.nonNull(to.getProvId())) {
			ApiServiceProvider svcProvider = new ApiServiceProvider();
			svcProvider.setProvid(to.getProvId());
			ent.setApiServiceProvider(svcProvider);
		}
	}
}
