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
public class Camion extends Vehiculo {

    final float PRECIO = 5000;
    private int numeroEjes;

    public Camion(String placa, String marca, int numeroEjes) {

        super(placa, marca);
        this.numeroEjes = numeroEjes;
    }

    public String Tipo() {

        return "soy Camion";

    }

    public int getNumeroEjes() {
        return numeroEjes;
    }

    public void setNumeroEjes(int numeroEjes) {
        this.numeroEjes = numeroEjes;
    }

    
    @Override
    public float getValorPeaje() {
        return PRECIO;
    }
    
    
    

    @Override
    public String toString() {
        return "Camion{" + "numeroEjes=" + numeroEjes + '}';
    }

}
