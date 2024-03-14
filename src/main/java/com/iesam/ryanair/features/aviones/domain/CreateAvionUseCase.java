package com.iesam.ryanair.features.aviones.domain;

import com.iesam.ryanair.features.persona.pasajeros.domain.CreatePasajeroUseCase;

public class CreateAvionUseCase {

    private AvionRepository avionRepository;

    public CreateAvionUseCase(AvionRepository avionRepository) {
        this.avionRepository = avionRepository;
    }

    public void execute(Avion avion) {
        this.avionRepository.createAvion(avion);
    }
}
