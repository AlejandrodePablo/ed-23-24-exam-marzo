package com.iesam.ryanair.features.persona.pasajeros.data;

import com.iesam.ryanair.features.persona.pasajeros.data.local.PasajeroFileLocalDataSource;
import com.iesam.ryanair.features.persona.pasajeros.domain.Pasajero;
import com.iesam.ryanair.features.persona.pasajeros.domain.PasajeroRepository;

import java.util.List;

public class PasajeroDataRepository implements PasajeroRepository {

    PasajeroFileLocalDataSource fileLocalDataSource = new PasajeroFileLocalDataSource();

    @Override
    public void createPasajero(Pasajero pasajero) {
        fileLocalDataSource.save(pasajero);
    }

}
