package com.example.hrms2.model;


import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;
import java.util.List;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name="employees")
public class Employees {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long employeeId;
    String firstName;
    String lastName;


/*
    Date birthDate;
    String gender;
    Date hireDate;


    @Column(unique = true, nullable = true)
    String mail;
    long phone;
    String address;
    double salary;



    @ManyToOne
    @JoinColumn(name="departmentId", nullable = true)
    Department department;



    @ManyToOne
    @JoinColumn(name="positionId", nullable = true)
    Positions position;

    @ManyToOne
    @JoinColumn(name="managerId", nullable = true)
    Employees manager;

    @OneToMany(mappedBy = "manager")
    List<Department> managedDepartments;

    @OneToMany(mappedBy = "employee")
    List<Salaries> salaries;

    @OneToMany(mappedBy = "employee")
    List<Attendance> attendances;

    @OneToMany(mappedBy = "employee")
    List<LeaveRequest> leaveRequests;

    @OneToMany(mappedBy = "employee")
    List<Performance> performances;

    */

}




