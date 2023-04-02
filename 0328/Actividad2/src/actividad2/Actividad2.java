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
public class Actividad2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Venta ven=new Venta(20);
        ven.agregar("rodri", "mate", 10, 1);
        ven.agregar("rodri1", "mate", 12, 1);
        ven.agregar("rodri2", "mate", 9, 1);
        ven.agregar("rodri3", "mate", 10, 1);
        
        ven.toString();
        System.out.println("");
        //ven.eliminar("rodri1", "mate", 12, 1);
        //ven.toString();
        ven.ordenarProductos();
        System.out.println("");

        ven.toString();
             
    }
    
}
