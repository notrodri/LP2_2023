/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad1;

import java.io.PrintStream;

/**
 *
 * @author Ryzen
 */
public class Actividad1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        RegistroEstudiantes ctn=new RegistroEstudiantes(20);
        ctn.agregar("rodri","holi",20);
        ctn.agregar("rodri2","holi",20);
        ctn.agregar("rodri3","holi",20);
        ctn.agregar("rodri4","holi",20);
        ctn.imprimirRegistros();
        ctn.eliminar("rodri2", "holi", 20);
        System.out.println("");
        ctn.imprimirRegistros();
        
    }
    
}
