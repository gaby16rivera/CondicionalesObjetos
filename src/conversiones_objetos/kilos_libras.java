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
public class kilos_libras {
    
        double kilos = 15;
        double libras = 130;
        double resultadoEnKilos = 0;
        double resultadoEnLibras = 0;
        
        
        public void resultadoEnKilos(){
        resultadoEnKilos = libras / 2.2;
                
        System.out.println("El resultado en kilos es: "
                +resultadoEnKilos);
   
}
        public void resultadoEnLibras(){
        resultadoEnLibras = kilos * 2.2;

        System.out.println("El resultado en libras es: "
                +resultadoEnLibras);
        }
}