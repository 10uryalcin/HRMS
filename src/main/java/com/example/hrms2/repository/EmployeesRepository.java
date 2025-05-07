package com.example.hrms2.repository;

import com.example.hrms2.model.Employees;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeesRepository extends JpaRepository<Employees, Long> {
}
