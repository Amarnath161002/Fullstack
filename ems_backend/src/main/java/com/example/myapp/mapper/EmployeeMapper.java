package com.example.myapp.mapper;

import com.example.myapp.dto.EmployeeDto;
import com.example.myapp.entity.Employee;

public class EmployeeMapper {

	public static EmployeeDto mapEmployeeDto(Employee employee) {
		return new EmployeeDto(
				employee.getId(),
				employee.getFirstName(),
				employee.getLastName(),
				employee.getEmail());
	}
	
	public static Employee mapToEmployee(EmployeeDto employeeDto) {
		return new Employee(
				employeeDto.getId(),
				employeeDto.getFirstName(),
				employeeDto.getLastName(),
				employeeDto.getEmail());
	}
}
