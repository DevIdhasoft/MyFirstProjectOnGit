package com.db.SpringJPAApplication;
//dvksvddvjsdhvdsjhAnurag
import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	
	ArrayList<Employee> findEmployeeBySalaryBetween(int min,int max);
	
	
}
