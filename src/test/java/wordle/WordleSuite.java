/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4Suite.java to edit this template
 */
package wordle;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author poppe
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({wordle.JuegoWordleTest.class, wordle.consola.ConsolaSuite.class, wordle.BancoDePalabrasTest.class, wordle.WordleTest.class, wordle.ComparacionTest.class, wordle.holografico.HolograficoSuite.class, wordle.interfaces.InterfacesSuite.class})
public class WordleSuite {
    
}
