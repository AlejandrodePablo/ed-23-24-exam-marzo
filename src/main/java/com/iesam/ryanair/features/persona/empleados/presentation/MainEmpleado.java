package com.iesam.ryanair.features.persona.empleados.presentation;

import com.iesam.ryanair.features.persona.empleados.data.EmpleadoDataRepository;
import com.iesam.ryanair.features.persona.empleados.domain.CreateEmpleadoUseCase;
import com.iesam.ryanair.features.persona.empleados.domain.Empleado;

import java.util.List;

public class MainEmpleado {

    public static void createEmpleado(Empleado empleado) {
        EmpleadoDataRepository empleadoDataRepository = new EmpleadoDataRepository();
        CreateEmpleadoUseCase createEmpleadoUseCase = new CreateEmpleadoUseCase(empleadoDataRepository);
        createEmpleadoUseCase.execute(empleado);
    }

}
