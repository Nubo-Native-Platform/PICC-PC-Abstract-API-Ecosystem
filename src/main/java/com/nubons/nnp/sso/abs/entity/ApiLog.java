package com.nubons.nnp.sso.abs.entity;

import java.io.Serializable;

import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import com.nubons.nnp.sso.abs.to.ApiLogTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Entity
@Table(name = "api_log")
@NamedQuery(name = "ApiLog.findAll", query = "SELECT a FROM ApiLog a")
@ToString
public class ApiLog extends AbstractBaseEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6326930156545170834L;
	
	@Id
	@Column(name = "api_log_id")
	private String apiLogId;
	
	@JdbcTypeCode(SqlTypes.JSON)
	private ApiLogTO log;

}
