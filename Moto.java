/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudio_parcial_desarrollo_web;

/**
 *
 * @author FELIPE
 */
public class Moto extends Vehiculo {

    final float PRECIO = 1000;

    public Moto(String placa, String marca) {
        super(placa, marca);
    }

    public String Tipo() {

        return "soy Moto";

    }
    
    
    @Override
    public float getValorPeaje() {
        return PRECIO;
    }
    
    
    

}
