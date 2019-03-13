/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udem.edu.co.vista;

import udem.edu.co.controlador.Controlador;
import udem.edu.co.vista.Principal;

//Creo la clase main, la cual se encargará de invocar los metodos para registrar los vehículos y para visualizarlos
public class main {
    
    //Declaro variables auxiliares de las clases "Principal" y "Controlador" para luego llamar los metodos
    private static Principal auxPrincipal;
    private static Controlador auxControl;
    
    public static void  main(String[] args){
        auxPrincipal = new Principal();
        
        auxPrincipal.llenarVehiculos();
        auxControl.mostrarResultados();
        
    }
}
