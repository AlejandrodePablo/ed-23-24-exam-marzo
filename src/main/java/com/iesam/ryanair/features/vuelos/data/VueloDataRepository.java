package com.iesam.ryanair.features.vuelos.data;

import com.iesam.ryanair.features.vuelos.data.local.VueloFileLocalDataSource;
import com.iesam.ryanair.features.vuelos.domain.Vuelo;
import com.iesam.ryanair.features.vuelos.domain.VueloRepository;

public class VueloDataRepository implements VueloRepository {

    VueloFileLocalDataSource vueloFileLocalDataSource = new VueloFileLocalDataSource();

    @Override
    public void createVuelo(Vuelo vuelo) {
        vueloFileLocalDataSource.save(vuelo);
    }

    @Override
    public Vuelo obtainVuelo(String codVuelo) {
        return vueloFileLocalDataSource.findById(codVuelo);
    }

    @Override
    public boolean obtainAvion(String codVuelo, String codAvion) {
        return false;
    }

}
