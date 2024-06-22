package com.example.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Employee;
import com.example.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	private EmployeeService service;

	public EmployeeController(EmployeeService service) {
		this.service = service;
	}

	@PostMapping(value = "/add")
	public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee) {
		return new ResponseEntity<>(service.saveData(employee), HttpStatus.OK);
	}

	@GetMapping(value = "/getAll")
	public ResponseEntity<List<Employee>> getEmployees() {
		return new ResponseEntity<>(service.getAllData(), HttpStatus.OK);
	}

	@GetMapping(value = "/{eid}")
	public ResponseEntity<Employee> getEmployee(@PathVariable("eid") int eid) {
		return new ResponseEntity<>(service.getData(eid), HttpStatus.OK);
	}

	@PutMapping(value = "/update")
	public ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee) {
		return new ResponseEntity<>(service.saveData(employee), HttpStatus.OK);
	}

	@DeleteMapping(value = "/delete")
	public ResponseEntity<List<Employee>> deleteEmployee(@PathVariable("eid") int eid) {
		return new ResponseEntity<>(service.deleteData(eid), HttpStatus.OK);
	}

}
