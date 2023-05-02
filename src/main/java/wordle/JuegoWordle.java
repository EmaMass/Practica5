/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wordle;

import wordle.interfaces.ITablero;
import wordle.interfaces.ITeclado;

/**
 *
 * @author molguin
 */
public class JuegoWordle {
    ITablero tablero;
    ITeclado teclado;
    BancoDePalabras banco;
    Comparacion comp;
    String palabraClave;
    String palabraJugador;
    
    public JuegoWordle(ITablero tablero, ITeclado teclado) {
        this.tablero = tablero;
        this.teclado = teclado;
        this.banco = new BancoDePalabras();
        this.comp = new Comparacion();
    }
    
    public void jugar() {
        this.palabraClave = banco.palabraClave();
        //System.out.println("La palabra clave: "+this.palabraClave); // Test, quitar al final
        for(int i = 1;i <= 6; i++){
            System.out.println("Intento "+i+":");
            this.palabraJugador = this.tablero.despliegaIntento(this.teclado.getIntento());
            if(this.palabraJugador.length() != 6){
                do{
                System.out.println("Palabra ingresada no es de 6 caracteres, ingresa una palabra nueva otra vez.");
                this.palabraJugador = this.tablero.despliegaIntento(this.teclado.getIntento());
                }while(this.palabraJugador.length() != 6);
            }
            if(!banco.existe(this.palabraJugador)){
                do{
                System.out.println("Palabra ingresada no existe dentro del banco de palabras, ingresa una palabra nueva otra vez.");
                this.palabraJugador = this.tablero.despliegaIntento(this.teclado.getIntento());
                }while(!banco.existe(this.palabraJugador));
            }
            //Clase de comparacion de los 2 string caracter por caracter
            System.out.println("(n) = caracter en posicion correcta, [n] = caracter en posicion incorrecta, -n- = caracter no existe dentro de la palabra escondida");
            comp.comparar(this.palabraJugador,this.palabraClave);
            System.out.println(comp);
            if(this.palabraClave.equals(this.palabraJugador)){
                System.out.println("Felicidades, adivinastes la palabra correcta, la palabra secreta era: "+this.palabraClave);
                break;
            }
            if(!this.palabraClave.equals(this.palabraJugador) && i == 6){
                System.out.println("Fin del juego, no adivino la palabra secreta, la palabra secreta era: "+this.palabraClave);
            }
        }
        //Canvas, para manejar el mouse. agregar al constructor de Canvas = frame.addMouseListener(new MiMouseAdapter(this));
        /*
        MiMouseAdapter es una nueva clase
        MiMouseAdapter 
        MiMouseAdapter extends MouseAdapter{
         Canvas canvas;
        
         constructor(Canvas canvas){
         super();
         this.canvas = canvas;
         }
        
         @Overrride
         public void mouseClicked(MouseEvent e){
          int x = e.getX();
          int y = e.getY();
          System.out.println('Mouse clicked at x:'+x+' and y:'+y);
          this.canvas.drawString('Hola',x,y);
         }
        }
        */
    }
    
}
