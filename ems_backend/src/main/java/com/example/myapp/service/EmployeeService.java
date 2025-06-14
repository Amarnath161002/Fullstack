package com.example.myapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.myapp.dto.EmployeeDto;
//import com.example.myapp.entity.Employee;

@Service
public interface EmployeeService {

	EmployeeDto createEmployee(EmployeeDto employeeDto);
	
	EmployeeDto getEmployeeById(Long employeeId);
	
	List<EmployeeDto> getAllEmployees();
	
	EmployeeDto updateEmployee(Long employeeId,EmployeeDto updateEmployee);
	
	void deleteEmployee(Long employeeId);
	
}
