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
public class Profile  implements Cloneable  {
	
	@JsonProperty("id")
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	Long id;
	
	@JsonProperty("fieldName")
	private String profileName;
	
	@JsonProperty("fieldValue")
	private String pofileValue = "HK1 Profile";
	
	@JsonProperty("linkStatus")
	@Transient
	private String linkStatus = "";


	@JsonProperty ("children1")
	@ManyToMany(fetch=FetchType.LAZY, cascade = CascadeType.ALL)
	private List<ProfileDetails> profileDetails = new ArrayList<ProfileDetails>() ;
	
	@JsonProperty ("children2")
	@ManyToMany(fetch=FetchType.LAZY, cascade = CascadeType.ALL)
	private List<RuleTypeHeader> ruleTypeHeadersList = new ArrayList<RuleTypeHeader>() ;

	public Profile() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProfileName() {
		return profileName;
	}

	public void setProfileName(String profileName) {
		this.profileName = profileName;
	}

	public String getPofileValue() {
		return pofileValue;
	}

	public void setPofileValue(String pofileValue) {
		this.pofileValue = pofileValue;
	}

	public String getLinkStatus() {
		return linkStatus;
	}

	public void setLinkStatus(String linkStatus) {
		this.linkStatus = linkStatus;
	}

	public List<ProfileDetails> getProfileDetails() {
		return profileDetails;
	}

	public void setProfileDetails(List<ProfileDetails> profileDetails) {
		this.profileDetails = profileDetails;
	}

	
	public Object clone()throws CloneNotSupportedException{  
		return super.clone();  
	}

	public List<RuleTypeHeader> getRuleTypeHeadersList() {
		return ruleTypeHeadersList;
	}

	public void setRuleTypeHeadersList(List<RuleTypeHeader> ruleTypeHeadersList) {
		this.ruleTypeHeadersList = ruleTypeHeadersList;
	} 
	
	

}
