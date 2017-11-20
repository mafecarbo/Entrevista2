/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorioiipunto3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import laboratorioiipunto3.PanaderiaFrame;

/**
 *
 * @author DANNA
 */
public class historialControl implements ActionListener {
    
    private historialFrame historial;
    private PanaderiaFrame panaderia;
    
    public historialControl (historialFrame historial){
        this.historial = historial;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String clave = e.getActionCommand();
      
      if(clave.equals(this.historial.getVolver().getActionCommand())){
          this.historial.setVisible(false);
          this.panaderia = new PanaderiaFrame();
          this.panaderia.setVisible(true);
       }
      
    }
    
}
