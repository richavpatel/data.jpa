package com.richa.data.jpa.controller;

import com.richa.data.jpa.model.Person;
import com.richa.data.jpa.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/persons")
public class PersonController {
    @Autowired
    PersonService personService;

    @PostMapping
    public Person addPerson(@RequestBody Person person){
        return personService.addPerson(person);
    }
    @GetMapping
    public List<Person> listPerson(){
       return personService.listPerson();
    }
    @GetMapping(value = "/{id}")
    public Person onePerson(@PathVariable int id){
        return personService.onePerson(id);
    }
    @PutMapping(value = "/{id}")
    public Person updatePerson(@PathVariable int id, @RequestBody Person person){
        return personService.updatePerson(id,person);
    }
    @DeleteMapping(value = "/{id}")
    public void deletePerson(@PathVariable int id){
         personService.deletePerson(id);
    }




}
