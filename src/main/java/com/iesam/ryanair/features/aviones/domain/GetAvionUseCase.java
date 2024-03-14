package com.iesam.ryanair.features.aviones.domain;

public class GetAvionUseCase {

    private AvionRepository avionRepository;

    public GetAvionUseCase(AvionRepository avionRepository) {
        this.avionRepository = avionRepository;
    }

    public Avion execute(String codAvion) {
        return this.avionRepository.obtainAvion(codAvion);
    }
}
