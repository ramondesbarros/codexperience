package br.com.codexperience.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class PersonAspect {
	//br.com.codexperience.web.PersonController
	@Before("execution(* br.com.codexperience.web.PersonController.person(..))")
	public void beforePerson() {
		System.out.println("Aspect activated!");
	}
}
