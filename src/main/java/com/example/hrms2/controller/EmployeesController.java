package com.example.hrms2.controller;

import com.example.hrms2.Service.EmployeesService;

import com.example.hrms2.model.Dto.EmployeesDto;
import com.example.hrms2.model.Employees;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeesController {
    @Autowired
    private EmployeesService employeeService;

    @GetMapping("")
    public String listEmployees(Model model){
        List<EmployeesDto> employeesDtos = employeeService.getAllEmployees();
      //  model.addAttribute("employeesDto", employeesDtos);
        return  "employees-list";
    }

    @GetMapping("/new")
    public String createEmployeeForm(Model model){
        EmployeesDto employeesDto = new EmployeesDto();
        model.addAttribute("employeesDto", employeesDto);
        return  "employees-create";
    }

    @PostMapping("/new")
    public String createEmployee(@ModelAttribute("employeesDto") EmployeesDto employeesDto) {
        employeeService.createEmployee(employeesDto);
        return "redirect:/employees";
    }


    @GetMapping("/{employeeId}/edit")
    public String editEmployeesForm(@PathVariable("employeeId") long employeeId, Model model){
        EmployeesDto employeesDto = employeeService.getEmployeeById(employeeId);
        model.addAttribute("employeeDto", employeesDto);
        return  "employees-edit";
    }

    @PostMapping("/{employeeId}/edit")
    public String updateEmployees(@PathVariable("employeeId") long employeeId, @ModelAttribute("employeesDto") EmployeesDto employeesDto){
    employeesDto.setEmployeeId(employeeId);
    employeeService.updateEmployee(employeesDto);
    return "redirect:/employees";
    }



    @DeleteMapping("/{id}")
    public String deleteEmployee(@PathVariable long id) {
        employeeService.deleteEmployee(id);
        return "redirect:/employees";
    }

}
