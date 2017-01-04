package org.gradle;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@Autowired
	private PersonRepo repo;
	
	@RequestMapping("/users")
	public List<Person> fetAll(){
		System.out.println("Ankush....");
		Person p=new Person();
		p.setAddress("Add1");
		p.setName("Name1");
		repo.save(p);
		return repo.findAll(); 
	}
	
}
