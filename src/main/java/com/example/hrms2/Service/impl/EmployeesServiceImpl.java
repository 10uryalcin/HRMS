package com.example.hrms2.Service.impl;

import com.example.hrms2.Service.EmployeesService;
import com.example.hrms2.model.Dto.EmployeesDto;
import com.example.hrms2.model.Employees;
import com.example.hrms2.repository.EmployeesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class EmployeesServiceImpl implements EmployeesService {

    @Autowired
    private EmployeesRepository employeeRepository;

    private EmployeesDto mapToEmployeesDto(Employees employees){
        EmployeesDto employeesDto = EmployeesDto.builder()
                .employeeId(employees.getEmployeeId())
                .firstName(employees.getFirstName())
                .lastName(employees.getLastName())
            //    .address(employees.getAddress())
                .build();
        return  employeesDto;
    }

    private Employees mapToEmployees(EmployeesDto employees) {
        Employees employees1 = Employees.builder()
                .employeeId(employees.getEmployeeId())
                .firstName(employees.getFirstName())
                .lastName(employees.getLastName())
                //    .address(employees.getAddress())
                .build();
        return employees1;
    }

    @Override
    public List<EmployeesDto> getAllEmployees() {
        List<Employees> employees = employeeRepository.findAll();
        return employees.stream().map((employee) -> mapToEmployeesDto(employee)).collect(Collectors.toList());
    }



    @Override
    public EmployeesDto getEmployeeById(long employeeId) {
        Employees employees = employeeRepository.findById(employeeId).get();
        return mapToEmployeesDto(employees);
    }

    @Override
    public Employees createEmployee(EmployeesDto employeesDto) {
        Employees employees = mapToEmployees(employeesDto);
        return employeeRepository.save(employees);
    }


    @Override
    public void updateEmployee(EmployeesDto employeesDto) {
        Employees employees = mapToEmployees(employeesDto);
    employeeRepository.save(employees);
    }



    @Override
    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }





}

