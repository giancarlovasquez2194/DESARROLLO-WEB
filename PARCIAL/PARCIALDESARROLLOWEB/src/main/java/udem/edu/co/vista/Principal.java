/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//importo las clases que voy a utilizar en esta clase
package udem.edu.co.vista;
import java.util.ArrayList;
import java.util.Scanner;
import udem.edu.co.controlador.Controlador;
import udem.edu.co.modelo.Automovil;
import udem.edu.co.modelo.CamionConDosEjes;
import udem.edu.co.modelo.CamionConUnEje;
import udem.edu.co.modelo.Moto;
import udem.edu.co.modelo.Vehiculo;

/**
 *
 * @author s114e3
 */


//Defino la clase principal, la cual consta de los metodos para llenar los vehiculos
public class Principal {
    

    //defino una variable "entrada" la cual mediante el metodo Scanner se encarga de recibir por consola los registros de los vehiculos
    static Scanner entrada = new Scanner(System.in);
    //instancio un objeto de la clase Controlador
    static Controlador controlador = new Controlador();
    //Declaro una variable auxiliar de la clase Vehiculo
    private Vehiculo vehiculolAux;
    
    
    //genero un menu para llenar los datos de los vehiuculos 
    public void llenarVehiculos(){
        int opcion;
        char respuesta;
        do {
            do {
                System.out.println("********************************************************");
                System.out.println("Digite el numero del vehiculo va a ingresar: ");
                System.out.println("1. moto");
                System.out.println("2. automovil");
                System.out.println("3. Camion con un ejes");
                System.out.println("4. Camion con dos ejes");
                System.out.println("********************************************************");
                
                opcion = entrada.nextInt();
            } while (opcion<1 || opcion>4);
            
            switch(opcion){
                case 1: llenarMoto();
                    break;
                case 2: llenarAutomovil();
                    break;
                case 3: llenarCamionConUnEje();
                    break;
                case 4: llenarCamionDosEjes();
            }
            
            System.out.println("\nDesea introducir otro vehiculo?(s/n): ");
            respuesta = entrada.next().charAt(0);

        } while (respuesta=='s' || respuesta=='S');
    }
    
    public static void llenarMoto(){
        String placa,marca,valorpeaje;
       
        
        System.out.println("Ingrese placa de la moto: ");
        placa= entrada.next();
        System.out.println("Ingrese marca de la moto: ");
        marca = entrada.next();
        valorpeaje = "0";
               
        Moto moto = new Moto(placa, marca, valorpeaje);
        
        controlador.guardarVehiculo(moto);
    }
    
    public static void llenarAutomovil(){
        String placa,marca,valorpeaje;
       
        
        System.out.println("Ingrese placa del automovil: ");
        placa= entrada.next();
        System.out.println("Ingrese marca del automovil: ");
        marca = entrada.next();
        
        valorpeaje = "10000";
               
        Automovil automovil = new Automovil(placa, marca,valorpeaje);
        
        controlador.guardarVehiculo(automovil);
    }
    
    public static void llenarCamionConUnEje(){
            String placa,marca,valorpeaje;
        
        
        System.out.println("Ingrese placa del camion de un solo eje: ");
        placa= entrada.next();
        System.out.println("Ingrese marca del camion de un solo eje:");
        marca = entrada.next();
        
        valorpeaje = "20000";
               
        CamionConUnEje camionconuneje = new CamionConUnEje(placa, marca, valorpeaje);
        
        controlador.guardarVehiculo(camionconuneje);
        
    }
        public static void llenarCamionDosEjes(){
        String placa,marca,valorpeaje;
        
        
        System.out.println("Ingrese placa del camion de un solo eje: ");
        placa= entrada.next();
        System.out.println("Ingrese marca del camion de un solo eje:");
        marca = entrada.next();
        valorpeaje = "30000";
               
        CamionConDosEjes camioncondosejes = new CamionConDosEjes(placa, marca, valorpeaje);
        
        controlador.guardarVehiculo(camioncondosejes);
        }
}
    