package com.iesam.ryanair.features.persona.empleados.domain;

import com.iesam.ryanair.features.persona.domain.Persona;

public class Empleado extends Persona {

    public final String cargo;

    public Empleado(String dni, String nombre, String apellidos, String cargo) {
        super(dni, nombre, apellidos);
        this.cargo = cargo;
    }
}
