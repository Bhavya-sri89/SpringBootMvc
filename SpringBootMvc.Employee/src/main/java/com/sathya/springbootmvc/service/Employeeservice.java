package com.sathya.springbootmvc.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathya.springbootmvc.controller.Employee;
import com.sathya.springbootmvc.entity.Employeeentity;
import com.sathya.springbootmvc.repository.Employeerepository;

@Service
public class Employeeservice<EmployeeEntity> {
@Autowired
Productrepository employeerepository;
public void deleteproductByid(Long id)
{
	employeerepository.deleteById(id);	 
}
public EmployeeEntity searchbyid(Long id)
{
	Optional<EmployeeEntity> optionalData=employeerepository.findById(id);
	if(optionalData.isPresent())
	{
		EmployeeEntity product=optionalData.get();
		return product;
	}
	else
	{
		return null;
	}
}


public List<Employeeentity> getallproduct(){
	List<Employeeentity> products= Employeerepository.findAll();
	return products;
}
public void saveproductcontroller(employeeModle employeemodel)
{
	 	