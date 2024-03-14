package com.iesam.ryanair.features.aviones.domain;

public interface AvionRepository {

    void createAvion(Avion avion);

    Avion obtainAvion(String codAvion);
}
