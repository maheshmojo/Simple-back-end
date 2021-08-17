package com.example.angular.springbootangulardocker.repository;

import com.example.angular.springbootangulardocker.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
/*start*/
@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}
