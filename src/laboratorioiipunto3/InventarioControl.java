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
public class InventarioControl implements ActionListener {
    public InventarioFrame frame;
    public PanaderiaFrame panaderia;

    public InventarioControl(InventarioFrame inventario) {
        this.frame = inventario;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String clave = e.getActionCommand();
      if(clave.equals(this.frame.getAñadirProducto().getActionCommand())){
            this.frame.setVisible(false);
      }
      if(clave.equals(this.frame.getAñadirProducto().getActionCommand())){
          
      }
      if(clave.equals(this.frame.getAgotado().getActionCommand())){
      
      }
      if(clave.equals(this.frame.getVerInventario().getActionCommand())){
      
      }
      if(clave.equals(this.frame.getVerProveedores().getActionCommand())){
        this.frame.setVisible(false);
      }
      if(clave.equals(this.frame.getVolver().getActionCommand())){
          this.frame.setVisible(false);
          this.panaderia = new PanaderiaFrame();
          this.panaderia.setVisible(true);
       }
      
    }
}
