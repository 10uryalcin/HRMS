package com.example.hrms2.model.Dto;

import com.example.hrms2.model.*;
import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EmployeesDto {

    long employeeId;
    String firstName;
    String lastName;
  /*  Date birthDate;
    String gender;
    Date hireDate;


    String mail;
    long phone;

    String address;



    Department department;

    double salary;


    Positions position;


    Employees manager;


    List<Department> managedDepartments;


    List<Salaries> salaries;


    List<Attendance> attendances;


    List<LeaveRequest> leaveRequests;



    List<Performance> performances;
*/


}
