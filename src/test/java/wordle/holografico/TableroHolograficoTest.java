/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package wordle.holografico;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author poppe
 */
public class TableroHolograficoTest {
    
    public TableroHolograficoTest() {
    }

    /**
     * Test of despliegaIntento method, of class TableroHolografico.
     */
    @Test
    public void testDespliegaIntento() {
        System.out.println("despliegaIntento");
        String palabra = "palabra";
        TableroHolografico instance = new TableroHolografico();
        String expResult = "palabra";
        String result = instance.despliegaIntento(palabra);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
