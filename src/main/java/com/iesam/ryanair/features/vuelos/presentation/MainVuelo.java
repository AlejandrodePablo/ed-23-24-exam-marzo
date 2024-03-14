package com.iesam.ryanair.features.vuelos.presentation;

import com.iesam.ryanair.features.vuelos.data.VueloDataRepository;
import com.iesam.ryanair.features.vuelos.domain.CreateVueloUseCase;
import com.iesam.ryanair.features.vuelos.domain.GetVueloUseCase;
import com.iesam.ryanair.features.vuelos.domain.Vuelo;

public class MainVuelo {

    public static void createVuelo(Vuelo vuelo) {
        VueloDataRepository vueloDataRepository = new VueloDataRepository();
        CreateVueloUseCase createVueloUseCase = new CreateVueloUseCase(vueloDataRepository);
        createVueloUseCase.execute(vuelo);
    }

    public static void obtainVuelo(String codVuelo) {
        GetVueloUseCase getVueloUseCase = new GetVueloUseCase(new VueloDataRepository());
        Vuelo vuelo = getVueloUseCase.execute(codVuelo);
        System.out.println(vuelo.toString());
    }
}
