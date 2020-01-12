
package com.spring.boot.ai1tutorial.controller;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.ai1tutorial.model.Employee;


@RestController
@RequestMapping("ai1tutorial")
public class EmployeeController {

	@GetMapping("/test")
	public String sampleGet() {
		return "test SWagger";
	}
	
	
	 @PostMapping("/employee")
	  public Employee createSample(@Valid @RequestBody Employee e) {
	    return e;
	  }
	
		

}
