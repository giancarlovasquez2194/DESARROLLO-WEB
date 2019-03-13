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

// Creo lña clase automovil, la cual extiende de la clase abtracta Vehiculo
public class Automovil extends Vehiculo{
//genero constructor vacío
    public Automovil() {
    }
//genero constructor  que tiene como parametros los atributos de la clase abstracta
    public Automovil(String placa, String marca, String valorpeaje) {
        super(placa, marca, valorpeaje);
        
    }
    /*
       Retorna formato JSON
    */
    @Override
        public String toString() {
        return "'Automovil':{" + "'placa':{" + placa + "}, 'marca':{" + marca + "} 'valorpeaje':{" + valorpeaje + "}}"+'}';
    }
    
}
