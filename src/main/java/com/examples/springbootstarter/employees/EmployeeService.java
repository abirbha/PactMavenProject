package com.examples.springbootstarter.employees;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

	private List<EmployeeDetails> empDetails = new ArrayList(
			Arrays.asList(new EmployeeDetails("1", "Muthu", "Development"),
					new EmployeeDetails("2", "Raj", "Development"), new EmployeeDetails("3", "Kanna", "Development")

			));

	public List<EmployeeDetails> getEmployeeList() {
		return empDetails;
	}

	public void addEmployee(EmployeeDetails employeeDetails) {
		empDetails.add(employeeDetails);
	}

}
