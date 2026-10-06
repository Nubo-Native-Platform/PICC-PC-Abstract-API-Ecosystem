package com.nubons.nnp.sso.abs.to;

import com.nubons.nnp.sso.abs.entity.ApiOrganization;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class ApiOrganizationTO extends AbstractBaseTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6159433206904553965L;

	private String orgId;

	@NotBlank
	private String orgName;
	
	private String orgType;


	public static ApiOrganizationTO fromEntity(ApiOrganization ent) {
		ApiOrganizationTO to = new ApiOrganizationTO();

		to.setOrgId(ent.getOrgId());
		to.setOrgName(ent.getOrgName());
		to.setOrgType(ent.getOrgType());
		return to;
	}

	public static ApiOrganization toEntity(ApiOrganizationTO to) {
		ApiOrganization ent = new ApiOrganization();

		ent.setOrgId(to.getOrgId());
		ent.setOrgName(to.getOrgName());
		ent.setOrgType(to.getOrgType());
		return ent;
	}

	public static void copyToEntity(ApiOrganizationTO to, ApiOrganization ent) {
		ent.setOrgId(to.getOrgId());
		ent.setOrgName(to.getOrgName());
		ent.setOrgType(to.getOrgType());
	}

}
