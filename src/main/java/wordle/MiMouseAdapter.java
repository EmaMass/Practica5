/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wordle;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author poppe
 */
public class MiMouseAdapter extends MouseAdapter {
    Canvas canvas;
    
    public MiMouseAdapter(Canvas canvas){
        super();
        this.canvas = canvas;
    }
    
    @Override
    public void mouseClicked(MouseEvent e){
        int x = e.getX();
        int y = e.getY();
    }
}
