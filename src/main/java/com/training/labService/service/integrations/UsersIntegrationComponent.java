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


    //NO FUNCIONA, hubiera sido preferirble modificar la projection a un dto o tirar el usuario completo
    // por falta de tiempo no se logro
    public MostDurationProjection getUserFromApi() {
       return rest.getForObject(url, MostDurationProjection.class);

    }


}
