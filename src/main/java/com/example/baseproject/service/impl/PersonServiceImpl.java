package com.example.baseproject.service.impl;

import com.example.baseproject.service.PersonService;
import com.example.baseproject.model.Person;
import com.example.baseproject.repository.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {

    private final PersonRepository repository;

    public PersonServiceImpl(PersonRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Person> findAll() {
        return repository.findAll();
    }
}
