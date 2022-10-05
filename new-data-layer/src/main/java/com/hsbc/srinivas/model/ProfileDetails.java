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
public class ProfileDetails {
	
	@JsonProperty("id")
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	Long id;
	
	@JsonProperty("fieldName")
	private String profileDetailsTitle = "(H)Profile Details";
	
	@JsonProperty("fieldValue")
	private String pofileDetailsValue; 
	
	@JsonProperty("linkStatus")
	@Transient
	private String linkStatus = "";
	
	@JsonProperty ("children1")
	@ManyToMany(fetch=FetchType.EAGER, cascade = CascadeType.ALL)
	private List<OfficeData> officeData = new ArrayList<OfficeData>() ;
	
	@JsonProperty ("children2")
	@Transient
	private List<Object> dummy = new ArrayList<Object>() ;

	public ProfileDetails() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProfileDetailsTitle() {
		return profileDetailsTitle;
	}

	public void setProfileDetailsTitle(String profileDetailsTitle) {
		this.profileDetailsTitle = profileDetailsTitle;
	}

	public String getPofileDetailsValue() {
		return pofileDetailsValue;
	}

	public void setPofileDetailsValue(String pofileDetailsValue) {
		this.pofileDetailsValue = pofileDetailsValue;
	}

	public String getLinkStatus() {
		return linkStatus;
	}

	public void setLinkStatus(String linkStatus) {
		this.linkStatus = linkStatus;
	}

	public List<OfficeData> getOfficeData() {
		return officeData;
	}

	public void setOfficeData(List<OfficeData> officeData) {
		this.officeData = officeData;
	}

	public List<Object> getDummy() {
		return dummy;
	}

	public void setDummy(List<Object> dummy) {
		this.dummy = dummy;
	}


}
