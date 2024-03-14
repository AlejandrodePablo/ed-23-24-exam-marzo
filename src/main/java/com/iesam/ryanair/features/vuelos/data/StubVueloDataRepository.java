package com.iesam.ryanair.features.vuelos.data;

import com.iesam.ryanair.features.vuelos.domain.Vuelo;
import com.iesam.ryanair.features.vuelos.domain.VueloRepository;

public class StubVueloDataRepository implements VueloRepository {
    @Override
    public void createVuelo(Vuelo vuelo) {

    }

    @Override
    public Vuelo obtainVuelo(String codVuelo) {
        return null;
    }

    @Override
    public boolean obtainAvion(String codVuelo, String avion) {
        return true;
    }
}
