package com.tka.service;

import java.util.List;

import com.tka.entity.Candidate;

public interface ServiceInterface {

	public List<Candidate> getallcandidateAPI();

	public String insertcandidateAPI(Candidate can);

	public String updatecandidateAPI(int c_id, String name, String partyname, String assembly, String statename,
			String gender, int age);

	public String deletecandidateAPI(int c_id);

	public List<Candidate> getcandidatebyPartynameAPI(String partyname);

	public List<Candidate> getcandidatebyStatenameAPI(String statename);
}
