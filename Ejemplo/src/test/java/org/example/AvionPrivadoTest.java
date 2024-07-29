package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class AvionPrivadoTest {

    AvionPrivado avionPrivado = new AvionPrivado(1000,200);

    @Test
    public void testVolar(){
        int capacidadCombustible = 100;
        int consumoCombustible = 10;
        AvionPrivado avionPrivado = new AvionPrivado(capacidadCombustible,consumoCombustible);
        int distancia = 50;
        int expectedCombustibleNecesario = (distancia * consumoCombustible) + (capacidadCombustible / 2);

        int actualCombustibleNecesario = avionPrivado.volar(distancia);

        assertEquals(expectedCombustibleNecesario, actualCombustibleNecesario);
    }

    @Test
    public void TestGetCapacidadCombustible(){
        int capacidad = avionPrivado.getCapacidadCombustible();

        assertEquals(1000 ,capacidad);
    }

    @Test
    public void TestGetConsumoCombustible(){
        int combustible = avionPrivado.getConsumoCombustible();

        assertEquals(200, combustible);
    }
}
