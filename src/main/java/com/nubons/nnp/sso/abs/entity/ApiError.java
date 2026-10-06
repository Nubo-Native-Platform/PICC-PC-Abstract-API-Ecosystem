package com.nubons.nnp.sso.abs.entity;

import java.io.Serializable;
import java.time.OffsetDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;

/**
 * The persistent class for the api_error database table.
 * 
 */
@Entity
@Table(name = "api_error")
@NamedQuery(name = "ApiError.findAll", query = "SELECT a FROM ApiError a")
public class ApiError extends AbstractBaseEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "api_err_id")
	private String apiErrId;

	@Column(name = "api_comp_name")
	private String apiCompName;

	@Column(name = "api_err_ts")
	private OffsetDateTime apiErrTs;

	@Column(name = "api_node")
	private String apiNode;

	@Column(name = "err_msg")
	private String errMsg;

	@Column(name = "err_param1")
	private String errParam1;

	@Column(name = "err_param2")
	private String errParam2;

	@Column(name = "err_param3")
	private String errParam3;

	@Column(name = "err_param4")
	private String errParam4;

	@Column(name = "err_param5")
	private String errParam5;

	@Column(name = "err_root_cause")
	private String errRootCause;

	@Column(name = "err_root_cause_analysis")
	private String errRootCauseAnalysis;

	// bi-directional many-to-one association to ApiErrorMsg
	@ManyToOne
	@JoinColumn(name = "api_err_msg_id")
	private ApiErrorMsg apiErrorMsg;



	public ApiError() {
	}

	public String getApiErrId() {
		return this.apiErrId;
	}

	public void setApiErrId(String apiErrId) {
		this.apiErrId = apiErrId;
	}

	public String getApiCompName() {
		return this.apiCompName;
	}

	public void setApiCompName(String apiCompName) {
		this.apiCompName = apiCompName;
	}

	public OffsetDateTime getApiErrTs() {
		return this.apiErrTs;
	}

	public void setApiErrTs(OffsetDateTime apiErrTs) {
		this.apiErrTs = apiErrTs;
	}

	public String getApiNode() {
		return this.apiNode;
	}

	public void setApiNode(String apiNode) {
		this.apiNode = apiNode;
	}

	public String getErrMsg() {
		return this.errMsg;
	}

	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}

	public String getErrParam1() {
		return this.errParam1;
	}

	public void setErrParam1(String errParam1) {
		this.errParam1 = errParam1;
	}

	public String getErrParam2() {
		return this.errParam2;
	}

	public void setErrParam2(String errParam2) {
		this.errParam2 = errParam2;
	}

	public String getErrParam3() {
		return this.errParam3;
	}

	public void setErrParam3(String errParam3) {
		this.errParam3 = errParam3;
	}

	public String getErrParam4() {
		return this.errParam4;
	}

	public void setErrParam4(String errParam4) {
		this.errParam4 = errParam4;
	}

	public String getErrParam5() {
		return this.errParam5;
	}

	public void setErrParam5(String errParam5) {
		this.errParam5 = errParam5;
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

	public ApiErrorMsg getApiErrorMsg() {
		return this.apiErrorMsg;
	}

	public void setApiErrorMsg(ApiErrorMsg apiErrorMsg) {
		this.apiErrorMsg = apiErrorMsg;
	}

}