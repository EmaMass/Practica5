/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wordle;
import java.util.ArrayList;
/**
 *
 * @author EmaMass
 */
public class Comparacion {
    String salida;
    ArrayList<Character> caracteres;
    public Comparacion(){
        this.salida = null;
        this.caracteres = new ArrayList<>();
    }
    
    public void comparar(String palabra, String clave){
        char jug;
        char secret;
        salida = "";
        caracteres.clear();
        for(int i = 0; i < clave.length(); i++ ){
            secret = clave.charAt(i);
            if(!caracteres.contains(secret)){
                caracteres.add(secret);
            }
        }
        for(int i = 0; i < palabra.length(); i++){
            jug = palabra.charAt(i);
            secret = clave.charAt(i);
            if(jug == secret){
                salida += ("("+jug+")");
            }
            else if(caracteres.contains(jug)){
                salida += ("["+jug+"]");
            }
            else{
                salida += ("-"+jug+"-");
            }
        }
    }
    
    @Override
    public String toString(){
        return salida; 
    }
}
