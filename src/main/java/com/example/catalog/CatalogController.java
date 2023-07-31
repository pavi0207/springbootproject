package com.example.catalog;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CatalogController {
	@GetMapping("/api/catalog")
	@ResponseBody
	 // Method
		public ArrayList<String> getCatalog()
		{
		CatalogData e=new CatalogData();
		return e.getCatalogList();
		}
	
	@PostMapping("/api/catalog1")
	String postCatalog3(@RequestBody List<CatalogData> data)
	{
		return "Data Posted" +data.get(0).getid()+ "" + data.get(0).getname();
		
		
	}
	@PutMapping("/api/catalog/{id}")
	String putCatalog(@PathVariable int id)
	{
		return "Data updated" +id;
	}
	@DeleteMapping("/api/catalog/{id}")
	boolean deleteCatalog(@PathVariable int id)
	{
		return true;
	}
	
}
