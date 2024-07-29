package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AvionComercialTest {
    AvionComercial avionComercial = new AvionComercial(2000,300);
    @Test
    public void gatCapacidadCombustible(){
        int capacidad = avionComercial.getCapacidadCombustible();

        assertEquals(2000 ,capacidad);
    }

    @Test
    public void getConsumoCombustible(){
        int combustible = avionComercial.getConsumoCombustible();

        assertEquals(300, combustible);
    }

    @Test
    public void testVolar() {
        Avion avionComercial = new AvionComercial(500, 10);
        int distancia = 100;
        int combustibleEsperado = 1000; // porque 100 * 10 = 1000

        // Ejecución
        int combustibleCalculado = avionComercial.volar(distancia);

        // Verificación
        assertEquals(combustibleEsperado, combustibleCalculado);
    }

}
