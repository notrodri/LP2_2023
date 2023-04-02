/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package actividad1;

//import org.apache.commons.lang3.ArrayUtils;
 
import java.util.Arrays;
import org.apache.commons.lang3.ArrayUtils;
/**
 *
 * @author Ryzen
 */
public class RegistroEstudiantes {
    
    protected Estudiante arreglo[];
    
    public RegistroEstudiantes(int cant){
        this.arreglo=new Estudiante[cant];
    }
    
    public void agregar(Estudiante nuevo){
        for(int i=0;i<arreglo.length;i++){
            if(arreglo[i]==null){
                arreglo[i]=nuevo;
                return;
            }
        }
    }
    public void agregar(String nombre, String apellido, int edad){
        Estudiante nuevo=new Estudiante(nombre,apellido,edad);
        this.agregar(nuevo);
    }
    public void eliminar(String nombre, String apellido, int edad){
        Estudiante EstudianteAEliminar=new Estudiante (nombre,apellido,edad);
        arreglo=ArrayUtils.removeElement(arreglo,EstudianteAEliminar);
        //System.out.println(arreglo.length);
        //this.arreglo=ArrayUtils.removeElement(this.arreglo,1);    
    }
    public Estudiante buscar(String nombre){
        for(int i=0;i<arreglo.length;i++){
               if(arreglo[i].getNombre()==nombre){
                   return arreglo[i];
               }
        }
        return new Estudiante();
    }
    public int buscar(String nombre,String apellido, int edad){
        for(int i=0;i<arreglo.length;i++){
            if(arreglo[i].equals(new Estudiante(nombre,apellido,edad))){
                return i;
            }
        }
        return -1;
    }
    public void imprimirRegistros(){
        for(int i=0;i<arreglo.length;i++){
            if(arreglo[i]==null) return;
            System.out.print("Nº:"+i+" ");
            arreglo[i].imprimir();
            System.out.print("\n");
        }
    }
}
