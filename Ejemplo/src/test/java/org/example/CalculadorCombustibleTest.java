package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class CalculadorCombustibleTest {
    @Test
    public void testCalcularCombustible() {
        //Crear un mock de Database
        CalculadorCombustible calculador = CalculadorCombustible.getInstance();
        Avion avion = mock(Avion.class);

        //configurar el mock para retornar true cuando se llama al isConnected()
        when(avion.volar(10)).thenReturn(75);

        //Crear una instancia de Aplicaction usando el mock
        int resultado = calculador.calcularCombustible(avion, 10);

        //Verificar que checkDatabaseConnection retorna true
        Assertions.assertEquals(calculador.calcularCombustible(avion,10), resultado);
    }


}
