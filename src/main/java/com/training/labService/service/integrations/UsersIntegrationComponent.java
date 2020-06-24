package com.training.labService.service.integrations;

import com.training.labService.model.Person;
import com.training.labService.projections.MostDurationProjection;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;

@Component
public class UsersIntegrationComponent {
    private RestTemplate rest;
    private static String url = "http://localhost:8080/users/mostDuration";

    @PostConstruct
    private void init() {
        rest = new RestTemplateBuilder()
                .build();
    }


     public String getUserFromApi() {
       return rest.getForObject(url, String.class);

    }



}
