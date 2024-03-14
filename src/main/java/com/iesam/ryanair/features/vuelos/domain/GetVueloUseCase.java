package com.iesam.ryanair.features.vuelos.domain;

public class GetVueloUseCase {

    private VueloRepository vueloRepository;

    public GetVueloUseCase(VueloRepository vueloRepository) {
        this.vueloRepository = vueloRepository;
    }

    public Vuelo execute(String codVuelo) {
        return this.vueloRepository.obtainVuelo(codVuelo);
    }
}
