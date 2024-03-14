package com.iesam.ryanair.features.persona.empleados.domain;

public class CreateEmpleadoUseCase {

    private EmpleadoRepository empleadoRepository;

    public CreateEmpleadoUseCase(EmpleadoRepository empleadoRepository){
        this.empleadoRepository = empleadoRepository;
    }

    public void execute(Empleado empleado){
        this.empleadoRepository.createEmpleado(empleado);
    }
}
