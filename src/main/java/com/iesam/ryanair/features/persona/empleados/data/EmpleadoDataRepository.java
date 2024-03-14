package com.iesam.ryanair.features.persona.empleados.data;

import com.iesam.ryanair.features.persona.empleados.data.local.EmpleadoMemLocalDataSource;
import com.iesam.ryanair.features.persona.empleados.domain.Empleado;
import com.iesam.ryanair.features.persona.empleados.domain.EmpleadoRepository;

import java.util.List;

public class EmpleadoDataRepository implements EmpleadoRepository {

    EmpleadoMemLocalDataSource empleadoMemLocalDataSource = new EmpleadoMemLocalDataSource();

    @Override
    public void createEmpleado(Empleado empleado) {
        empleadoMemLocalDataSource.save(empleado);
    }

}
