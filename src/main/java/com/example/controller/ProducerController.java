package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RestController
public class ProducerController {

	@GetMapping("/health")
	public String tsthealth() {
		return "Producer Working!!!";
	}
	
	
	@GetMapping("/hello")
	public Mono<Person> hello(){
		
		return Mono.just(new Person("Nirmal Kumar", "M", 38));
		
	}
	
	@PostMapping("/hellopost")
	 public Mono<Person> hello(@RequestBody Person per){
		
		return Mono.just(new Person(per.getName(), per.getGender(), per.getAge()));		
	}
	
	@PostMapping("/perspost")
	 public Person pers(@RequestBody Person per){
		
		return new Person(per.getName(), per.getGender(), per.getAge());		
	}
		
}
