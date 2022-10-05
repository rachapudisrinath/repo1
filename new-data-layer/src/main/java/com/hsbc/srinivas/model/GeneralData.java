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
public class GeneralData {
	
	@JsonProperty("id")
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@JsonProperty("fieldName")
	private String generalDataTitle = "(H)General";
	
	@JsonProperty("fieldValue")
	private String generalDataValue = "";
	
	@JsonProperty("linkStatus")
	@Transient
	private String linkStatus = "";
	
	@JsonProperty ("children1")
	@ManyToMany(fetch=FetchType.EAGER, cascade = CascadeType.ALL)
	private List<GeneralDetails> generalDetails = new ArrayList<GeneralDetails>() ;
	
	@JsonProperty ("children2")
	@Transient
	private List<Object> dummy = new ArrayList<Object>() ;

	public GeneralData() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getGeneralDataTitle() {
		return generalDataTitle;
	}

	public void setGeneralDataTitle(String generalDataTitle) {
		this.generalDataTitle = generalDataTitle;
	}

	public String getGeneralDataValue() {
		return generalDataValue;
	}

	public void setGeneralDataValue(String generalDataValue) {
		this.generalDataValue = generalDataValue;
	}

	public String getLinkStatus() {
		return linkStatus;
	}

	public void setLinkStatus(String linkStatus) {
		this.linkStatus = linkStatus;
	}

	public List<GeneralDetails> getGeneralDetails() {
		return generalDetails;
	}

	public void setGeneralDetails(List<GeneralDetails> generalDetails) {
		this.generalDetails = generalDetails;
	}

	public List<Object> getDummy() {
		return dummy;
	}

	public void setDummy(List<Object> dummy) {
		this.dummy = dummy;
	}
	
	
	
	

}
