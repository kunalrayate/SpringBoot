package com.tka.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tka.entity.Candidate;
import com.tka.service.Service;

@RestController
public class Controller {

	@Autowired
	Service service;

	@GetMapping("/get")
	public List<Candidate> getallcandidateAPI() {
		List<Candidate> getallcandidatelist = service.getallcandidateAPI();
		return getallcandidatelist;
	}

	@PostMapping("/insert")
	public String insertcandidateAPI(@RequestBody Candidate can) {
		return service.insertcandidateAPI(can);
	}

	@PatchMapping("/update")
	public String updatecandidateAPI(@RequestParam int c_id, @RequestParam String name, @RequestParam String partyname,
			@RequestParam String assembly, @RequestParam String statename, @RequestParam String gender,
			@RequestParam int age) {
		return service.updatecandidateAPI(c_id, name, partyname, assembly, statename, gender, age);
	}

	@DeleteMapping("/delete")
	public String deletecandidateAPI(int c_id) {
		return service.deletecandidateAPI(c_id);
	}

	@GetMapping("/getbypartyname")
	public List<Candidate> getcandidatebyPartynameAPI(String partyname) {
		return service.getcandidatebyPartynameAPI(partyname);
	}

	@GetMapping("/getbystatename")
	public List<Candidate> getcandidateByStatenameAPI(String statename) {
		return service.getcandidatebyStatenameAPI(statename);
	}
}
