/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad1;

import java.util.Objects;

/**
 *
 * @author Ryzen
 */
public class Estudiante {
    
    private String nombre;
    private String apellido;
    private int edad;
    private double notaPromedio;
    
    public Estudiante(){
        this.nombre = "";
        this.apellido = "";
        this.edad = 0;
    }

    public Estudiante(String nombre, String apellido, int edad, double notaPromedio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.notaPromedio = notaPromedio;
    }

    public Estudiante(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public double getNotaPromedio() {
        return notaPromedio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNotaPromedio(double notaPromedio) {
        this.notaPromedio = notaPromedio;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + Objects.hashCode(this.nombre);
        hash = 17 * hash + Objects.hashCode(this.apellido);
        hash = 17 * hash + this.edad;
        hash = 17 * hash + (int) (Double.doubleToLongBits(this.notaPromedio) ^ (Double.doubleToLongBits(this.notaPromedio) >>> 32));
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
        final Estudiante other = (Estudiante) obj;
        if (this.edad != other.edad) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.apellido, other.apellido)) {
            return false;
        }
        return true;
    }
    
    public void imprimir(){
        System.out.print("Nombre: "+nombre+" Apellido: "+apellido+" Edad: "+edad);
    }
    
}
