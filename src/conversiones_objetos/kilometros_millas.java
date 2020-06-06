/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversiones_objetos;

/**
 *
 * @author Gaby
 */
public class kilometros_millas {
    
        double kilometros = 100;
        double millas = 50;
        double resultadoEnKilometros = 0;
        double resultadoEnMillas = 0;
        
        public void resultadoEnKilometros(){
        resultadoEnKilometros = millas * 1.6;
        
        
        System.out.println("El resultado en kilometros es: "
                +resultadoEnKilometros);

        }
        
        public void resultadoEnMillas(){
        resultadoEnMillas = kilometros / 1.6;
        System.out.println("El resultado en millas es: "
                +resultadoEnMillas);
        
     }
        }
       
