package br.com.codexperience.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.codexperience.domain.Person;

@RestController
public class PersonController {
	
	@RequestMapping("/")
	public Person person() {
		Person person = new Person();
		person.setFirstName("Ramon");
		person.setLastName("Barros");
		return person;
	}
}
