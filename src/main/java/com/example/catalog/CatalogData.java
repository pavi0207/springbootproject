package com.example.catalog;

import java.util.ArrayList;

import javax.persistence.Entity;

@Entity
public class CatalogData {
	 private String name;
	 private int id;
	 public CatalogData(){}
	 public int getid()
	 {
		 return this.id;
	 }
	 public String getname()
	 {
		 return this.name;
	 }
	 public CatalogData(String name){
		 
		 this.name = name;
	 }
	 public CatalogData(int id){
		 
		 this.id = id;
	 }
	 
	 public void test()
	 {
	 
		 System.out.println("Test  Method");
	}

	 public ArrayList<String>getCatalogList()
	 {
		 ArrayList<String> data=new ArrayList<String>();
		 data.add("Clothes");
		 data.add("food");
		return data;
	 }


}
