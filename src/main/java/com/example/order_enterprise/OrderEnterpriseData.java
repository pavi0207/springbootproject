package com.example.order_enterprise;

import java.util.ArrayList;

public class OrderEnterpriseData {
	//private @Id @GeneratedValue Long id;
	 private int orderid;
	 private String name;
	 public OrderEnterpriseData(){}
	 public int getOrderId()
	 {
		 return this.orderid;
	 }
	 public String getName()
	 {
		 return this.name;
	 }
	 public void setOrderId(int num){
		 
		 this.orderid = num;
	 }
	 public void setName(String n)
	 {
		 
		 this.name = n;
	 }
	 public ArrayList<String>getorderEnterpriseList()
	 {
		 ArrayList<String> data=new ArrayList<String>();
		 data.add("slippers");
		 data.add("food");
		return data;
	 }
}
