package com.exel.demo.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exel.demo.pojo.PersonalInfo;

@RestController
public class PersonalInfoController {

	@RequestMapping("/PersonalInfo")
	public PersonalInfo getPersonalInfo() {
		PersonalInfo obj = new PersonalInfo();
		obj.setName("CharlesNagarajan");
		obj.setAge(20);
		obj.setGender("male");
		obj.setNumber("+91-8489876672");
		obj.setSalary(10000.500f);
		obj.setAddress("semmanahalli (vill),palacode(tk),dharmapuri(dt)");
		obj.setMaritalStatus(false);

		return obj;

	}

	@RequestMapping(value = "/Info", produces = MediaType.APPLICATION_XML_VALUE)
	public PersonalInfo getPersonalInfoXmL() {
		PersonalInfo obj = new PersonalInfo();
		obj.setName("CharlesNagarajan");
		obj.setAge(20);
		obj.setGender("male");
		obj.setNumber("+91-8489876672");
		obj.setSalary(10000.500f);
		obj.setAddress("semmanahalli (vill),palacode(tk),dharmapuri(dt)");
		obj.setMaritalStatus(false);

		return obj;

	}

}
