/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad2;

import java.util.Arrays;
import org.apache.commons.lang3.ArrayUtils;

/**
 *
 * @author Ryzen
 */
public class Venta {
    protected Producto ventas[];
    
    public Venta(int productos){
        ventas=new Producto[productos];
    }
    
    public void agregar(Producto nuevo){
        for(int i=0;i<ventas.length;i++){
            if(ventas[i]==null){
                ventas[i]=nuevo;
                return;
            }
        }
    }
    public void agregar(String nombre, String descripcion, int precio, int cantStock){
        Producto nuevo=new Producto(nombre,descripcion,precio,cantStock);
        this.agregar(nuevo);
    }
    public void eliminar(String nombre, String descripcion, int precio, int cantStock){
        Producto ProductoAEliminar=new Producto (nombre,descripcion,precio,cantStock);
        ventas=ArrayUtils.removeElement(ventas,ProductoAEliminar);
        //System.out.println(ventas.length);
        //this.ventas=ArrayUtils.removeElement(this.ventas,1);    
    }
    public Producto buscar(String nombre){
        for(int i=0;i<ventas.length;i++){
               if(ventas[i].getNombre()==nombre){
                   return ventas[i];
               }
        }
        return new Producto();
    }
    public int buscar(String nombre, String descripcion, int precio, int cantStock){
        for(int i=0;i<ventas.length;i++){
            if(ventas[i].equals(new Producto(nombre,descripcion,precio,cantStock))){
                return i;
            }
        }
        return -1;
    }
    public void ordenarProductos(){
        for (int x = 0; x < ventas.length; x++) {
        for (int i = 0; i < ventas.length-x-1; i++) {
            if(ventas[i]!=null){
            if(ventas[i].compareTo(ventas[i+1])<0){
                Producto tmp = ventas[i+1];
                ventas[i+1] = ventas[i];
                ventas[i] = tmp;
            }}
        }
        }
    }
    @Override
    public String toString(){
        String retornable="";
        for (Producto venta : ventas) {
            if(venta==null)return retornable;
            retornable += venta.toString();
            System.out.println(venta.toString());
        }
        return retornable;
    }
    
    
}
