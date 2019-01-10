package com.office.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.office.model.Employee;

@RestController
public class OfficeController {
	
	@Autowired
	Employee emp;
	
	@GetMapping(path="/getEmployee")
	public ResponseEntity<Map> getEmp() {
		
		Employee emp1=new Employee();
		emp1.setEmpNo(1);
		emp1.setEmpName("Sreekanth");
		
		Employee emp2=new Employee();
		emp2.setEmpNo(2);
		emp2.setEmpName("Sreenath");
		
		Map<Integer,Employee> map=new HashMap();
		map.put(1,emp1);
		map.put(2, emp2);
		
		return ResponseEntity.ok(map);
	}
	
	@PostMapping(value="/addEmployee")
	public ResponseEntity addEmp(@RequestBody Employee emp) {
		return new ResponseEntity("BAD",HttpStatus.BAD_REQUEST);
		
	}
	
	
	
}
