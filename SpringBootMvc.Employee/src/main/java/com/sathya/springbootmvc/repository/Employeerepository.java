package com.sathya.springbootmvc.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sathya.springbootmvc.entity.Employeeentity;
public class Employeerepository {
@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeRepository, Long> {
}


}







Employeerepository employeerepository;



public void deleteemployeeByid(int id)
{
	   employeerepository.deleteById(int);
}
 public Employeeentity searchbyid( int id)
 {
	  Optional<EmployeeEntity> optionalData=employeerepository.findById(id);
	  if(optionalData.isPresent())
	  {
		  EmployeeEntity employeeentity=optionalData.get();
		  return employee;
	  }
	  else
	  {
		  return null;
	  }
 }
 public List<EmployeeEntity> getAllEmployees() {
	  List<EmployeeEntity> employees= employeerepository.findAll();
	  return employees;
 }

 }
public static List<Employeeentity> findAll() {
	// TODO Auto-generated method stub
	return null;
}
}
