package com.tka.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name = "NewCandidate")
public class Candidate {
	@Id
	private int c_id;
	private String name;
	private String partyname;
	private String assembly;
	private String statename;
	private String gender;
	private int age;

	public Candidate() {
		super();
	}

	public Candidate(int c_id, String name, String partyname, String assembly, String statename, String gender,
			int age) {
		super();
		this.c_id = c_id;
		this.name = name;
		this.partyname = partyname;
		this.assembly = assembly;
		this.statename = statename;
		this.gender = gender;
		this.age = age;
	}

	public int getC_id() {
		return c_id;
	}

	public void setC_id(int c_id) {
		this.c_id = c_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPartyname() {
		return partyname;
	}

	public void setPartyname(String partyname) {
		this.partyname = partyname;
	}

	public String getAssembly() {
		return assembly;
	}

	public void setAssembly(String assembly) {
		this.assembly = assembly;
	}

	public String getStatename() {
		return statename;
	}

	public void setStatename(String statename) {
		this.statename = statename;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Candidate [c_id=" + c_id + ", name=" + name + ", partyname=" + partyname + ", statename=" + statename
				+ "]";
	}

}
