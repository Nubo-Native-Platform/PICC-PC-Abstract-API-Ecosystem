package com.nubons.nnp.sso.abs.entity;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

/**
 * The persistent class for the api_error_category database table.
 * 
 */
@Entity
@Table(name = "api_error_category")
@NamedQuery(name = "ApiErrorCategory.findAll", query = "SELECT a FROM ApiErrorCategory a")
public class ApiErrorCategory extends AbstractBaseEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "api_err_cat_id")
	private String apiErrCatId;

	@Column(name = "err_cat_description")
	private String errCatDescription;

	@Column(name = "err_cat_name")
	private String errCatName;

	@Column(name = "err_cat_param1")
	private String errCatParam1;

	@Column(name = "err_cat_param2")
	private String errCatParam2;

	// bi-directional many-to-one association to ApiErrorMsg
	@OneToMany(mappedBy = "apiErrorCategory")
	private List<ApiErrorMsg> apiErrorMsgs;

	public ApiErrorCategory() {
	}

	public String getApiErrCatId() {
		return this.apiErrCatId;
	}

	public void setApiErrCatId(String apiErrCatId) {
		this.apiErrCatId = apiErrCatId;
	}

	public String getErrCatDescription() {
		return this.errCatDescription;
	}

	public void setErrCatDescription(String errCatDescription) {
		this.errCatDescription = errCatDescription;
	}

	public String getErrCatName() {
		return this.errCatName;
	}

	public void setErrCatName(String errCatName) {
		this.errCatName = errCatName;
	}

	public String getErrCatParam1() {
		return this.errCatParam1;
	}

	public void setErrCatParam1(String errCatParam1) {
		this.errCatParam1 = errCatParam1;
	}

	public String getErrCatParam2() {
		return this.errCatParam2;
	}

	public void setErrCatParam2(String errCatParam2) {
		this.errCatParam2 = errCatParam2;
	}

	public List<ApiErrorMsg> getApiErrorMsgs() {
		return this.apiErrorMsgs;
	}

	public void setApiErrorMsgs(List<ApiErrorMsg> apiErrorMsgs) {
		this.apiErrorMsgs = apiErrorMsgs;
	}

	public ApiErrorMsg addApiErrorMsg(ApiErrorMsg apiErrorMsg) {
		getApiErrorMsgs().add(apiErrorMsg);
		apiErrorMsg.setApiErrorCategory(this);

		return apiErrorMsg;
	}

	public ApiErrorMsg removeApiErrorMsg(ApiErrorMsg apiErrorMsg) {
		getApiErrorMsgs().remove(apiErrorMsg);
		apiErrorMsg.setApiErrorCategory(null);

		return apiErrorMsg;
	}

}