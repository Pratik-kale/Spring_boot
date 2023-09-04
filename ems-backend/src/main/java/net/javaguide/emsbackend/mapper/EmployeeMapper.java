package net.javaguide.emsbackend.mapper;

import net.javaguide.emsbackend.dto.EmployeeDto;
import net.javaguide.emsbackend.entity.Employee;

public class EmployeeMapper {

    public static EmployeeDto mapToEmloyeeDto(Employee employee){
        return new EmployeeDto(

                employee.getId(),
                employee.getFirst_name(),
                employee.getLast_name(),
                employee.getEmail()
        );
    }

    public static Employee mapToEmployee(EmployeeDto employeeDto){
        return new Employee(

                employeeDto.getId(),
                employeeDto.getFirst_name(),
                employeeDto.getLast_name(),
                employeeDto.getEmail()
        );
    }




};
