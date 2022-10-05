package com.hsbc.srinivas.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({ "id", "fieldName", "fieldValue","children" })
@Entity
public class Rule {

	@JsonProperty("id")
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@JsonProperty("fieldName")
	private String ruleName = "";
	
	@JsonProperty("fieldValue")
	private String ruleValue ="EgHKDRPCCJEP";
	
	@JsonProperty("linkStatus")
	@Transient
	private String linkStatus = "";
	
	
	@JsonProperty ("children1")
	@Transient
	private List<Object> dummy1 = new ArrayList<Object>();
	
	@JsonProperty ("children2")
	@Transient
	private List<Object> dummy2 = new ArrayList<Object>();

	public Rule() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRuleName() {
		return ruleName;
	}

	public void setRuleName(String ruleName) {
		this.ruleName = ruleName;
	}

	public String getRuleValue() {
		return ruleValue;
	}

	public void setRuleValue(String ruleValue) {
		this.ruleValue = ruleValue;
	}

	public String getLinkStatus() {
		return linkStatus;
	}

	public void setLinkStatus(String linkStatus) {
		this.linkStatus = linkStatus;
	}

	public List<Object> getDummy1() {
		return dummy1;
	}

	public void setDummy1(List<Object> dummy1) {
		this.dummy1 = dummy1;
	}

	public List<Object> getDummy2() {
		return dummy2;
	}

	public void setDummy2(List<Object> dummy2) {
		this.dummy2 = dummy2;
	}


	
	
	
	
}
