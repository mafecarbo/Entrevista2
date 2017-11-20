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
import laboratorioiipunto3.AProveedorFrame;
import laboratorioiipunto3.Inventario;
import laboratorioiipunto3.PanaderiaFrame;

/**
 *
 * @author DANNA
 */
public class AProveedorControl implements ActionListener {
    
    private AProveedorFrame proveedor;
    private Inventario añadirProv;
    private PanaderiaFrame panaderia;
    
     public AProveedorControl (AProveedorFrame proveedor) {
        this.proveedor = proveedor;
        
    }

    public void actionPerformed(ActionEvent ae) {
        String comando = ae.getActionCommand();
        
        if(comando.equals(this.proveedor.getConfirmar().getActionCommand())){
            
            
            double a = 0.0;
            Integer b=0;
            String nombre = this.proveedor.getNombreP().getText();
            String tipoPro = this.proveedor.getTipoProP().getText();
            String telefono = this.proveedor.getTelefonoP().getText();
            String deuda = this.proveedor.getDeudaP().getText();
            a =  Double.parseDouble(deuda);
            b.parseInt(telefono);

            this.añadirProv= new Inventario();
            try {
                this.añadirProv.AñadirProveedores(nombre, tipoPro, b , a);
            } catch (IOException ex) {
                Logger.getLogger(AProductoControl.class.getName()).log(Level.SEVERE, null, ex);
            }      
        }if(comando.equals(this.proveedor.getVolver().getActionCommand())){
            this.proveedor.setVisible(false);
            this.panaderia= new PanaderiaFrame();
            this.panaderia.setVisible(true);
        }
    }
    
}
