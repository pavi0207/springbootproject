package com.example.enterprise;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class EnterpriseController {
	@PostMapping("/api/enterprise/customers")
	String postenterprise(@RequestBody String data)
	{
		return "Data Posted"+ data;
	}
	@PutMapping("/api/enterprise/customers/{customerid}")
	String putenterprise(@PathVariable int customerid)
	{
		return "Data updated"+ customerid;
	}
	@GetMapping("/api/enterprise/customers")
	
		public ArrayList<String> getenterprise()
		{
		EnterpriseData e=new EnterpriseData();
		return e.getEnterpriseList();
		}
	@GetMapping("/api/enterprise/customers/{customerid}")
	
	public ArrayList<String> getenterprise1()
	{
	EnterpriseData e1=new EnterpriseData();
	return e1.getEnterpriseList();
	}
	

}
