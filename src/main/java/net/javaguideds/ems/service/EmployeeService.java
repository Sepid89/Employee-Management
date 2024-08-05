package net.javaguideds.ems.service;

import net.javaguideds.ems.dto.EmployeeDto;

import java.util.List;

public interface EmployeeService {
    EmployeeDto createEmployee(EmployeeDto employeeDto);

    EmployeeDto getEmployeeById(Long id);

    List<EmployeeDto> getAllEmployees();

    void deleteEmployeeById(Long id);

    EmployeeDto updateEmployee(Long id, EmployeeDto employeeDto);
}
