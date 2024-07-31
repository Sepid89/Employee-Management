package net.javaguideds.ems.service.imp;

import lombok.AllArgsConstructor;
import net.javaguideds.ems.dto.EmployeeDto;
import net.javaguideds.ems.entity.Employee;
import net.javaguideds.ems.exception.ResourceNotFoundException;
import net.javaguideds.ems.mapper.EmployeeMapper;
import net.javaguideds.ems.repository.EmployeeRepository;
import net.javaguideds.ems.service.EmployeeService;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmployeeServiceImp implements EmployeeService {
    private EmployeeRepository employeeRepository;
    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {
        Employee employee = EmployeeMapper.mapTtoEmployee(employeeDto);
        Employee savedEmployee = employeeRepository.save(employee);

        return EmployeeMapper.mapToEmployeeDto(savedEmployee);
    }

    @Override
    public EmployeeDto getEmployeeById(Long id) {
       Employee employee = employeeRepository.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("Employee is not exist with given id: " + id));
        return EmployeeMapper.mapToEmployeeDto(employee);
    }

}
