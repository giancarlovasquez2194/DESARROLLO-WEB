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
public abstract class Vehiculo {

    String placa;
    //Declaracion de atributos 
    protected String marca, valorpeaje;
//Genero constructor vacío
    public Vehiculo() {
    }
// generamos  constructor con sus respectivos atributos
    public Vehiculo(String placa, String marca, String valorpeaje) {
        this.placa = placa;
        this.marca = marca;
        this.valorpeaje = valorpeaje;
    }

    
    //Generamos los modificadores de acceso Getters and Setters
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getValorpeaje() {
        return valorpeaje;
    }

    public void setValorpeaje(String valorpeaje) {
        this.valorpeaje = valorpeaje;
    }
    
    
}
