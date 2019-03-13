/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udem.edu.co.controlador;

import java.util.ArrayList;
import udem.edu.co.modelo.Vehiculo;
import udem.edu.co.modelo.Moto;
import udem.edu.co.modelo.Automovil;
import udem.edu.co.modelo.CamionConUnEje;
import udem.edu.co.modelo.CamionConDosEjes;
import udem.edu.co.vista.Principal;

/**
 *
 * @author s204e10
 */

//defino la clase controlador
public class Controlador {
      static ArrayList vehiculos = new ArrayList();
    Principal auxiliar=new Principal();
    //metodo para guardar todos los vehiculos 
    public static void guardarVehiculo(Vehiculo vehiculo){
        vehiculos.add(vehiculos);
    }
    //metodo para mostrar los resultados
    public static void mostrarResultados(){
        for (Object object : vehiculos) {
            System.out.println(((Vehiculo)object).toString());
            System.out.println("El vehiculo es: "+((Vehiculo)object).toString());
            System.out.println(" ");
        }
    }
    
}
