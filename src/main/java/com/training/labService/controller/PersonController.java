package com.training.labService.controller;

import com.training.labService.model.Person;
import com.training.labService.service.PersonService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PersonController {

    @Autowired
    private PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/person")
    @ApiOperation(
            value = "Devolver a la persona con mas tiempo de duracion",
            notes = "Devuelve una persona con datos fijos",
            response = Person.class)
    @ApiResponses( value = {
            @ApiResponse (code = 200, message = "Persona devuelta"),
            @ApiResponse (code = 401, message = "No autorizado"),
            @ApiResponse (code = 403, message = "Prohibido"),
            @ApiResponse (code = 404, message = "No se encontró la persona")
    })


    public Person getAPerson() {
        return personService.getAPerson();
    }

}
