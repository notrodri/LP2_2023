/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad2;

import java.util.Objects;

/**
 *
 * @author Ryzen
 */
public class Producto implements Comparable<Producto>{
    
    protected String nombre;
    protected String descripcion;
    protected int precio;
    protected int cantStock;
    
    public Producto(){
        
    }

    public Producto(String nombre, String descripcion, int precio, int cantStock) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantStock = cantStock;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getPrecio() {
        return precio;
    }

    public int getCantStock() {
        return cantStock;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setCantStock(int cantStock) {
        this.cantStock = cantStock;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + Objects.hashCode(this.nombre);
        hash = 61 * hash + Objects.hashCode(this.descripcion);
        hash = 61 * hash + this.precio;
        hash = 61 * hash + this.cantStock;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Producto other = (Producto) obj;
        if (this.precio != other.precio) {
            return false;
        }
        if (this.cantStock != other.cantStock) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.descripcion, other.descripcion)) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Producto t) {
        if(t==null){return 0;}
        int resultado;
        if(this.precio==t.precio){ resultado=0;}
        else if(this.precio>t.precio){resultado=1;}
        else{
            resultado=-1;
        }
        return resultado;
    }

    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", descripcion=" + descripcion + ", precio=" + precio + ", cantStock=" + cantStock + '}';
    }
    
    
    
}
