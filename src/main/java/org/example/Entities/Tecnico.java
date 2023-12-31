package org.example.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Tecnico {

    private int id;
    private String nombre;
    private List<String> especialidades = new ArrayList<>();
    private List<String> resolucionDeProblemas = new ArrayList<>();
    private String medioDeNotificacion;

}
