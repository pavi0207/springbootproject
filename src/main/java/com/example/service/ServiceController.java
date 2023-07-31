package com.example.service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceController {
	@PostMapping("/api/service/provision")
	String postService1(@RequestBody String data)
	{
		return "Data Posted"+ data;
	}
	@PostMapping("/api/service/test-qos")
	String postService2(@RequestBody String data)
	{
		return "Data Posted"+ data;
	}
	@PutMapping("/api/service/disable/{connectionid}")
	String putService1(@PathVariable int connectionid)
	{
		return "Data updated"+ connectionid;
	}
	@PutMapping("/api/service/hold/{connectionid}")
	String putService2(@PathVariable int connectionid)
	{
		return "Data updated"+ connectionid;
	}
	@PutMapping("/api/service/resumes/{connectionid}")
	String putService3(@PathVariable int connectionid)
	{
		return "Data updated"+ connectionid;
	}
	
	
}
