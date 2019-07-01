/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gomez.proyecto.lunes;

/**
 *
 * @author 1
 */
public class Lunes {

    /**
     * @param args the command line arguments
     */
    public static VentanaLogin ventanaLogin = null;
    
    
        // TODO code application logic here
    public static void main(String[] args){
        ventanaLogin = new VentanaLogin();
        iniciar();
     
        
    }
    
    public static void iniciar(){
        ventanaLogin.setVisible(true);
        
    
    }
    public static void mostrar(){
      PersonaCorta per1 = new PersonaCorta("Juan","Perez",28);
     PersonaCorta per2 = new PersonaCorta("Marta","Lopez",38);
     PersonaCorta per3 = new PersonaCorta("Pepe","Argento",59);
     System.out.println (per1.getNombre());
     System.out.println(per2.getNombre());  
    }
       
      
       
    }
    

