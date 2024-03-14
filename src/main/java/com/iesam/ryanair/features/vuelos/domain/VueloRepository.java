package com.iesam.ryanair.features.vuelos.domain;

public interface VueloRepository {

    void createVuelo(Vuelo vuelo);
    Vuelo obtainVuelo(String codVuelo);
    boolean obtainAvion(String codVuelo, String avion);
}
