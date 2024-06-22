package com.example.service;

import java.util.List;

import com.example.model.Employee;

public interface EmployeeService {

	Employee saveData(Employee employee);

	List<Employee> getAllData();

	Employee getData(int eid);

	List<Employee> deleteData(int eid);

}
