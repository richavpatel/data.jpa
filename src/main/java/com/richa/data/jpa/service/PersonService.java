package com.richa.data.jpa.service;

import com.richa.data.jpa.model.Person;
import com.richa.data.jpa.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    @Autowired
    PersonRepository personRepository;

    public Person addPerson(Person person){
        return personRepository.save(person);
    }

    public List<Person> listPerson() {
        return personRepository.findAll();
    }

    public Person onePerson(int id) {
        return personRepository.findById(id).get();
    }

    public Person updatePerson(int id, Person person) {
        return personRepository.save(person);
    }

    public void deletePerson(int id) {
        personRepository.deleteById(id);
    }
}
