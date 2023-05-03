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
public class ITecladoTest {
    
    public ITecladoTest() {
    }

    /**
     * Test of getIntento method, of class ITeclado.
     */
    @Test
    public void testGetIntento() {
        System.out.println("getIntento");
        ITeclado instance = new ITecladoImpl();
        String expResult = "";
        String result = instance.getIntento();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class ITecladoImpl implements ITeclado {

        public String getIntento() {
            return "";
        }
    }
    
}
