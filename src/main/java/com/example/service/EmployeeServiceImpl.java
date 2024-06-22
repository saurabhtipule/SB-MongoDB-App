package com.example.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.model.Employee;
import com.example.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeRepository repo;

	public EmployeeServiceImpl(EmployeeRepository repo) {
		this.repo = repo;
	}

	@Override
	public Employee saveData(Employee employee) {
		return repo.save(employee);
	}

	@Override
	public List<Employee> getAllData() {
		return repo.findAll();
	}

	@Override
	public Employee getData(int eid) {
		return repo.findById(eid).get();
	}

	@Override
	public List<Employee> deleteData(int eid) {
		repo.deleteById(eid);
		return repo.findAll();
	}
}
