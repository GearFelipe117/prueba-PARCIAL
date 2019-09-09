/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudio_parcial_desarrollo_web;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author FELIPE
 */
public class Estudio_parcial_desarrollo_web {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        List<Vehiculo> arreglo = new ArrayList();

        Carro carro1 = new Carro("mnc 472", "chevrolet");
        Camion camion1 = new Camion("iex 190", "hiundai",1);

        arreglo.add(carro1);
        arreglo.add(camion1);
        arreglo.add(new Moto("ale 15"," susuki"));

        System.out.println(arreglo);
        
        System.out.println("mostrado en formato JSON SERIA ASI");
        
        for (int i = 0; i < arreglo.size(); i++) {

            Vehiculo a = arreglo.get(i);

            if (a instanceof Camion) {
                System.out.println("{ Vehiculo: { Tipo: {" + ((Camion) a).Tipo() + "}, ValorPeaje: {" + a.getValorPeaje() + "},Marca: {" + a.getMarca() + "},Placa:{" + a.getPlaca() + "}}}");

            } else {
                System.out.println("{ Vehiculo { Tipo: {" + a.Tipo() + "}, ValorPeaje: {" + a.getValorPeaje() + "},Marca: {" + a.getMarca() + "},Placa:{" + a.getPlaca() + "}}}");

            }
        }
        
        System.out.println("*******************************************************");
        System.out.println("convirtiendo alguno en json en xml SERIA:");
        
        System.out.println("<Vehiculo> <Tipo>"+arreglo.get(0).Tipo()+"</Tipo> <ValorPeaje>"+arreglo.get(0).getValorPeaje()+"</ValorPeaje> <Marca>"+arreglo.get(0).getMarca()+"</Marca> <Placa>"+arreglo.get(0).getPlaca()+"</Placa></Vehiculo>" );

    }

}
