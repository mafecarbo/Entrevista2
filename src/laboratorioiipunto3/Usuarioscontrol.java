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
public class Usuarioscontrol implements ActionListener{
    private UsuariosFrame usuario;
    private PanaderiaFrame panaderia;
    private Registro registrar;

    public Usuarioscontrol(UsuariosFrame usuario) {
        this.usuario = usuario;
        
    }
    
    
    

    @Override
    public void actionPerformed(ActionEvent ae) {
        String comando = ae.getActionCommand();
        
        if(comando.equals(this.usuario.getConfirmar().getActionCommand())){
            
            String nombre = this.usuario.getNombreF().getText();
            String apellido = this.usuario.getApellidoF().getText();
            String cedula = this.usuario.getCedulaF().getText();
            String telefono = this.usuario.getTelefonoF().getText();
            String direccion = this.usuario.getDireccionF().getText();
            this.registrar= new Registro();
            try {
                this.registrar.RegistroUsuario(nombre, apellido, direccion, telefono, cedula);
            } catch (IOException ex) {
                Logger.getLogger(Usuarioscontrol.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.usuario.setVisible(false);
            this.panaderia= new PanaderiaFrame();
            this.panaderia.setVisible(true);
                
        }
        if(comando.equals(this.usuario.getVolver().getActionCommand())){
            this.usuario.setVisible(false);
           this.panaderia = new PanaderiaFrame();
           this.panaderia.setVisible(true);
        }
        
    }
    
    
}
