package com.iesam.ryanair.features.aviones.presentation;

import com.iesam.ryanair.features.aviones.data.local.AvionDataRepository;
import com.iesam.ryanair.features.aviones.domain.Avion;
import com.iesam.ryanair.features.aviones.domain.CreateAvionUseCase;
import com.iesam.ryanair.features.aviones.domain.GetAvionUseCase;

public class MainAvion {

    public static void createAvion(Avion avion) {
        AvionDataRepository avionDataRepository = new AvionDataRepository();
        CreateAvionUseCase createAvionUseCase = new CreateAvionUseCase(avionDataRepository);
        createAvionUseCase.execute(avion);
    }

    public static void obtainAvion(String codAvion) {
        GetAvionUseCase getAvionUseCase = new GetAvionUseCase(new AvionDataRepository());
        Avion avion = getAvionUseCase.execute(codAvion);
        System.out.println(avion.toString());
    }
}
