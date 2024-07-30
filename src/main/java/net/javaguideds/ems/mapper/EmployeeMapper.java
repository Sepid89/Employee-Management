package net.javaguideds.ems.mapper;

import net.javaguideds.ems.dto.EmployeeDto;
import net.javaguideds.ems.entity.Employee;

public class EmployeeMapper {
    public static EmployeeDto mapToEmployeeDto(Employee employee){
        return new EmployeeDto(
                employee.getId(),
                employee.getFirstname(),
                employee.getLastname(),
                employee.getEmail()
        );
    }
}
