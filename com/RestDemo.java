package com;
import java.util.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class RestDemo {
    PersonService1 PersonService=new PersonService1();
//Get call using spring based web service
@GetMapping("/myurl")
public String sayHello()
{
	
	return "hi how are you";
}
//Retrive person info using @get method
@GetMapping("/personinfo")
public Person getDummyPerson()
{

	Person p=new Person();// person class object created
p.setName("Ram");
p.setEmail("Ram@gmail.com");
p.setAddress("Delhi");
return p;
}
//Retrieve the person information by id
@GetMapping("/personinforid/{​​​id}​​​")
public Person getDummyPersonById(@PathVariable("id") Integer id)
{

	Person p=new Person();
p.setId(101);
p.setName("Ram");
p.setEmail("Ram@gmail.com");
p.setAddress("Delhi");
return p;
}

// add the person information POst

 @PostMapping(value = "/insertpersondetails")
public Person insertDummyPerson(@RequestBody Person pers) {

	return PersonService.addPerson(pers); //calling the service
}
//update person info
@PutMapping("/update")
public Person updatepersonInfo(@RequestBody Person person) {

	return PersonService.updatePerson(person);
 }


//get list

@GetMapping("/getlist")
public List<Person> getDummyPersonList() {

	List<Person> listOfPerson = PersonService.getAllPersonlist();
	return listOfPerson;
	}
}

	
