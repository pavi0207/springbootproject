package com.example.order_consumer;

import java.util.ArrayList;

import javax.persistence.Entity;

@Entity
public class OrderConsumerData {
	//private @Id @GeneratedValue Long id;
		 private int orderid;
		 private String name;
		 
		 public int getOrderId()
		 {
			 return this.orderid;
		 }
		 public String getname()
		 {
			 return this.name;
		 }
		 public void setOrderId(int num){
			 
			 this.orderid = num;
		 }
		 public void setName(String n)
		 {
			 
			 this.name= n;
		 }
		 public ArrayList<String>getordercustomerList()
		 {
			 ArrayList<String> data=new ArrayList<String>();
			 data.add("shoes");
			 data.add("food");
			return data;
		 }

}
