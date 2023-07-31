package com.example.service;

import javax.persistence.Entity;

@Entity
public class ServiceData {
	//private @Id @GeneratedValue Long id;
	 private int connid;
	 private String service;
	 public ServiceData(){}
	 public int getconnId()
	 {
		 return this.connid;
	 }
	 public String getServiceName()
	 {
		 return this.service;
	 }
	 public void setconnId(int num){
		 
		 this.connid = num;
	 }
	 public void setServiceName(String n)
	 {
		 
		 this.service = n;
	 }


}
