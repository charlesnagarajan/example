package com.exel.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@RequestMapping("/name")
	public String getName() {
		String my = "Charles Nagarajan";
		return my;
	}

	@RequestMapping("/number")
	public String getMobile() {
		String number = "+91-8489876672";
		return number;

	}

	@RequestMapping("/age")
	public int getAge() {
		int age = 10;
		return age;
	}

	public float getSalary() {
		float salary = (float) 10000.50;
		return salary;
	}
    
	@RequestMapping("/salary")
	public double diplaySalary() {
		System.out.println("my salary");
		return getSalary();
	}
	@RequestMapping("/address")
	public String getAddress() {
		String add="semmanahalli (vill),palacode(tk),dharmapuri(dt)";
		return add;
		
	}

}
