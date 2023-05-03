/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package wordle.interfaces;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author poppe
 */
public class ITableroTest {
    
    public ITableroTest() {
    }

    /**
     * Test of despliegaIntento method, of class ITablero.
     */
    @Test
    public void testDespliegaIntento() {
        System.out.println("despliegaIntento");
        String palabra = "";
        ITablero instance = new ITableroImpl();
        String expResult = "";
        String result = instance.despliegaIntento(palabra);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class ITableroImpl implements ITablero {

        public String despliegaIntento(String palabra) {
            return "";
        }
    }
    
}
