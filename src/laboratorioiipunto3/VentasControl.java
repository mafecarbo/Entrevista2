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
 * @author DANNA
 */
public class VentasControl implements ActionListener{
    
    private VentasFrame venta;
    private PanaderiaFrame panaderia;
    private historialFrame historial;
    private InformacionFrame informacion;


    public VentasControl(VentasFrame venta) {
        this.venta = venta; 
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String clave = e.getActionCommand();
      if(clave.equals(this.venta.getHistorial().getActionCommand())){
           this.venta.setVisible(false);
           historial = new historialFrame();
           this.historial.setVisible(true);
      }
      if(clave.equals(this.venta.getInformacion().getActionCommand())){
           this.venta.setVisible(false);
           informacion = new InformacionFrame();
           this.informacion.setVisible(true);
      }
      if(clave.equals(this.venta.getVolver().getActionCommand())){
          this.venta.setVisible(false);
          this.panaderia = new PanaderiaFrame();
          this.panaderia.setVisible(true);
       }
      
    }
    
}
