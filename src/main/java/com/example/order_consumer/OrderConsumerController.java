package com.example.order_consumer;

import java.util.ArrayList;
import java.util.List;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class OrderConsumerController {
@GetMapping("/api/order/consumer/customers/{customerid}/orders")
	
	public ArrayList<String> getorder()
	{
	OrderConsumerData e1=new OrderConsumerData();
	return e1.getordercustomerList();
	}
@GetMapping("/api/consumer/orders/{orderid}")

	public ArrayList<String> getorder1()
	{
	OrderConsumerData e2=new OrderConsumerData();
	return e2.getordercustomerList();
	}
@GetMapping("/api/consumer/orders/status/{orderid}")

public ArrayList<String> getorder2()
{
OrderConsumerData e3=new OrderConsumerData();
return e3.getordercustomerList();
}

	
	@PostMapping("/api/consumer/customers/{customerid}/orders")
	List<OrderConsumerData> postOrder(@PathVariable int customerid,@RequestBody List<OrderConsumerData>data)
	{
	data.get(0).setOrderId(customerid);	
	data.get(1).setOrderId(customerid);	
	return data;
	}
	
	@PutMapping("/api/consumer/customers/{customerid}/orders/{orderid}")
	String putOrderConsumer(@PathVariable int customerid,@PathVariable int orderid)
	{

	return "Data updated"+customerid +"and" + orderid;

	}
	
	
	

}
