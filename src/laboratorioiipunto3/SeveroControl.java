/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorioiipunto3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author myd.abogados
 */
public class SeveroControl implements ActionListener {
     private SeveroFrame frame;
     private PanaderiaFrame panaderia;
     private SeveroEditarFrame sef;
    public SeveroControl(SeveroFrame severo) {
        this.frame = severo;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String clave = e.getActionCommand();
      if(clave.equals(this.frame.getEditar().getActionCommand())){
          this.frame.setVisible(false);
          this.sef= new SeveroEditarFrame();
          this.sef.setVisible(true);    
      }
      
      if(clave.equals(this.frame.getVolver().getActionCommand())){
          this.frame.setVisible(false);
          this.panaderia = new PanaderiaFrame();
          this.panaderia.setVisible(true);
        }
    }
    
}
