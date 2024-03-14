package com.iesam.ryanair.features.aviones.data.local;

import com.iesam.ryanair.features.aviones.domain.Avion;
import com.iesam.ryanair.features.aviones.domain.AvionRepository;

public class AvionDataRepository implements AvionRepository {

    AvionFileLocalDataSource avionFileLocalDataSource = new AvionFileLocalDataSource();

    @Override
    public void createAvion(Avion avion) {
        avionFileLocalDataSource.save(avion);
    }

    @Override
    public Avion obtainAvion(String codAvion) {
        return avionFileLocalDataSource.findById(codAvion);
    }
}
