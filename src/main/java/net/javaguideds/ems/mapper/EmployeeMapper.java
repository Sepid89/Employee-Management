package net.javaguideds.ems.mapper;

import net.javaguideds.ems.dto.EmployeeDto;
import net.javaguideds.ems.entity.Employee;

public class EmployeeMapper {
    public static EmployeeDto mapToEmployeeDto(Employee employee){
        return new EmployeeDto(
                employee.getID(),
                employee.getFirstName(),
                employee.getLastName(),
                employee.getEmail()
        );
    }
}
