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
import laboratorioiipunto3.Inventario;
import laboratorioiipunto3.PanaderiaFrame;
import laboratorioiipunto3.verProvControl;

/**
 *
 * @author DANNA
 */
public class AgotadoControl implements ActionListener {
    
    private AgotadoFrame agotados;
    private PanaderiaFrame panaderia;
    private Inventario inventario;
   


    public AgotadoControl (AgotadoFrame agotado) {
        this.agotados = agotado;
        
    }
    

    public void actionPerformed(ActionEvent ae) {
        String comando = ae.getActionCommand();
        if (comando.equals(this.agotados.getConfirmar().getActionCommand())){
            inventario = new Inventario();
            try {
                this.agotados.getLista().setText(this.inventario.Agotado());
            } catch (IOException ex) {
                Logger.getLogger(verProvControl.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }if(comando.equals(this.agotados.getVolver().getActionCommand())){
            this.agotados.setVisible(false);
            this.panaderia= new PanaderiaFrame();
            this.panaderia.setVisible(true);
            
        }    
    }
    
}
