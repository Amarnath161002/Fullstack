package com.example.myapp.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.myapp.dto.EmployeeDto;
import com.example.myapp.entity.Employee;
import com.example.myapp.mapper.EmployeeMapper;
import com.example.myapp.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeRepository employeeRepository;
	//@Override
//	public EmployeeDto createEmployee(Employee employeeDto) {
//		Employee employee = EmployeeMapper.mapToEmployee(employeeDto);
//		Employee createEmployee =employeeRepository.save(employee);
//		return EmployeeMapper.mapEmployeeDto(createEmployee);
//	}
	@Override
	public EmployeeDto createEmployee(EmployeeDto employeeDto) {
		Employee employee = EmployeeMapper.mapToEmployee(employeeDto);
		Employee createEmployee =employeeRepository.save(employee);
		return EmployeeMapper.mapEmployeeDto(createEmployee);
	
	}
	@Override
	public EmployeeDto getEmployeeById(Long employeeId) {
		Employee employee = employeeRepository.findById(employeeId).orElseThrow(null);
		return EmployeeMapper.mapEmployeeDto(employee);
	}
	@Override
	public List<EmployeeDto> getAllEmployees() {
		List<Employee> employees = employeeRepository.findAll();
		return employees.stream().map((employee) -> EmployeeMapper.mapEmployeeDto(employee)).collect(Collectors.toList());
	}
	@Override
	public EmployeeDto updateEmployee(Long employeeId, EmployeeDto updateEmployee) {
		Employee employee = employeeRepository.findById(employeeId).orElseThrow();
		employee.setFirstName(updateEmployee.getFirstName());;
		employee.setLastName(updateEmployee.getLastName());
		employee.setEmail(updateEmployee.getEmail());
		Employee updatedEmployee = employeeRepository.save(employee);
		return  EmployeeMapper.mapEmployeeDto(updatedEmployee);
	}
	@Override
	public void deleteEmployee(Long employeeId) {
		Employee employee = employeeRepository.findById(employeeId).orElseThrow();
		employeeRepository.deleteById(employeeId);
	}

}
