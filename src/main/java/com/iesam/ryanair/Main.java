package com.iesam.ryanair;

import com.iesam.ryanair.features.aviones.domain.Avion;
import com.iesam.ryanair.features.aviones.presentation.MainAvion;
import com.iesam.ryanair.features.persona.empleados.domain.Empleado;
import com.iesam.ryanair.features.persona.empleados.presentation.MainEmpleado;
import com.iesam.ryanair.features.persona.pasajeros.domain.Pasajero;
import com.iesam.ryanair.features.persona.pasajeros.presentation.MainPasajero;
import com.iesam.ryanair.features.vuelos.domain.Vuelo;
import com.iesam.ryanair.features.vuelos.presentation.MainVuelo;


public class Main {
    public static void main(String[] args) {
        createEmpleado();
        createPasajero();
        createAvion();
        createVuelo();
        obtainVuelo();
    }

    public static void createEmpleado() {
        Empleado empleado1 = new Empleado(
                "700001",
                "Empleado1",
                "EmpleadoApellido1",
                "Piloto"
        );
        Empleado empleado2 = new Empleado(
                "700002",
                "Empleado2",
                "EmpleadoApellido2",
                "Piloto"
        );
        Empleado empleado3 = new Empleado(
                "700003",
                "Empleado3",
                "EmpleadoApellido3",
                "Azafata"
        );

        MainEmpleado.createEmpleado(empleado1);
        MainEmpleado.createEmpleado(empleado2);
        MainEmpleado.createEmpleado(empleado3);
    }

    public static void createPasajero() {
        Pasajero pasajero1 = new Pasajero(
                "8000001",
                "Pasajero1",
                "PasajeroApellido1",
                "Avila",
                "Avila"
        );
        Pasajero pasajero2 = new Pasajero(
                "8000002",
                "Pasajero2",
                "PasajeroApellido2",
                "Avila",
                "Avila"
        );
        MainPasajero.createPasajero(pasajero1);
        MainPasajero.createPasajero(pasajero2);
    }


    public static void createAvion() {
        Avion avion1 = new Avion(
                "100001",
                "Pajarito",
                "Boing701",
                "200"
        );
        Avion avion2 = new Avion(
                "100002",
                "Nube",
                "Boing705",
                "250"
        );
        Avion avion3 = new Avion(
                "100001",
                "Rayo",
                "Boing710",
                "100"
        );
        MainAvion.createAvion(avion3);
        MainAvion.createAvion(avion2);
        MainAvion.createAvion(avion3);
    }

    public static void createVuelo() {
        Vuelo vuelo1 = new Vuelo(
                "1",
                "100001",
                "700001, 700002",
                "800001, 800002",
                "10/02/2024",
                "10:30h",
                "90e",
                "Madrid",
                "Barcelona"
        );
        MainVuelo.createVuelo(vuelo1);
    }

    public static void obtainVuelo() {
        MainVuelo.obtainVuelo("1");
    }
}