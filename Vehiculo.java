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
public class Vehiculo {

    private String placa;
    private String marca;
    private float valorPeaje;
    
    private String Tipo;

    public Vehiculo(String placa, String marca) {
        this.placa = placa;
        this.marca = marca;

    }
    
    
    public String Tipo() {
          return Tipo;
    }

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

    public float getValorPeaje() {
        return valorPeaje;
    }

    public void setValorPeaje(float valorPeaje) {
        this.valorPeaje = valorPeaje;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "placa=" + placa + ", marca=" + marca + ", valorPeaje=" + valorPeaje + '}';
    }
    
   

}
