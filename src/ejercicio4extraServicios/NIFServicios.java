/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4extraServicios;

import ejercicio4extraEntidad.NIFEntidad;
import java.util.Scanner;

/**
 *
 * @author DAMY
 */
public class NIFServicios {

    public String crearNIF(NIFEntidad a1) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese DNI:");
        a1.setDNI(leer.nextLong());
        long resto=(a1.getDNI()%23);
        String[] letras={"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
        a1.setNIF(letras[(int) resto]);
         return a1.getNIF();
         
     } 
     
     public void mostrar(NIFServicios b1, NIFEntidad a1) {
         System.out.println(" NIF  ***   "+a1.getDNI()+"-"+a1.getNIF()+ "  ***");
         System.out.println("cambio de Marga");
     }
}

        
        
        

    


