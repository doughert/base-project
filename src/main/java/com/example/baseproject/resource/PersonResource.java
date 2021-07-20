package com.example.baseproject.resource;

import com.example.baseproject.model.Person;
import com.example.baseproject.service.PersonService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("users")
public class PersonResource {

    private final PersonService service;

    public PersonResource(PersonService service) {
        this.service = service;
    }

    @GetMapping
    public List<Person> findAll() {
        return service.findAll();
    }
}
