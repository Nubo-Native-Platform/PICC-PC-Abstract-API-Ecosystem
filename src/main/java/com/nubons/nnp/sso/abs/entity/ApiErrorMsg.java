package com.nubons.nnp.sso.abs.entity;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

/**
 * The persistent class for the api_error_msg database table.
 * 
 */
@Entity
@Table(name = "api_error_msg")
@NamedQuery(name = "ApiErrorMsg.findAll", query = "SELECT a FROM ApiErrorMsg a")
public class ApiErrorMsg extends AbstractBaseEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "api_err_msg_id")
	private String apiErrMsgId;

	@Column(name = "err_msg")
	private String errMsg;

	@Column(name = "err_msg_param1")
	private String errMsgParam1;

	@Column(name = "err_msg_param2")
	private String errMsgParam2;

	@Column(name = "err_root_cause")
	private String errRootCause;

	@Column(name = "err_root_cause_analysis")
	private String errRootCauseAnalysis;

	// bi-directional many-to-one association to ApiError
	@OneToMany(mappedBy = "apiErrorMsg")
	private List<ApiError> apiErrors;

	// bi-directional many-to-one association to ApiErrorCategory
	@ManyToOne
	@JoinColumn(name = "api_err_cat_id")
	private ApiErrorCategory apiErrorCategory;

	public ApiErrorMsg() {
	}

	public String getApiErrMsgId() {
		return this.apiErrMsgId;
	}

	public void setApiErrMsgId(String apiErrMsgId) {
		this.apiErrMsgId = apiErrMsgId;
	}

	public String getErrMsg() {
		return this.errMsg;
	}

	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}

	public String getErrMsgParam1() {
		return this.errMsgParam1;
	}

	public void setErrMsgParam1(String errMsgParam1) {
		this.errMsgParam1 = errMsgParam1;
	}

	public String getErrMsgParam2() {
		return this.errMsgParam2;
	}

	public void setErrMsgParam2(String errMsgParam2) {
		this.errMsgParam2 = errMsgParam2;
	}

	public String getErrRootCause() {
		return this.errRootCause;
	}

	public void setErrRootCause(String errRootCause) {
		this.errRootCause = errRootCause;
	}

	public String getErrRootCauseAnalysis() {
		return this.errRootCauseAnalysis;
	}

	public void setErrRootCauseAnalysis(String errRootCauseAnalysis) {
		this.errRootCauseAnalysis = errRootCauseAnalysis;
	}

	public List<ApiError> getApiErrors() {
		return this.apiErrors;
	}

	public void setApiErrors(List<ApiError> apiErrors) {
		this.apiErrors = apiErrors;
	}

	public ApiError addApiError(ApiError apiError) {
		getApiErrors().add(apiError);
		apiError.setApiErrorMsg(this);

		return apiError;
	}

	public ApiError removeApiError(ApiError apiError) {
		getApiErrors().remove(apiError);
		apiError.setApiErrorMsg(null);

		return apiError;
	}

	public ApiErrorCategory getApiErrorCategory() {
		return this.apiErrorCategory;
	}

	public void setApiErrorCategory(ApiErrorCategory apiErrorCategory) {
		this.apiErrorCategory = apiErrorCategory;
	}

}