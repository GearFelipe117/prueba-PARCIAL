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
public class Carro  extends Vehiculo {
    
    final float PRECIO = 2000;

    public Carro(String placa, String marca) {
        super(placa, marca);
    }

    public String Tipo() {

        return "soy Carro";

    }
    
    
    

    @Override
    public float getValorPeaje() {
        return PRECIO;
    }
    


      
      
    
}
