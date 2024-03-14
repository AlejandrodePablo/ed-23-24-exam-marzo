package com.iesam.ryanair.features.persona.pasajeros.presentation;

import com.iesam.ryanair.features.persona.pasajeros.data.PasajeroDataRepository;
import com.iesam.ryanair.features.persona.pasajeros.domain.CreatePasajeroUseCase;
import com.iesam.ryanair.features.persona.pasajeros.domain.Pasajero;

import java.util.List;

public class MainPasajero {

    public static void createPasajero(Pasajero pasajero) {
        PasajeroDataRepository pasajeroDataRepository = new PasajeroDataRepository();
        CreatePasajeroUseCase createPasajeroUseCase = new CreatePasajeroUseCase(pasajeroDataRepository);
        createPasajeroUseCase.execute(pasajero);
    }

}
