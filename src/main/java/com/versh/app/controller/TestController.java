package com.versh.app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.versh.app.model.Employee;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class TestController {

	@RequestMapping(value = "/employee", method = RequestMethod.GET)
	public Employee firstPage() {

		Employee emp = new Employee();
		emp.setName("Ravi");
		emp.setDesignation("Developer");
		emp.setEmpId("1");
		emp.setSalary(10000000);
		return emp;
	}

}
