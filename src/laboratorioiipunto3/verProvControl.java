/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorioiipunto3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import laboratorioiipunto3.PanaderiaFrame;

/**
 *
 * @author DANNA
 */
public class verProvControl implements ActionListener {
    
    private verProvFrame proveedor;
    private PanaderiaFrame panaderia;
    private Inventario inventario;
   


    public verProvControl (verProvFrame proveedores) {
        this.proveedor = proveedores;
        
    }
    

    public void actionPerformed(ActionEvent ae) {
        String comando = ae.getActionCommand();
        if (comando.equals(this.proveedor.getConfirmar().getActionCommand())){
            
            inventario = new Inventario();
            try {
                this.proveedor.getLista().setText(this.inventario.VerProveedores());
            } catch (IOException ex) {
                Logger.getLogger(verProvControl.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }if(comando.equals(this.proveedor.getVolver().getActionCommand())){
            this.proveedor.setVisible(false);
            this.panaderia= new PanaderiaFrame();
            this.panaderia.setVisible(true);
            
        }    
    }
    
}
