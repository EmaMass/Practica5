/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wordle.holografico;

import wordle.interfaces.ITablero;

/**
 *
 * @author molguin
 */
public class TableroHolografico implements ITablero {

    @Override
    public String despliegaIntento(String palabra) {
        System.out.println("Despliegue Holografico de "+palabra);
        return palabra;
    }
    
}
