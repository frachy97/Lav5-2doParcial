package com.training.labService.controller;

import com.training.labService.model.Person;
import com.training.labService.projections.MostDurationProjection;
import com.training.labService.service.UserIntegrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/integrations")
public class UserIntegrationController {

    @Autowired
    UserIntegrationService userIntegrationService;

    @GetMapping("/person")
    public ResponseEntity<Person> getUser() {
        return userIntegrationService.getUser();
    }
}
