/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wordle.consola;

import wordle.interfaces.ITablero;

/**
 *
 * @author molguin
 */
public class TableroConsola implements ITablero {

    @Override
    public String despliegaIntento(String palabra) {
        System.out.println(palabra);
        return palabra;
    }
    
}
