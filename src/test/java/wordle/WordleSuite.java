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
@Suite.SuiteClasses({wordle.BancoDePalabrasTest.class, wordle.ComparacionTest.class, wordle.consola.ConsolaSuite.class, wordle.holografico.HolograficoSuite.class})
public class WordleSuite {
    
}
