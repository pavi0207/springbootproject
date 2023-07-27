package automation.verizon_springboot;
import java.util.ArrayList;

import javax.persistence.Entity;

@Entity
public class Employee {

		//private @Id @GeneratedValue Long id;
		 private String name;
		 Employee(){}


		 Employee(String name){
			 
			 this.name =name;
		 }
		 
		 public void test()
		 {
		 
			 System.out.println("Test  Method");
		}

		 ArrayList<String>getCatalogList()
		 {
			 ArrayList<String> data=new ArrayList<String>();
			 data.add("Clothes");
			 data.add("food");
			return data;
		 }
	

}
