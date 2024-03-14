package com.iesam.ryanair.features.vuelos.domain;

import com.iesam.ryanair.features.aviones.domain.Avion;
import com.iesam.ryanair.features.aviones.domain.AvionRepository;

public class AddAvionInVueloUseCase {

    private VueloRepository vueloRepository;

    public AddAvionInVueloUseCase(VueloRepository vueloRepository) {
        this.vueloRepository = vueloRepository;
    }
    public boolean execute(String codVuelo,Avion avion){
        Vuelo vuelo = vueloRepository.obtainVuelo(codVuelo);
        vuelo.addAvion(avion);
        return vueloRepository.obtainAvion(codVuelo, avion.codAvion);
    }
}
