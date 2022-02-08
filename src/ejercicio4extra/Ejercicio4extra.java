/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4extra;

import ejercicio4extraEntidad.NIFEntidad;
import ejercicio4extraServicios.NIFServicios;

/**
 *
 * @author DAMY
 */
public class Ejercicio4extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        NIFServicios s1=new NIFServicios();
        NIFEntidad a1=new NIFEntidad();
        s1.crearNIF(a1);
        s1.mostrar(s1, a1);
  
        
        
    }
    
}
