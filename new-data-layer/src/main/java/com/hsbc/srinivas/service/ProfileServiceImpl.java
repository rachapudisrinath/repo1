package com.hsbc.srinivas.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hsbc.srinivas.model.GeneralData;
import com.hsbc.srinivas.model.GeneralDetails;
import com.hsbc.srinivas.model.OfficeData;
import com.hsbc.srinivas.model.Profile;
import com.hsbc.srinivas.model.ProfileDetails;
import com.hsbc.srinivas.model.Rule;
import com.hsbc.srinivas.model.RuleTypeDetailsData;
import com.hsbc.srinivas.model.RuleTypeHeader;
import com.hsbc.srinivas.model.SelectedRulesData;
import com.hsbc.srinivas.repo.ProfileRepository;


@Service
public class ProfileServiceImpl implements ProfileService{

	@Autowired
	private ProfileRepository profileRepository;
	
	@Override
	public List<Profile> addProfiles() {
		
		ArrayList<Rule> rules = new ArrayList<>();
		
		Rule rule = new Rule();
		rule.setRuleValue("HKDRPCCJPE");
		rules.add(rule);
		
		
		rule = new Rule();
		rule.setRuleValue("HKDRPCCUSD");
		rules.add(rule);
		
		
		rule = new Rule();
		rule.setRuleValue("HKDRPCCEUR");
		rules.add(rule);
		
		rule = new Rule();
		rule.setRuleValue("HKDRPCCEUB");
		rules.add(rule);
		
		
		rule = new Rule();
		rule.setRuleValue("HKDRPCCINR");
		rules.add(rule);
		
		rule = new Rule();
		rule.setRuleValue("HKDRCCPNZD");
		rules.add(rule);
		
		rule = new Rule();
		rule.setRuleValue("HKDRCCPSEK");
		rules.add(rule);
		
		////
		ArrayList<Rule> rules2 = new ArrayList<>();
		
		rule = new Rule();
		rule.setRuleValue("HKDRPCCJPE");
		rules2.add(rule);
		
		
		rule = new Rule();
		rule.setRuleValue("HKDRPCCUSD");
		rules2.add(rule);
		
		
		rule = new Rule();
		rule.setRuleValue("HKDRPCCEUR");
		rules2.add(rule);
		
		
		rule = new Rule();
		rule.setRuleValue("HKDRPCCINR");
		rules2.add(rule);
		
		rule = new Rule();
		rule.setRuleValue("HKDRCCPNZD");
		rules2.add(rule);
		
		rule = new Rule();
		rule.setRuleValue("HKDRCCPSEK");
		rules2.add(rule);

		//////

		////
		ArrayList<Rule> rules3 = new ArrayList<>();
		
		rule = new Rule();
		rule.setRuleValue("HKDRPCCJPE");
		rules3.add(rule);
		
		
		rule = new Rule();
		rule.setRuleValue("HKDRPCCUSD");
		rules3.add(rule);
		
		
		rule = new Rule();
		rule.setRuleValue("HKDRPCCEUR");
		rules3.add(rule);
		
		
		rule = new Rule();
		rule.setRuleValue("HKDRPCCINR");
		rules3.add(rule);
		
		rule = new Rule();
		rule.setRuleValue("HKDRCCPNZD");
		rules3.add(rule);
		
		rule = new Rule();
		rule.setRuleValue("HKDRCCPSEK");
		rules3.add(rule);

		//////
		
		
		RuleTypeDetailsData ruleTypeDetailsData1 = new RuleTypeDetailsData();
		ruleTypeDetailsData1.setRuleTypeDetailsValue("Account Debit Auhentication");
		ArrayList<SelectedRulesData> selectedRules1 = new ArrayList<SelectedRulesData>();
		SelectedRulesData selectedRulesData = new SelectedRulesData();
		selectedRulesData.setRules(new ArrayList<Rule>(rules));
		selectedRules1.add(selectedRulesData);
		ruleTypeDetailsData1.setSelectedRules(selectedRules1);

		// Prepare generalDataList to populate in ruleTypeDetailsData
		ArrayList<GeneralDetails> generalDetails1 = new ArrayList<GeneralDetails>();
		GeneralDetails gDetails1 = new GeneralDetails();
		gDetails1.setGeneralDetailsValue("HK1 - HSBC HK");
		generalDetails1.add(gDetails1);
		
		GeneralData gData1 = new GeneralData();
		gData1.setGeneralDetails(generalDetails1);
		
		ArrayList<GeneralData> generalDataList1 = new ArrayList<GeneralData>();
		generalDataList1.add(gData1);
		ruleTypeDetailsData1.setGeneralDataList(generalDataList1);
		
		// TODO ad Genera
		
		
		RuleTypeDetailsData ruleTypeDetailsData2 = new RuleTypeDetailsData();
		ruleTypeDetailsData2.setRuleTypeDetailsValue("Byepass Debit Fee");
		
		ArrayList<SelectedRulesData> selectedRules2 = new ArrayList<SelectedRulesData>();
		SelectedRulesData selectedRulesData2 = new SelectedRulesData();
		selectedRulesData2.setRules(rules2);
		selectedRules2.add(selectedRulesData2);
		ruleTypeDetailsData2.setSelectedRules(new ArrayList<SelectedRulesData>(selectedRules2));
		
		// Prepare generalDataList to populate in ruleTypeDetailsData
		ArrayList<GeneralDetails> generalDetails2 = new ArrayList<GeneralDetails>();
		GeneralDetails gDetails2 = new GeneralDetails();
		gDetails2.setGeneralDetailsValue("HK1 - HSBC HK");
		generalDetails2.add(gDetails2);
		
		GeneralData gData2 = new GeneralData();
		gData2.setGeneralDetails(generalDetails2);
		
		ArrayList<GeneralData> generalDataList2 = new ArrayList<GeneralData>();
		generalDataList2.add(gData2);
		ruleTypeDetailsData2.setGeneralDataList(generalDataList2);
		
		RuleTypeDetailsData ruleTypeDetailsData3 = new RuleTypeDetailsData();
		ruleTypeDetailsData3.setRuleTypeDetailsValue("Byepass Credit Fee");
		
		ArrayList<SelectedRulesData> selectedRules3 = new ArrayList<SelectedRulesData>();
		SelectedRulesData selectedRulesData3 = new SelectedRulesData();
		selectedRulesData3.setRules(rules3);
		selectedRules3.add(selectedRulesData3);
		ruleTypeDetailsData3.setSelectedRules(new ArrayList<SelectedRulesData>(selectedRules3));
		
		// Prepare generalDataList to populate in ruleTypeDetailsData
		ArrayList<GeneralDetails> generalDetails3 = new ArrayList<GeneralDetails>();
		GeneralDetails gDetails3 = new GeneralDetails();
		gDetails3.setGeneralDetailsValue("HK1 - HSBC HK");
		generalDetails3.add(gDetails3);
		
		GeneralData gData3 = new GeneralData();
		gData3.setGeneralDetails(generalDetails3);
		
		ArrayList<GeneralData> generalDataList3 = new ArrayList<GeneralData>();
		generalDataList3.add(gData3);
		ruleTypeDetailsData3.setGeneralDataList(generalDataList3);
		
		ArrayList<RuleTypeDetailsData> ruleTypeDetailsDataList = new ArrayList<RuleTypeDetailsData>();
		ruleTypeDetailsDataList.add(ruleTypeDetailsData1);
		ruleTypeDetailsDataList.add(ruleTypeDetailsData2);
		ruleTypeDetailsDataList.add(ruleTypeDetailsData3);
		
		
		ArrayList<OfficeData> officeData = new ArrayList<OfficeData>();
		
		OfficeData offData = new OfficeData();
		offData.setOfficeDataTitle("Office Name(H))");
		offData.setOfficeDataValue("HSBC HK");
		officeData.add(offData);
		
		offData = new OfficeData();
		offData.setOfficeDataTitle("Office Number(H))");
		offData.setOfficeDataValue("HK1");
		officeData.add(offData);
		
		ProfileDetails profileDetails = new ProfileDetails();
		profileDetails.setOfficeData(officeData);
		
		ArrayList<ProfileDetails> profileDetailsList = new ArrayList<ProfileDetails>();
		profileDetailsList.add(profileDetails);
		
	
		
		
		RuleTypeHeader ruleTypeHeader = new RuleTypeHeader();
		ruleTypeHeader.setRuleTypeDetailsList(ruleTypeDetailsDataList);
		List<RuleTypeHeader> ruleTypeHeaderList = new ArrayList<RuleTypeHeader>();
		ruleTypeHeaderList.add(ruleTypeHeader);
		
		
		Profile profile1 = new Profile();
		profile1.setPofileValue("HK1 Profile");
		profile1.setProfileDetails(profileDetailsList);
	//	profile1.setRuleTypeDetails(ruleTypeDetailsDataList);
		profile1.setRuleTypeHeadersList(ruleTypeHeaderList);

		ArrayList<Profile> profileList = new ArrayList<Profile>();
		 profileList.add(profile1);
		//profileList.add(profile2);
		//profileList.add(profile3);
	
		profileRepository.saveAll(profileList);
		return profileList;
	}

	@Override
	public List<Profile> getProfiles() {
		return profileRepository.findAll();
	}

}
