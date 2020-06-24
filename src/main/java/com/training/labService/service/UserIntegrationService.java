package com.training.labService.service;

import com.training.labService.model.Person;
import com.training.labService.projections.MostDurationProjection;
import com.training.labService.service.integrations.UsersIntegrationComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UserIntegrationService {

    @Autowired
    private UsersIntegrationComponent usersIntegrationComponent;

    public ResponseEntity<String> getUser() {
       return ResponseEntity.ok(usersIntegrationComponent.getUserFromApi());
    }
}
