package com.example.demo.api;

import com.example.demo.model.Person;
import com.example.demo.service.PersonService;

public class PersonController {


    //linking the middle man aka service layer between the dao and api layer
    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    public void addPerson(Person person) {
        personService.addPerson(person);
    }
}
