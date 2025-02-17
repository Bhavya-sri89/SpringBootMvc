package com.sathya.springbootmvc.controller;

import java.util.List;

import org.apache.tomcat.util.log.UserDataHelper.Mode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sathya.springbootmvc.entity.Employeeentity;
import com.sathya.springbootmvc.model.Employeemodel;

import jakarta.websocket.server.PathParam;

@Controller
public class Employee<Employeeservice> {

@Autowired
Employeeservice Employeeservice;
@GetMapping("/Employee")
public String getEmployee() {
	return "employee";
}
@PostMapping("/saveEmployee")
public String saveEmployee(Employeemodel employeemodel) {
	Employeeservice.saveEmployeeDetails(Employeemodel);
	return "success";
}


@GetMapping("/getAllEmployee")
private String getAllEmployee(Mode model)
{
	List<Employeeentity>employees=Employeeservice.getAllEmployees();
	model.addAttribute("employees",employees);
	return "employee-list";
}
@GetMapping("/getsearchform")
public String getSearchform()
{
	return "search-employee";
}
@PostMapping("/searchbyid")
public String searchById(@RequestParam Long id,Model model)
{
	Employeeentity employee=Employeeservice.searchById(int);
	model.addAttribute("employee", employee);
	return "search-employee";
}
@GetMapping("/delete/{id}")
public String deleteById(@PathVariable("id") Long id) {
	Employeeservice.deleteemployeeById( id);
	return "redirect:/getAllEmployees";
}
}




