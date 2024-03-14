package com.iesam.ryanair.features.persona.pasajeros.domain;

import com.iesam.ryanair.features.persona.domain.Persona;

public class Pasajero extends Persona {

    public final String localidad;
    public final String provincia;

    public Pasajero(String dni, String nombre, String apellidos, String localidad, String provincia) {
        super(dni, nombre, apellidos);
        this.localidad = localidad;
        this.provincia = provincia;
    }
}
