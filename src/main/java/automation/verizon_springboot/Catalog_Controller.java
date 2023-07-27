package automation.verizon_springboot;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

public class Catalog_Controller {
	
	@RequestMapping("/api/catalog")
	@ResponseBody
	 // Method
		public ArrayList<String> getCatalog()
		{
		Employee e=new Employee();
		return e.getCatalogList();
		}

}
