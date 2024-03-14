package com.iesam.ryanair.features.persona.pasajeros.domain;

public class CreatePasajeroUseCase {

    private PasajeroRepository pasajeroRepository;

    public CreatePasajeroUseCase(PasajeroRepository pasajeroRepository) {
        this.pasajeroRepository = pasajeroRepository;
    }

    public void execute(Pasajero pasajero) {
        this.pasajeroRepository.createPasajero(pasajero);
    }
}
