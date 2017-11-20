/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorioiipunto3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import laboratorioiipunto3.PanaderiaFrame;

/**
 *
 * @author DANNA
 */
public class InformacionControl implements ActionListener {
    
    private InformacionFrame informacion;
    private PanaderiaFrame panaderia;
    
    public InformacionControl(InformacionFrame informacion){
        this.informacion = informacion;
    }
    
    public void actionPerformed(ActionEvent ae) {
        String comando = ae.getActionCommand();
            
        if(comando.equals(this.informacion.getVolver().getActionCommand())){
            this.informacion.setVisible(false);
            this.panaderia= new PanaderiaFrame();
            this.panaderia.setVisible(true);
            
        }    
    }
    
}
