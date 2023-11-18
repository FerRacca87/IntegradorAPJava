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
public class Cliente {

    private String cuit;
    private String razonSocial;
    private String mail;
    private List<Servicio> servicios = new ArrayList<>();

}