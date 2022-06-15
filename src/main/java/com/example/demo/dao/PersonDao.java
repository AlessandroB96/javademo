package com.example.demo.dao;

import com.example.demo.model.Person;

import java.util.UUID;

public interface PersonDao {


//  we are adding 2 methods. 1 to insert a person into the database with an id, and another to add a person without an id(create an id for us)
    int insertPerson(UUID id, Person person);

    defualt int addPerson(Person person) {
        UUID id = UUID.randomUUID();
        return insertPerson(id, person);
    }
}
