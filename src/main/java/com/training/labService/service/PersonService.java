package com.training.labService.service;

import com.training.labService.model.Person;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    public Person getAPerson() {
        return new Person("Franco", "Ferreyra","23");
    }
}
