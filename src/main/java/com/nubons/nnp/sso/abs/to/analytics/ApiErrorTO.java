
package com.nubons.nnp.sso.abs.to.analytics;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import jakarta.annotation.Generated;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "errorId",
    "errorMsgId",
    "node",
    "compName",
    "errorTs",
    "errorMsg",
    "rootCause",
    "rootCauseAnalysis",
    "errorParam_1",
    "errorParam_2",
    "errorParam_3",
    "errorParam_4",
    "errorParam_5"
})
@Generated("jsonschema2pojo")
public class ApiErrorTO implements Serializable
{

    @JsonProperty("errorId")
    private String errorId;
    @JsonProperty("errorMsgId")
    private String errorMsgId;
    @JsonProperty("node")
    private String node;
    @JsonProperty("compName")
    private String compName;
    @JsonProperty("errorTs")
    private String errorTs;
    @JsonProperty("errorMsg")
    private String errorMsg;
    @JsonProperty("rootCause")
    private String rootCause;
    @JsonProperty("rootCauseAnalysis")
    private String rootCauseAnalysis;
    @JsonProperty("errorParam_1")
    private String errorParam1;
    @JsonProperty("errorParam_2")
    private String errorParam2;
    @JsonProperty("errorParam_3")
    private String errorParam3;
    @JsonProperty("errorParam_4")
    private String errorParam4;
    @JsonProperty("errorParam_5")
    private String errorParam5;
    private final static long serialVersionUID = -1462405446152736611L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ApiErrorTO() {
    }

    /**
     * 
     * @param errorParam2
     * @param compName
     * @param rootCauseAnalysis
     * @param errorParam1
     * @param errorParam4
     * @param errorMsg
     * @param errorParam3
     * @param node
     * @param errorParam5
     * @param rootCause
     * @param errorId
     * @param errorMsgId
     * @param errorTs
     */
    public ApiErrorTO(String errorId, String errorMsgId, String node, String compName, String errorTs, String errorMsg, String rootCause, String rootCauseAnalysis, String errorParam1, String errorParam2, String errorParam3, String errorParam4, String errorParam5) {
        super();
        this.errorId = errorId;
        this.errorMsgId = errorMsgId;
        this.node = node;
        this.compName = compName;
        this.errorTs = errorTs;
        this.errorMsg = errorMsg;
        this.rootCause = rootCause;
        this.rootCauseAnalysis = rootCauseAnalysis;
        this.errorParam1 = errorParam1;
        this.errorParam2 = errorParam2;
        this.errorParam3 = errorParam3;
        this.errorParam4 = errorParam4;
        this.errorParam5 = errorParam5;
    }

    @JsonProperty("errorId")
    public String getErrorId() {
        return errorId;
    }

    @JsonProperty("errorId")
    public void setErrorId(String errorId) {
        this.errorId = errorId;
    }

    public ApiErrorTO withErrorId(String errorId) {
        this.errorId = errorId;
        return this;
    }

    @JsonProperty("errorMsgId")
    public String getErrorMsgId() {
        return errorMsgId;
    }

    @JsonProperty("errorMsgId")
    public void setErrorMsgId(String errorMsgId) {
        this.errorMsgId = errorMsgId;
    }

    public ApiErrorTO withErrorMsgId(String errorMsgId) {
        this.errorMsgId = errorMsgId;
        return this;
    }

    @JsonProperty("node")
    public String getNode() {
        return node;
    }

    @JsonProperty("node")
    public void setNode(String node) {
        this.node = node;
    }

    public ApiErrorTO withNode(String node) {
        this.node = node;
        return this;
    }

    @JsonProperty("compName")
    public String getCompName() {
        return compName;
    }

    @JsonProperty("compName")
    public void setCompName(String compName) {
        this.compName = compName;
    }

    public ApiErrorTO withCompName(String compName) {
        this.compName = compName;
        return this;
    }

    @JsonProperty("errorTs")
    public String getErrorTs() {
        return errorTs;
    }

    @JsonProperty("errorTs")
    public void setErrorTs(String errorTs) {
        this.errorTs = errorTs;
    }

    public ApiErrorTO withErrorTs(String errorTs) {
        this.errorTs = errorTs;
        return this;
    }

    @JsonProperty("errorMsg")
    public String getErrorMsg() {
        return errorMsg;
    }

    @JsonProperty("errorMsg")
    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public ApiErrorTO withErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    @JsonProperty("rootCause")
    public String getRootCause() {
        return rootCause;
    }

    @JsonProperty("rootCause")
    public void setRootCause(String rootCause) {
        this.rootCause = rootCause;
    }

    public ApiErrorTO withRootCause(String rootCause) {
        this.rootCause = rootCause;
        return this;
    }

    @JsonProperty("rootCauseAnalysis")
    public String getRootCauseAnalysis() {
        return rootCauseAnalysis;
    }

    @JsonProperty("rootCauseAnalysis")
    public void setRootCauseAnalysis(String rootCauseAnalysis) {
        this.rootCauseAnalysis = rootCauseAnalysis;
    }

    public ApiErrorTO withRootCauseAnalysis(String rootCauseAnalysis) {
        this.rootCauseAnalysis = rootCauseAnalysis;
        return this;
    }

    @JsonProperty("errorParam_1")
    public String getErrorParam1() {
        return errorParam1;
    }

    @JsonProperty("errorParam_1")
    public void setErrorParam1(String errorParam1) {
        this.errorParam1 = errorParam1;
    }

    public ApiErrorTO withErrorParam1(String errorParam1) {
        this.errorParam1 = errorParam1;
        return this;
    }

    @JsonProperty("errorParam_2")
    public String getErrorParam2() {
        return errorParam2;
    }

    @JsonProperty("errorParam_2")
    public void setErrorParam2(String errorParam2) {
        this.errorParam2 = errorParam2;
    }

    public ApiErrorTO withErrorParam2(String errorParam2) {
        this.errorParam2 = errorParam2;
        return this;
    }

    @JsonProperty("errorParam_3")
    public String getErrorParam3() {
        return errorParam3;
    }

    @JsonProperty("errorParam_3")
    public void setErrorParam3(String errorParam3) {
        this.errorParam3 = errorParam3;
    }

    public ApiErrorTO withErrorParam3(String errorParam3) {
        this.errorParam3 = errorParam3;
        return this;
    }

    @JsonProperty("errorParam_4")
    public String getErrorParam4() {
        return errorParam4;
    }

    @JsonProperty("errorParam_4")
    public void setErrorParam4(String errorParam4) {
        this.errorParam4 = errorParam4;
    }

    public ApiErrorTO withErrorParam4(String errorParam4) {
        this.errorParam4 = errorParam4;
        return this;
    }

    @JsonProperty("errorParam_5")
    public String getErrorParam5() {
        return errorParam5;
    }

    @JsonProperty("errorParam_5")
    public void setErrorParam5(String errorParam5) {
        this.errorParam5 = errorParam5;
    }

    public ApiErrorTO withErrorParam5(String errorParam5) {
        this.errorParam5 = errorParam5;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ApiErrorTO.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("errorId");
        sb.append('=');
        sb.append(((this.errorId == null)?"<null>":this.errorId));
        sb.append(',');
        sb.append("errorMsgId");
        sb.append('=');
        sb.append(((this.errorMsgId == null)?"<null>":this.errorMsgId));
        sb.append(',');
        sb.append("node");
        sb.append('=');
        sb.append(((this.node == null)?"<null>":this.node));
        sb.append(',');
        sb.append("compName");
        sb.append('=');
        sb.append(((this.compName == null)?"<null>":this.compName));
        sb.append(',');
        sb.append("errorTs");
        sb.append('=');
        sb.append(((this.errorTs == null)?"<null>":this.errorTs));
        sb.append(',');
        sb.append("errorMsg");
        sb.append('=');
        sb.append(((this.errorMsg == null)?"<null>":this.errorMsg));
        sb.append(',');
        sb.append("rootCause");
        sb.append('=');
        sb.append(((this.rootCause == null)?"<null>":this.rootCause));
        sb.append(',');
        sb.append("rootCauseAnalysis");
        sb.append('=');
        sb.append(((this.rootCauseAnalysis == null)?"<null>":this.rootCauseAnalysis));
        sb.append(',');
        sb.append("errorParam1");
        sb.append('=');
        sb.append(((this.errorParam1 == null)?"<null>":this.errorParam1));
        sb.append(',');
        sb.append("errorParam2");
        sb.append('=');
        sb.append(((this.errorParam2 == null)?"<null>":this.errorParam2));
        sb.append(',');
        sb.append("errorParam3");
        sb.append('=');
        sb.append(((this.errorParam3 == null)?"<null>":this.errorParam3));
        sb.append(',');
        sb.append("errorParam4");
        sb.append('=');
        sb.append(((this.errorParam4 == null)?"<null>":this.errorParam4));
        sb.append(',');
        sb.append("errorParam5");
        sb.append('=');
        sb.append(((this.errorParam5 == null)?"<null>":this.errorParam5));
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
        result = ((result* 31)+((this.errorParam2 == null)? 0 :this.errorParam2 .hashCode()));
        result = ((result* 31)+((this.compName == null)? 0 :this.compName.hashCode()));
        result = ((result* 31)+((this.rootCauseAnalysis == null)? 0 :this.rootCauseAnalysis.hashCode()));
        result = ((result* 31)+((this.errorParam1 == null)? 0 :this.errorParam1 .hashCode()));
        result = ((result* 31)+((this.errorParam4 == null)? 0 :this.errorParam4 .hashCode()));
        result = ((result* 31)+((this.errorMsg == null)? 0 :this.errorMsg.hashCode()));
        result = ((result* 31)+((this.errorParam3 == null)? 0 :this.errorParam3 .hashCode()));
        result = ((result* 31)+((this.node == null)? 0 :this.node.hashCode()));
        result = ((result* 31)+((this.errorParam5 == null)? 0 :this.errorParam5 .hashCode()));
        result = ((result* 31)+((this.rootCause == null)? 0 :this.rootCause.hashCode()));
        result = ((result* 31)+((this.errorId == null)? 0 :this.errorId.hashCode()));
        result = ((result* 31)+((this.errorMsgId == null)? 0 :this.errorMsgId.hashCode()));
        result = ((result* 31)+((this.errorTs == null)? 0 :this.errorTs.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ApiErrorTO) == false) {
            return false;
        }
        ApiErrorTO rhs = ((ApiErrorTO) other);
        return ((((((((((((((this.errorParam2 == rhs.errorParam2)||((this.errorParam2 != null)&&this.errorParam2 .equals(rhs.errorParam2)))&&((this.compName == rhs.compName)||((this.compName!= null)&&this.compName.equals(rhs.compName))))&&((this.rootCauseAnalysis == rhs.rootCauseAnalysis)||((this.rootCauseAnalysis!= null)&&this.rootCauseAnalysis.equals(rhs.rootCauseAnalysis))))&&((this.errorParam1 == rhs.errorParam1)||((this.errorParam1 != null)&&this.errorParam1 .equals(rhs.errorParam1))))&&((this.errorParam4 == rhs.errorParam4)||((this.errorParam4 != null)&&this.errorParam4 .equals(rhs.errorParam4))))&&((this.errorMsg == rhs.errorMsg)||((this.errorMsg!= null)&&this.errorMsg.equals(rhs.errorMsg))))&&((this.errorParam3 == rhs.errorParam3)||((this.errorParam3 != null)&&this.errorParam3 .equals(rhs.errorParam3))))&&((this.node == rhs.node)||((this.node!= null)&&this.node.equals(rhs.node))))&&((this.errorParam5 == rhs.errorParam5)||((this.errorParam5 != null)&&this.errorParam5 .equals(rhs.errorParam5))))&&((this.rootCause == rhs.rootCause)||((this.rootCause!= null)&&this.rootCause.equals(rhs.rootCause))))&&((this.errorId == rhs.errorId)||((this.errorId!= null)&&this.errorId.equals(rhs.errorId))))&&((this.errorMsgId == rhs.errorMsgId)||((this.errorMsgId!= null)&&this.errorMsgId.equals(rhs.errorMsgId))))&&((this.errorTs == rhs.errorTs)||((this.errorTs!= null)&&this.errorTs.equals(rhs.errorTs))));
    }

}
