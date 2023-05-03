/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package wordle;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author poppe
 */
public class ComparacionTest {
    
    public ComparacionTest() {
    }


    /**
     * Test of toString method, of class Comparacion.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Comparacion instance = new Comparacion();
        String expResult = "[a][l][a][p]";
        String palabraClave = "alap";
        String comparacion = "pala";
        instance.comparar(palabraClave,comparacion);
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
