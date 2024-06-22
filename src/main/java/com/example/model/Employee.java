package com.example.model;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document
public class Employee {

	@Id
	private int empId;

	private String empName;

	private String designation;

	private double salary;

	private long contactNo;

}
