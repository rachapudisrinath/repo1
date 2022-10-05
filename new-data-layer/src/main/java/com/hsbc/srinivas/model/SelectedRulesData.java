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
public class SelectedRulesData {
	
	@JsonProperty("id")
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@JsonProperty("fieldName")
	private String selectedRulesTitle = "Selected Rules (H)";
	
	@JsonProperty("fieldValue")
	private String selectedRulesValue = "";
	
	@JsonProperty("linkStatus")
	@Transient
	private String linkStatus = "";

	@JsonProperty ("children1")
	@ManyToMany(fetch=FetchType.EAGER, cascade = CascadeType.ALL)
	private List<Rule> rules = new ArrayList<Rule>() ;
	
	@JsonProperty ("children2")
	@Transient
	private List<Object> dummy = new ArrayList<Object>() ;

	public SelectedRulesData() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSelectedRulesTitle() {
		return selectedRulesTitle;
	}

	public void setSelectedRulesTitle(String selectedRulesTitle) {
		this.selectedRulesTitle = selectedRulesTitle;
	}

	public String getSelectedRulesValue() {
		return selectedRulesValue;
	}

	public void setSelectedRulesValue(String selectedRulesValue) {
		this.selectedRulesValue = selectedRulesValue;
	}

	public String getLinkStatus() {
		return linkStatus;
	}

	public void setLinkStatus(String linkStatus) {
		this.linkStatus = linkStatus;
	}

	public List<Rule> getRules() {
		return rules;
	}

	public void setRules(List<Rule> rules) {
		this.rules = rules;
	}

	public List<Object> getDummy() {
		return dummy;
	}

	public void setDummy(List<Object> dummy) {
		this.dummy = dummy;
	}
	
	

}
