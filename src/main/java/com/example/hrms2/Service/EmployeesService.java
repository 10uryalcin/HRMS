package com.example.hrms2.Service;

import com.example.hrms2.model.Dto.EmployeesDto;
import com.example.hrms2.model.Employees;

import java.util.List;


public interface EmployeesService {


    public List<EmployeesDto> getAllEmployees() ;


    EmployeesDto getEmployeeById(long employeeId);

    public Employees createEmployee(EmployeesDto employeeDto) ;

    void updateEmployee(EmployeesDto employeesDto) ;



    void deleteEmployee(Long id) ;


}
