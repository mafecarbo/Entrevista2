/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorioiipunto3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author myd.abogados
 */
public class Registro extends PanaderiaTriunfo{
    
    @Override
    public void Registrar() {
       
    }
    public void RegistroUsuario (String nombre, String apellido, String direccion, String telefono, String cedula) throws IOException{
        File usuarios= new File("Usuarios.txt");
        try (FileWriter fr = new FileWriter(usuarios, true)) {
            fr.write(nombre+" ");
            fr.write(apellido+" ");
            fr.write(direccion+" ");
            fr.write(telefono+" ");
            fr.write(cedula+" \r\n");
        }
    }
    public void RegistroEmpleado (String nombre, String apellido, String direccion, String telefono, String cedula) throws IOException{
        File empleados= new File("Empleados.txt");
        try (FileWriter fr = new FileWriter(empleados, true)) {
            fr.write(nombre+" ");
            fr.write(apellido+" ");
            fr.write(direccion+" ");
            fr.write(telefono+" ");
            fr.write(cedula+" \r\n");
        }
    }
    
    
}
