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
public class BancoDePalabrasTest {
    
    public BancoDePalabrasTest() {
    }

    /**
     * Test of size method, of class BancoDePalabras.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        BancoDePalabras instance = new BancoDePalabras();
        int expResult = 271;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of palabraClave method, of class BancoDePalabras.
     */
    @Test
    public void testPalabraClave() {
        System.out.println("palabraClave");
        BancoDePalabras instance = new BancoDePalabras();
        String result = instance.palabraClave();
        assertEquals(6, result.length());
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of existe method, of class BancoDePalabras.
     */
    @Test
    public void testExiste() {
        System.out.println("existe");
        String palabra = "solimos";
        BancoDePalabras instance = new BancoDePalabras();
        boolean expResult = false;
        boolean result = instance.existe(palabra);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
