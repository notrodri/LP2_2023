/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad1;

/**
 *
 * @author Ryzen
 */
public class EstudianteInternacional extends Estudiante{
    
    protected String paisDeOrigen;

    public EstudianteInternacional(String paisDeOrigen, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.paisDeOrigen = paisDeOrigen;
    }

    public String getPaisDeOrigen() {
        return paisDeOrigen;
    }

    public void setPaisDeOrigen(String paisDeOrigen) {
        this.paisDeOrigen = paisDeOrigen;
    }
    
    
    
}
