package org.example.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Problema {

    private String descripcionDelProblema;
    private String tipoDeProblema;
    private double tiempoDeResolucion;

}
