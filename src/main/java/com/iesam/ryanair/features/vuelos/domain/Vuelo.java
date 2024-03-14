package com.iesam.ryanair.features.vuelos.domain;

import com.iesam.ryanair.features.aviones.domain.Avion;
import com.iesam.ryanair.features.persona.empleados.domain.Empleado;
import com.iesam.ryanair.features.persona.pasajeros.domain.Pasajero;

import java.util.ArrayList;

public class Vuelo {
    public final String codVuelo;
    public final String avion;
    public final String tripulantes;
    public final String pasajeros;
    public final String fecha;
    public final String horaVuelo;
    public final String precio;
    public final String origen;
    public final String destino;

    public Vuelo(String codVuelo, String avion, String tripulantes, String pasajeros, String fecha, String horaVuelo, String precio, String origen, String destino) {
        this.codVuelo = codVuelo;
        this.avion = avion;
        this.tripulantes = tripulantes;
        this.pasajeros = pasajeros;
        this.fecha = fecha;
        this.horaVuelo = horaVuelo;
        this.precio = precio;
        this.origen = origen;
        this.destino = destino;
    }

    public void addAvion(Avion avion) {
    }
}
