package com.iesam.ryanair.features.vuelos.domain;

public class CreateVueloUseCase {

    private VueloRepository vueloRepository;

    public CreateVueloUseCase(VueloRepository vueloRepository) {
        this.vueloRepository = vueloRepository;
    }

    public void execute(Vuelo vuelo) {
        this.vueloRepository.createVuelo(vuelo);
    }
}
