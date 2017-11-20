/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorioiipunto3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author myd.abogados
 */
public class SeveroEditarControl implements ActionListener {
    private SeveroEditarFrame frame;
    private SeveroVelandia severo;
    private PanaderiaFrame panaderia;
    public SeveroEditarControl(SeveroEditarFrame editar) {
        this.frame = editar;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String comando = e.getActionCommand();
        
        if(comando.equals(this.frame.getConfirmar().getActionCommand())){
            
            String nombre = this.frame.getNombreF().getText();
            String apellido = this.frame.getApellidoF().getText();
            String cedula = this.frame.getCedulaF().getText();
            String telefono = this.frame.getTelefonoF().getText();
            String direccion = this.frame.getDireccionF().getText();
            
            try {
                this.severo= new SeveroVelandia();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(SeveroEditarControl.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                this.severo.Editar(nombre, apellido, direccion, telefono, direccion);
            } catch (IOException ex) {
                Logger.getLogger(Empleadoscontrol.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.frame.setVisible(false);
            this.panaderia= new PanaderiaFrame();
            this.panaderia.setVisible(true);
                
        }
        if(comando.equals(this.frame.getVolver().getActionCommand())){
            this.frame.setVisible(false);
           this.panaderia = new PanaderiaFrame();
           this.panaderia.setVisible(true);
        }
    }
}
