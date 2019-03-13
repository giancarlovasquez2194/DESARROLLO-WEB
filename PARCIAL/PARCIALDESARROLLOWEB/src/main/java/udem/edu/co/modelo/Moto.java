/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udem.edu.co.modelo;

/**
 *
 * @author s204e10
 */
//Definimos la clase Moto, la cual extiende de la clase abstracta Vehiculos con todos sus atributos
public class Moto extends Vehiculo{

    public Moto() {
    }
// Creamos constructor
    public Moto(String placa, String marca, String valorpeaje) {
        super(placa, marca, valorpeaje);
        
        
    }
    
}
