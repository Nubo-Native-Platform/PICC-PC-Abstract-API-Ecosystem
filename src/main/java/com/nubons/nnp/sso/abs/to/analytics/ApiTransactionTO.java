
package com.nubons.nnp.sso.abs.to.analytics;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import jakarta.annotation.Generated;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "transactionId",
    "apiId",
    "conId",
    "provId",
    "callReceiveTs",
    "callBackedReceiveTs",
    "callBackedReturnTs",
    "callReturnTs",
    "cacheHit",
    "reqSize",
    "respSize",
    "success",
    "rate",
    "userId",
    "apiTransParam_2",
    "apiTransParam_3",
    "apiTransParam_4",
    "apiTransParam_5",
    "apiErrors"
})
@Generated("jsonschema2pojo")
public class ApiTransactionTO implements Serializable
{

    @JsonProperty("transactionId")
    private String transactionId;
    @JsonProperty("apiId")
    private String apiId;
    @JsonProperty("conId")
    private String conId;
    @JsonProperty("provId")
    private String provId;
    @JsonProperty("callReceiveTs")
    private String callReceiveTs;
    @JsonProperty("callBackedReceiveTs")
    private String callBackedReceiveTs;
    @JsonProperty("callBackedReturnTs")
    private String callBackedReturnTs;
    @JsonProperty("callReturnTs")
    private String callReturnTs;
    @JsonProperty("cacheHit")
    private Boolean cacheHit;
    @JsonProperty("reqSize")
    private Integer reqSize;
    @JsonProperty("respSize")
    private Integer respSize;
    @JsonProperty("success")
    private Boolean success;
    @JsonProperty("rate")
    private String rate;
    @JsonProperty("userId")
    private String userId;
    @JsonProperty("apiTransParam_2")
    private String apiTransParam2;
    @JsonProperty("apiTransParam_3")
    private String apiTransParam3;
    @JsonProperty("apiTransParam_4")
    private String apiTransParam4;
    @JsonProperty("apiTransParam_5")
    private String apiTransParam5;
    @JsonProperty("apiErrors")
    private List<ApiErrorTO> apiErrors = new ArrayList<ApiErrorTO>();
    private final static long serialVersionUID = -319051944641706981L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ApiTransactionTO() {
    }

    /**
     * 
     * @param reqSize
     * @param callBackedReceiveTs
     * @param transactionId
     * @param callReturnTs
     * @param apiTransParam2
     * @param callReceiveTs
     * @param callBackedReturnTs
     * @param userId
     * @param rate
     * @param apiTransParam5
     * @param success
     * @param apiTransParam4
     * @param apiTransParam3
     * @param cacheHit
     * @param conId
     * @param respSize
     * @param provId
     * @param apiId
     * @param apiErrors
     */
    public ApiTransactionTO(String transactionId, String apiId, String conId, String provId, String callReceiveTs, String callBackedReceiveTs, String callBackedReturnTs, String callReturnTs, Boolean cacheHit, Integer reqSize, Integer respSize, Boolean success, String rate, String userId, String apiTransParam2, String apiTransParam3, String apiTransParam4, String apiTransParam5, List<ApiErrorTO> apiErrors) {
        super();
        this.transactionId = transactionId;
        this.apiId = apiId;
        this.conId = conId;
        this.provId = provId;
        this.callReceiveTs = callReceiveTs;
        this.callBackedReceiveTs = callBackedReceiveTs;
        this.callBackedReturnTs = callBackedReturnTs;
        this.callReturnTs = callReturnTs;
        this.cacheHit = cacheHit;
        this.reqSize = reqSize;
        this.respSize = respSize;
        this.success = success;
        this.rate = rate;
        this.userId = userId;
        this.apiTransParam2 = apiTransParam2;
        this.apiTransParam3 = apiTransParam3;
        this.apiTransParam4 = apiTransParam4;
        this.apiTransParam5 = apiTransParam5;
        this.apiErrors = apiErrors;
    }

    @JsonProperty("transactionId")
    public String getTransactionId() {
        return transactionId;
    }

    @JsonProperty("transactionId")
    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public ApiTransactionTO withTransactionId(String transactionId) {
        this.transactionId = transactionId;
        return this;
    }

    @JsonProperty("apiId")
    public String getApiId() {
        return apiId;
    }

    @JsonProperty("apiId")
    public void setApiId(String apiId) {
        this.apiId = apiId;
    }

    public ApiTransactionTO withApiId(String apiId) {
        this.apiId = apiId;
        return this;
    }

    @JsonProperty("conId")
    public String getConId() {
        return conId;
    }

    @JsonProperty("conId")
    public void setConId(String conId) {
        this.conId = conId;
    }

    public ApiTransactionTO withConId(String conId) {
        this.conId = conId;
        return this;
    }

    @JsonProperty("provId")
    public String getProvId() {
        return provId;
    }

    @JsonProperty("provId")
    public void setProvId(String provId) {
        this.provId = provId;
    }

    public ApiTransactionTO withProvId(String provId) {
        this.provId = provId;
        return this;
    }

    @JsonProperty("callReceiveTs")
    public String getCallReceiveTs() {
        return callReceiveTs;
    }

    @JsonProperty("callReceiveTs")
    public void setCallReceiveTs(String callReceiveTs) {
        this.callReceiveTs = callReceiveTs;
    }

    public ApiTransactionTO withCallReceiveTs(String callReceiveTs) {
        this.callReceiveTs = callReceiveTs;
        return this;
    }

    @JsonProperty("callBackedReceiveTs")
    public String getCallBackedReceiveTs() {
        return callBackedReceiveTs;
    }

    @JsonProperty("callBackedReceiveTs")
    public void setCallBackedReceiveTs(String callBackedReceiveTs) {
        this.callBackedReceiveTs = callBackedReceiveTs;
    }

    public ApiTransactionTO withCallBackedReceiveTs(String callBackedReceiveTs) {
        this.callBackedReceiveTs = callBackedReceiveTs;
        return this;
    }

    @JsonProperty("callBackedReturnTs")
    public String getCallBackedReturnTs() {
        return callBackedReturnTs;
    }

    @JsonProperty("callBackedReturnTs")
    public void setCallBackedReturnTs(String callBackedReturnTs) {
        this.callBackedReturnTs = callBackedReturnTs;
    }

    public ApiTransactionTO withCallBackedReturnTs(String callBackedReturnTs) {
        this.callBackedReturnTs = callBackedReturnTs;
        return this;
    }

    @JsonProperty("callReturnTs")
    public String getCallReturnTs() {
        return callReturnTs;
    }

    @JsonProperty("callReturnTs")
    public void setCallReturnTs(String callReturnTs) {
        this.callReturnTs = callReturnTs;
    }

    public ApiTransactionTO withCallReturnTs(String callReturnTs) {
        this.callReturnTs = callReturnTs;
        return this;
    }

    @JsonProperty("cacheHit")
    public Boolean getCacheHit() {
        return cacheHit;
    }

    @JsonProperty("cacheHit")
    public void setCacheHit(Boolean cacheHit) {
        this.cacheHit = cacheHit;
    }

    public ApiTransactionTO withCacheHit(Boolean cacheHit) {
        this.cacheHit = cacheHit;
        return this;
    }

    @JsonProperty("reqSize")
    public Integer getReqSize() {
        return reqSize;
    }

    @JsonProperty("reqSize")
    public void setReqSize(Integer reqSize) {
        this.reqSize = reqSize;
    }

    public ApiTransactionTO withReqSize(Integer reqSize) {
        this.reqSize = reqSize;
        return this;
    }

    @JsonProperty("respSize")
    public Integer getRespSize() {
        return respSize;
    }

    @JsonProperty("respSize")
    public void setRespSize(Integer respSize) {
        this.respSize = respSize;
    }

    public ApiTransactionTO withRespSize(Integer respSize) {
        this.respSize = respSize;
        return this;
    }

    @JsonProperty("success")
    public Boolean getSuccess() {
        return success;
    }

    @JsonProperty("success")
    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public ApiTransactionTO withSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    @JsonProperty("rate")
    public String getRate() {
        return rate;
    }

    @JsonProperty("rate")
    public void setRate(String rate) {
        this.rate = rate;
    }

    public ApiTransactionTO withRate(String rate) {
        this.rate = rate;
        return this;
    }

    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public ApiTransactionTO withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    @JsonProperty("apiTransParam_2")
    public String getApiTransParam2() {
        return apiTransParam2;
    }

    @JsonProperty("apiTransParam_2")
    public void setApiTransParam2(String apiTransParam2) {
        this.apiTransParam2 = apiTransParam2;
    }

    public ApiTransactionTO withApiTransParam2(String apiTransParam2) {
        this.apiTransParam2 = apiTransParam2;
        return this;
    }

    @JsonProperty("apiTransParam_3")
    public String getApiTransParam3() {
        return apiTransParam3;
    }

    @JsonProperty("apiTransParam_3")
    public void setApiTransParam3(String apiTransParam3) {
        this.apiTransParam3 = apiTransParam3;
    }

    public ApiTransactionTO withApiTransParam3(String apiTransParam3) {
        this.apiTransParam3 = apiTransParam3;
        return this;
    }

    @JsonProperty("apiTransParam_4")
    public String getApiTransParam4() {
        return apiTransParam4;
    }

    @JsonProperty("apiTransParam_4")
    public void setApiTransParam4(String apiTransParam4) {
        this.apiTransParam4 = apiTransParam4;
    }

    public ApiTransactionTO withApiTransParam4(String apiTransParam4) {
        this.apiTransParam4 = apiTransParam4;
        return this;
    }

    @JsonProperty("apiTransParam_5")
    public String getApiTransParam5() {
        return apiTransParam5;
    }

    @JsonProperty("apiTransParam_5")
    public void setApiTransParam5(String apiTransParam5) {
        this.apiTransParam5 = apiTransParam5;
    }

    public ApiTransactionTO withApiTransParam5(String apiTransParam5) {
        this.apiTransParam5 = apiTransParam5;
        return this;
    }

    @JsonProperty("apiErrors")
    public List<ApiErrorTO> getApiErrors() {
        return apiErrors;
    }

    @JsonProperty("apiErrors")
    public void setApiErrors(List<ApiErrorTO> apiErrors) {
        this.apiErrors = apiErrors;
    }

    public ApiTransactionTO withApiErrors(List<ApiErrorTO> apiErrors) {
        this.apiErrors = apiErrors;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ApiTransactionTO.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("transactionId");
        sb.append('=');
        sb.append(((this.transactionId == null)?"<null>":this.transactionId));
        sb.append(',');
        sb.append("apiId");
        sb.append('=');
        sb.append(((this.apiId == null)?"<null>":this.apiId));
        sb.append(',');
        sb.append("conId");
        sb.append('=');
        sb.append(((this.conId == null)?"<null>":this.conId));
        sb.append(',');
        sb.append("provId");
        sb.append('=');
        sb.append(((this.provId == null)?"<null>":this.provId));
        sb.append(',');
        sb.append("callReceiveTs");
        sb.append('=');
        sb.append(((this.callReceiveTs == null)?"<null>":this.callReceiveTs));
        sb.append(',');
        sb.append("callBackedReceiveTs");
        sb.append('=');
        sb.append(((this.callBackedReceiveTs == null)?"<null>":this.callBackedReceiveTs));
        sb.append(',');
        sb.append("callBackedReturnTs");
        sb.append('=');
        sb.append(((this.callBackedReturnTs == null)?"<null>":this.callBackedReturnTs));
        sb.append(',');
        sb.append("callReturnTs");
        sb.append('=');
        sb.append(((this.callReturnTs == null)?"<null>":this.callReturnTs));
        sb.append(',');
        sb.append("cacheHit");
        sb.append('=');
        sb.append(((this.cacheHit == null)?"<null>":this.cacheHit));
        sb.append(',');
        sb.append("reqSize");
        sb.append('=');
        sb.append(((this.reqSize == null)?"<null>":this.reqSize));
        sb.append(',');
        sb.append("respSize");
        sb.append('=');
        sb.append(((this.respSize == null)?"<null>":this.respSize));
        sb.append(',');
        sb.append("success");
        sb.append('=');
        sb.append(((this.success == null)?"<null>":this.success));
        sb.append(',');
        sb.append("rate");
        sb.append('=');
        sb.append(((this.rate == null)?"<null>":this.rate));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
        sb.append(',');
        sb.append("apiTransParam2");
        sb.append('=');
        sb.append(((this.apiTransParam2 == null)?"<null>":this.apiTransParam2));
        sb.append(',');
        sb.append("apiTransParam3");
        sb.append('=');
        sb.append(((this.apiTransParam3 == null)?"<null>":this.apiTransParam3));
        sb.append(',');
        sb.append("apiTransParam4");
        sb.append('=');
        sb.append(((this.apiTransParam4 == null)?"<null>":this.apiTransParam4));
        sb.append(',');
        sb.append("apiTransParam5");
        sb.append('=');
        sb.append(((this.apiTransParam5 == null)?"<null>":this.apiTransParam5));
        sb.append(',');
        sb.append("apiErrors");
        sb.append('=');
        sb.append(((this.apiErrors == null)?"<null>":this.apiErrors));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.reqSize == null)? 0 :this.reqSize.hashCode()));
        result = ((result* 31)+((this.callBackedReceiveTs == null)? 0 :this.callBackedReceiveTs.hashCode()));
        result = ((result* 31)+((this.transactionId == null)? 0 :this.transactionId.hashCode()));
        result = ((result* 31)+((this.callReturnTs == null)? 0 :this.callReturnTs.hashCode()));
        result = ((result* 31)+((this.apiTransParam2 == null)? 0 :this.apiTransParam2 .hashCode()));
        result = ((result* 31)+((this.callReceiveTs == null)? 0 :this.callReceiveTs.hashCode()));
        result = ((result* 31)+((this.callBackedReturnTs == null)? 0 :this.callBackedReturnTs.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId .hashCode()));
        result = ((result* 31)+((this.rate == null)? 0 :this.rate.hashCode()));
        result = ((result* 31)+((this.apiTransParam5 == null)? 0 :this.apiTransParam5 .hashCode()));
        result = ((result* 31)+((this.success == null)? 0 :this.success.hashCode()));
        result = ((result* 31)+((this.apiTransParam4 == null)? 0 :this.apiTransParam4 .hashCode()));
        result = ((result* 31)+((this.apiTransParam3 == null)? 0 :this.apiTransParam3 .hashCode()));
        result = ((result* 31)+((this.cacheHit == null)? 0 :this.cacheHit.hashCode()));
        result = ((result* 31)+((this.conId == null)? 0 :this.conId.hashCode()));
        result = ((result* 31)+((this.respSize == null)? 0 :this.respSize.hashCode()));
        result = ((result* 31)+((this.provId == null)? 0 :this.provId.hashCode()));
        result = ((result* 31)+((this.apiId == null)? 0 :this.apiId.hashCode()));
        result = ((result* 31)+((this.apiErrors == null)? 0 :this.apiErrors.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ApiTransactionTO) == false) {
            return false;
        }
        ApiTransactionTO rhs = ((ApiTransactionTO) other);
        return ((((((((((((((((((((this.reqSize == rhs.reqSize)||((this.reqSize!= null)&&this.reqSize.equals(rhs.reqSize)))&&((this.callBackedReceiveTs == rhs.callBackedReceiveTs)||((this.callBackedReceiveTs!= null)&&this.callBackedReceiveTs.equals(rhs.callBackedReceiveTs))))&&((this.transactionId == rhs.transactionId)||((this.transactionId!= null)&&this.transactionId.equals(rhs.transactionId))))&&((this.callReturnTs == rhs.callReturnTs)||((this.callReturnTs!= null)&&this.callReturnTs.equals(rhs.callReturnTs))))&&((this.apiTransParam2 == rhs.apiTransParam2)||((this.apiTransParam2 != null)&&this.apiTransParam2 .equals(rhs.apiTransParam2))))&&((this.callReceiveTs == rhs.callReceiveTs)||((this.callReceiveTs!= null)&&this.callReceiveTs.equals(rhs.callReceiveTs))))&&((this.callBackedReturnTs == rhs.callBackedReturnTs)||((this.callBackedReturnTs!= null)&&this.callBackedReturnTs.equals(rhs.callBackedReturnTs))))&&((this.userId == rhs.userId)||((this.userId != null)&&this.userId .equals(rhs.userId))))&&((this.rate == rhs.rate)||((this.rate!= null)&&this.rate.equals(rhs.rate))))&&((this.apiTransParam5 == rhs.apiTransParam5)||((this.apiTransParam5 != null)&&this.apiTransParam5 .equals(rhs.apiTransParam5))))&&((this.success == rhs.success)||((this.success!= null)&&this.success.equals(rhs.success))))&&((this.apiTransParam4 == rhs.apiTransParam4)||((this.apiTransParam4 != null)&&this.apiTransParam4 .equals(rhs.apiTransParam4))))&&((this.apiTransParam3 == rhs.apiTransParam3)||((this.apiTransParam3 != null)&&this.apiTransParam3 .equals(rhs.apiTransParam3))))&&((this.cacheHit == rhs.cacheHit)||((this.cacheHit!= null)&&this.cacheHit.equals(rhs.cacheHit))))&&((this.conId == rhs.conId)||((this.conId!= null)&&this.conId.equals(rhs.conId))))&&((this.respSize == rhs.respSize)||((this.respSize!= null)&&this.respSize.equals(rhs.respSize))))&&((this.provId == rhs.provId)||((this.provId!= null)&&this.provId.equals(rhs.provId))))&&((this.apiId == rhs.apiId)||((this.apiId!= null)&&this.apiId.equals(rhs.apiId))))&&((this.apiErrors == rhs.apiErrors)||((this.apiErrors!= null)&&this.apiErrors.equals(rhs.apiErrors))));
    }

}
