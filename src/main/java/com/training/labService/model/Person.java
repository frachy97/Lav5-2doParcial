package com.training.labService.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

@ApiModel (description = "Modelo de persona ")
@Data
@AllArgsConstructor
public class Person {

    @ApiModelProperty(notes = "Nombre de la persona")
    private String name;
    @ApiModelProperty(notes = "Apellido de la persona")
    private String lastname;
    @ApiModelProperty(notes = "Duracion de la llamada")
    private String duration;

}
