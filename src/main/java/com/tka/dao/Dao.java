package com.tka.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tka.entity.Candidate;

@Repository
public class Dao implements DaoInterface {

	Dao dao;
	@Autowired
	SessionFactory sf;

	@Override
	public List<Candidate> getallcandidateAPI() {
		// TODO Auto-generated method stub
		Session session = sf.openSession();
		Criteria createCriteria = session.createCriteria(Candidate.class);
		List<Candidate> list = createCriteria.list();
		System.out.println("Get All Candidate");
		return list;
	}

	@Override
	public String insertcandidateAPI(Candidate can) {
		// TODO Auto-generated method stub
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		session.save(can);
		tx.commit();
		return "Candidate Added Successfully!..";
	}

	@Override
	public String updatecandidateAPI(int c_id, String name, String partyname, String assembly, String statename,
			String gender, int age) {
		// TODO Auto-generated method stub
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		Candidate candidate = session.get(Candidate.class, c_id);
		if (candidate == null) {
			return "Candidate ID " + c_id + " not found!";
		}
		candidate.setC_id(c_id);
		candidate.setName(statename);
		candidate.setPartyname(partyname);
		candidate.setStatename(statename);
		candidate.setGender(gender);
		candidate.setAge(age);
		session.saveOrUpdate(candidate);
		tx.commit();
		return "Candidate Updated Successfully!..";
	}

	@Override
	public String deletecandidateAPI(int c_id) {
		// TODO Auto-generated method stub
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		Candidate candidate = session.get(Candidate.class, c_id);
		if (candidate == null) {
			return "Candidate ID" + c_id + "not found";
		}
		session.delete(candidate);
		tx.commit();
		return "Candidate Deleted Successfully!..";
	}

	@Override
	public List<Candidate> getcandidatebyPartynameAPI(String partyname) {
		// TODO Auto-generated method stub
		List<Candidate> getallcandidate = this.getallcandidateAPI();
		ArrayList<Candidate> db = new ArrayList<Candidate>();
		for (Candidate candidate : getallcandidate) {
			if (candidate.getPartyname().equalsIgnoreCase(partyname)) {
				db.add(candidate);
			}
			System.out.println(candidate);

		}
		return null;
	}

	@Override
	public List<Candidate> getcandidatebyStatenameAPI(String statename) {
		// TODO Auto-generated method stub
		List<Candidate> getallcandidate = this.getallcandidateAPI();
		ArrayList<Candidate> db1 = new ArrayList<Candidate>();
		for (Candidate candidate : getallcandidate) {
			if (candidate.getStatename().equalsIgnoreCase(statename)) {
				db1.add(candidate);
			}
			System.out.println(candidate);
		}
		return null;
	}

}
