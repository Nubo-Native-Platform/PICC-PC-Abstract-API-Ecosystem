package com.nubons.nnp.sso.abs.to;

import com.nubons.nnp.sso.abs.entity.ApiServiceProvider;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class ApiServiceProviderTO extends AbstractBaseTO  {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3754634357276398607L;

	private String provid;

	private String provCategory;

	private String provDescription;

	private String provName;

	private String provOrganization;

	private String provParam1;

	private String provParam2;

	private String provParam3;

	private String provParam4;

	private String provParam5;
	
	private String status;

	private String envCode;

	public static ApiServiceProviderTO fromEntity(ApiServiceProvider ent) {
		ApiServiceProviderTO to = new ApiServiceProviderTO();

		to.setProvid(ent.getProvid());
		to.setProvCategory(ent.getProvCategory());
		to.setProvDescription(ent.getProvDescription());
		to.setProvName(ent.getProvName());
		to.setProvOrganization(ent.getProvOrganization());
		to.setProvParam1(ent.getProvParam1());
		to.setProvParam2(ent.getProvParam2());
		to.setProvParam3(ent.getProvParam3());
		to.setProvParam4(ent.getProvParam4());
		to.setProvParam5(ent.getProvParam5());
		to.setStatus(ent.getStatus());
		to.setEnvCode(ent.getEnvCode());
		return to;

	}

	public static ApiServiceProvider toEntity(ApiServiceProviderTO to) {
		ApiServiceProvider ent = new ApiServiceProvider();
		ent.setProvid(to.getProvid());
		ent.setProvCategory(to.getProvCategory());
		ent.setProvDescription(to.getProvDescription());
		ent.setProvName(to.getProvName());
		ent.setProvOrganization(to.getProvOrganization());
		ent.setProvParam1(to.getProvParam1());
		ent.setProvParam2(to.getProvParam2());
		ent.setProvParam3(to.getProvParam3());
		ent.setProvParam4(to.getProvParam4());
		ent.setProvParam5(to.getProvParam5());
		ent.setStatus(to.getStatus());
		ent.setEnvCode(to.getEnvCode());
		return ent;
	}
	public static void copyToEntity(ApiServiceProviderTO to, ApiServiceProvider ent) {
		ent.setProvid(to.getProvid());
		ent.setProvCategory(to.getProvCategory());
		ent.setProvDescription(to.getProvDescription());
		ent.setProvName(to.getProvName());
		ent.setProvOrganization(to.getProvOrganization());
		ent.setProvParam1(to.getProvParam1());
		ent.setProvParam2(to.getProvParam2());
		ent.setProvParam3(to.getProvParam3());
		ent.setProvParam4(to.getProvParam4());
		ent.setProvParam5(to.getProvParam5());
		ent.setStatus(to.getStatus());
	}

}
