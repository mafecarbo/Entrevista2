/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorioiipunto3;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lenovo
 */
public class Empleadoscontrol implements ActionListener{
    private EmpleadosFrame empleado;
    private PanaderiaFrame panaderia;
    private Registro registrar;
    public Empleadoscontrol(EmpleadosFrame empleado) {
        this.empleado = empleado;
    }
    
    
    
 
    @Override
    public void actionPerformed(ActionEvent ae) {
        String comando = ae.getActionCommand();
        
        if(comando.equals(this.empleado.getConfirmar().getActionCommand())){
            
            String nombre = this.empleado.getNombreF().getText();
            String apellido = this.empleado.getApellidoF().getText();
            String cedula = this.empleado.getCedulaF().getText();
            String telefono = this.empleado.getTelefonoF().getText();
            String direccion = this.empleado.getDireccionF().getText();
            this.registrar= new Registro();
            try {
                this.registrar.RegistroUsuario(nombre, apellido, direccion, telefono, cedula);
            } catch (IOException ex) {
                Logger.getLogger(Empleadoscontrol.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.empleado.setVisible(false);
            this.panaderia= new PanaderiaFrame();
            this.panaderia.setVisible(true);
                
        }
        if(comando.equals(this.empleado.getVolver().getActionCommand())){
            this.empleado.setVisible(false);
           this.panaderia = new PanaderiaFrame();
           this.panaderia.setVisible(true);
        }
    }
}
