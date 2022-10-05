package com.hsbc.srinivas.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class RuleTypeHeader {
	
	@JsonProperty("id")
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@JsonProperty("fieldName")
	private String ruleTypeHeaderTitle = "(H)Rule Types";
	
	@JsonProperty("fieldValue")
	private String ruleTypeHeaderValue = "";
	
	@JsonProperty("linkStatus")
	@Transient
	private String linkStatus = "";
	
	@JsonProperty ("children1")
	@ManyToMany(fetch=FetchType.EAGER, cascade = CascadeType.ALL)
	private List<RuleTypeDetailsData> ruleTypeDetailsList = new ArrayList<RuleTypeDetailsData>() ;
	
	@JsonProperty ("children2")
	@Transient
	private List<Object> dummy = new ArrayList<Object>() ;

	public RuleTypeHeader() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRuleTypeHeaderTitle() {
		return ruleTypeHeaderTitle;
	}

	public void setRuleTypeHeaderTitle(String ruleTypeHeaderTitle) {
		this.ruleTypeHeaderTitle = ruleTypeHeaderTitle;
	}

	public String getRuleTypeHeaderValue() {
		return ruleTypeHeaderValue;
	}

	public void setRuleTypeHeaderValue(String ruleTypeHeaderValue) {
		this.ruleTypeHeaderValue = ruleTypeHeaderValue;
	}

	public String getLinkStatus() {
		return linkStatus;
	}

	public void setLinkStatus(String linkStatus) {
		this.linkStatus = linkStatus;
	}

	public List<RuleTypeDetailsData> getRuleTypeDetailsList() {
		return ruleTypeDetailsList;
	}

	public void setRuleTypeDetailsList(List<RuleTypeDetailsData> ruleTypeDetailsList) {
		this.ruleTypeDetailsList = ruleTypeDetailsList;
	}

	public List<Object> getDummy() {
		return dummy;
	}

	public void setDummy(List<Object> dummy) {
		this.dummy = dummy;
	}
	
	


}
