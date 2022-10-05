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
import javax.persistence.OneToMany;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class RuleTypeDetailsData {
	
	@JsonProperty("id")
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@JsonProperty("fieldName")
	private String ruleTypeDetailsTitle = "";
	
	@JsonProperty("fieldValue")
	private String ruleTypeDetailsValue = "";
	
	@JsonProperty("linkStatus")
	@Transient
	private String linkStatus = "";

	@JsonProperty("children1")
	@ManyToMany(fetch=FetchType.LAZY, cascade = CascadeType.ALL)
	private List<GeneralData> generalDataList = new ArrayList<GeneralData>() ;
	
	@JsonProperty("children2")
	@ManyToMany(fetch=FetchType.LAZY, cascade = CascadeType.ALL)
	private List<SelectedRulesData> selectedRules = new ArrayList<SelectedRulesData>() ;

	public RuleTypeDetailsData() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRuleTypeDetailsTitle() {
		return ruleTypeDetailsTitle;
	}

	public void setRuleTypeDetailsTitle(String ruleTypeDetailsTitle) {
		this.ruleTypeDetailsTitle = ruleTypeDetailsTitle;
	}

	public String getRuleTypeDetailsValue() {
		return ruleTypeDetailsValue;
	}

	public void setRuleTypeDetailsValue(String ruleTypeDetailsValue) {
		this.ruleTypeDetailsValue = ruleTypeDetailsValue;
	}

	public String getLinkStatus() {
		return linkStatus;
	}

	public void setLinkStatus(String linkStatus) {
		this.linkStatus = linkStatus;
	}

	public List<GeneralData> getGeneralDataList() {
		return generalDataList;
	}

	public void setGeneralDataList(List<GeneralData> generalDataList) {
		this.generalDataList = generalDataList;
	}

	public List<SelectedRulesData> getSelectedRules() {
		return selectedRules;
	}

	public void setSelectedRules(List<SelectedRulesData> selectedRules) {
		this.selectedRules = selectedRules;
	}
	
	

}
