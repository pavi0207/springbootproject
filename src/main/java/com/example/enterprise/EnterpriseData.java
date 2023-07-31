package com.example.enterprise;

import java.util.ArrayList;

import javax.persistence.Entity;

@Entity
public class EnterpriseData {
	//private @Id @GeneratedValue Long id;
		 private int orderid;
		 private String name;
		 public EnterpriseData(){}
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
		 public ArrayList<String>getEnterpriseList()
		 {
			 ArrayList<String> data=new ArrayList<String>();
			 data.add("bag");
			 data.add("food");
			return data;
		 }
}
