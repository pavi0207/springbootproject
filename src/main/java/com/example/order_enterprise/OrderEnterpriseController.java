package com.example.order_enterprise;

import java.util.ArrayList;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class OrderEnterpriseController {
	@PostMapping("/api/enterprise/customers/{customerid}/orders")
	List<OrderEnterpriseData> postOrder(@PathVariable int customerid,@RequestBody List<OrderEnterpriseData>data)
	{
	data.get(0).setOrderId(customerid);	
	data.get(1).setOrderId(customerid);	
	return data;
	}
	@PutMapping("/api/enterprise/customers/{customerid}/order/{orderid}")
	String putenterprise(@PathVariable int customerid,@PathVariable int orderid)
	{
		return "Data updated"+ customerid + "and" + orderid;
	}
	
	@GetMapping("/api/enterprise/customers/{customerid}/orders")
	
	public ArrayList<String> getenterprise()
	{
	OrderEnterpriseData e=new OrderEnterpriseData();
	return e.getorderEnterpriseList();
	}
@GetMapping("/api/enterprise/orders/{orderid}")
	
	public ArrayList<String> getenterprise1()
	{
	OrderEnterpriseData e1=new OrderEnterpriseData();
	return e1.getorderEnterpriseList();
	}
}
