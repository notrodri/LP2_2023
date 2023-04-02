/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad2;

/**
 *
 * @author Ryzen
 */
public class Envio {
    
    //se cobra por kilometro de envio
    protected int direccion;
    protected static int montoPorKm=50;
    
    public int costoEnvio(int direccion, Producto productoCobrar){
        return direccion*montoPorKm+productoCobrar.getPrecio();
    }
    
}
