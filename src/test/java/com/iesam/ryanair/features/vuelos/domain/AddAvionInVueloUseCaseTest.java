package com.iesam.ryanair.features.vuelos.domain;


import com.iesam.ryanair.features.vuelos.data.StubVueloDataRepository;
import com.iesam.ryanair.features.vuelos.data.StubVueloDataRepository1;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AddAvionInVueloUseCaseTest {

    private AddAvionInVueloUseCase addAvionInVueloUseCase;

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
        addAvionInVueloUseCase = null;
    }

    @Test
    public void siUnAvionEstaAsignadoEntoncesFunciona(){
        //Given
        AddAvionInVueloUseCase addAvionInVueloUseCase1 = new AddAvionInVueloUseCase(
                new StubVueloDataRepository()
        );
        //When
        AddAvionInVueloUseCase result = addAvionInVueloUseCase1;
        //Then
        Assertions.assertNotNull(result);
    }

    public void siUnAvionNoEstaAsignadoEntoncesFunciona(){
        //Given
        AddAvionInVueloUseCase addAvionInVueloUseCase1 = new AddAvionInVueloUseCase(
                new StubVueloDataRepository1()
        );
        //When
        AddAvionInVueloUseCase result = addAvionInVueloUseCase1;
        //Then
        Assertions.assertNull(result);
    }
}