package com.iesam.ryanair.features.persona.empleados.data.local;


import com.iesam.ryanair.features.demo.domain.Demo;
import com.iesam.ryanair.features.persona.empleados.domain.Empleado;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class EmpleadoMemLocalDataSource {

    public static EmpleadoMemLocalDataSource instance = null;

    public EmpleadoMemLocalDataSource() {

    }

    private Map<String, Empleado> dataStore = new TreeMap<>();

    public void save(Empleado model) {
        dataStore.put(model.dni, model);
    }

    public List<Empleado> findAll() {
        return dataStore.values().stream().toList();
    }

    public Empleado findById(String dni) {
        return dataStore.get(dni);
    }


    public static EmpleadoMemLocalDataSource newInstance() {
        if (instance == null) {
            instance = new EmpleadoMemLocalDataSource();
        }
        return instance;
    }
}

