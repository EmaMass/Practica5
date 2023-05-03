/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wordle.holografico;

import wordle.interfaces.ITablero;
import wordle.Canvas;
import java.awt.Canvas;
/**
 *
 * @author molguin
 */
public class TableroHolografico implements ITablero {
    private Canvas canvas;
    public TableroHolografico(){
        canvas = new Canvas("Juego de Wordle",500,400);
        
    }
    
    @Override
    public String despliegaIntento(String palabra) {
        System.out.println("Despliegue Holografico de "+palabra);
        return palabra;
    }
    
}
