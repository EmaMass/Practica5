/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package wordle.consola;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author poppe
 */
public class TableroConsolaTest {
    
    public TableroConsolaTest() {
    }

    /**
     * Test of despliegaIntento method, of class TableroConsola.
     */
    @Test
    public void testDespliegaIntento() {
        System.out.println("despliegaIntento");
        String palabra = "";
        TableroConsola instance = new TableroConsola();
        String expResult = "";
        String result = instance.despliegaIntento(palabra);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
