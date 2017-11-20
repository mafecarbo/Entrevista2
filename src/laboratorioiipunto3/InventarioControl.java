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
 * @author myd.abogados
 */
public class InventarioControl implements ActionListener {
    public InventarioFrame frame;
    public PanaderiaFrame panaderia;
    public AProductoFrame añadirPro;
    public verInventFrame verInventario;
    public AProveedorFrame añadirProv;
    public verProvFrame verProveedores;
    public AgotadoFrame agotado;

    public InventarioControl(InventarioFrame inventario) {
        this.frame = inventario; 
        this.añadirPro = añadirPro;
        this.verInventario = verInventario;
        this.añadirProv = añadirProv;
        this.verProveedores = verProveedores;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String clave = e.getActionCommand();
      if(clave.equals(this.frame.getAñadirProducto().getActionCommand())){
          this.frame.setVisible(false);
          añadirPro = new AProductoFrame ();
          this.añadirPro.setVisible(true);
      }
      if(clave.equals(this.frame.getAñadirProveedor().getActionCommand())){
          this.frame.setVisible(false);
          añadirProv = new AProveedorFrame();
          this.añadirProv.setVisible(true);
      }
      if(clave.equals(this.frame.getAgotado().getActionCommand())){
          this.frame.setVisible(false);
          agotado = new AgotadoFrame();
          this.agotado.setVisible(true); 
      }
      if(clave.equals(this.frame.getVerInventario().getActionCommand())){
          this.frame.setVisible(false);
          verInventario = new verInventFrame();
          this.verInventario.setVisible(true);
      }
      if(clave.equals(this.frame.getVerProveedores().getActionCommand())){
        this.frame.setVisible(false);
        verProveedores = new verProvFrame();
        this.verProveedores.setVisible(true);
      }
      if(clave.equals(this.frame.getVolver().getActionCommand())){
          this.frame.setVisible(false);
          this.panaderia = new PanaderiaFrame();
          this.panaderia.setVisible(true);
       }
      
    }
}
