package com.tka.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.tka.dao.Dao;
import com.tka.entity.Candidate;

@org.springframework.stereotype.Service
public class Service implements ServiceInterface {

	@Autowired
	Dao dao;

	@Override
	public List<Candidate> getallcandidateAPI() {
		// TODO Auto-generated method stub
		List<Candidate> getallcandidatelist = dao.getallcandidateAPI();
		return getallcandidatelist;
	}

	@Override
	public String insertcandidateAPI(Candidate can) {
		// TODO Auto-generated method stub
		return dao.insertcandidateAPI(can);
	}

	@Override
	public String updatecandidateAPI(int c_id, String name, String partyname, String assembly, String statename,
			String gender, int age) {
		// TODO Auto-generated method stub
		return dao.updatecandidateAPI(c_id, name, partyname, assembly, statename, gender, age);
	}

	@Override
	public String deletecandidateAPI(int c_id) {
		// TODO Auto-generated method stub
		return dao.deletecandidateAPI(c_id);
	}

	@Override
	public List<Candidate> getcandidatebyPartynameAPI(String partyname) {
		// TODO Auto-generated method stub
		return dao.getcandidatebyPartynameAPI(partyname);
	}

	@Override
	public List<Candidate> getcandidatebyStatenameAPI(String statename) {
		// TODO Auto-generated method stub
		return dao.getcandidatebyStatenameAPI(statename);
	}

}
