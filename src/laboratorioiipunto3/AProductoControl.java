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
import laboratorioiipunto3.AProductoFrame;
import laboratorioiipunto3.Inventario;
import laboratorioiipunto3.PanaderiaFrame;

/**
 *
 * @author DANNA
 */
public class AProductoControl implements ActionListener {
    
    private AProductoFrame producto;
    private PanaderiaFrame panaderia;
    private Inventario añadirP;
   

    public AProductoControl (AProductoFrame producto) {
        this.producto = producto;
        
    }

    public void actionPerformed(ActionEvent ae) {
        String comando = ae.getActionCommand();
            Integer a = 0;
            Integer b = 0;
            double c = 0.0;
            double d = 0.0; 
        if(comando.equals(this.producto.getConfirmar().getActionCommand())){

            String nombre = this.producto.getNombreP().getText();
            String nombrePP = this.producto.getNombrePP().getText();
            String cantidad = this.producto.getCantidadP().getText();
            a = Integer.parseInt(cantidad);
            String cantidadM = this.producto.getCantidadMP().getText();
            b = Integer.parseInt(cantidadM);
            String precio = this.producto.getPrecioP().getText();
            c =  Double.parseDouble(precio);
            String porcentaje = this.producto.getPorcentajeP().getText();
            d =  Double.parseDouble(porcentaje);

            this.añadirP = new Inventario();
            try {
                this.añadirP.AñadirProducto(nombre, nombrePP, a, b, c, d);
            } catch (IOException ex) {
                Logger.getLogger(AProductoControl.class.getName()).log(Level.SEVERE, null, ex);
            }      
        }if(comando.equals(this.producto.getVolver().getActionCommand())){
            this.producto.setVisible(false);
            this.panaderia= new PanaderiaFrame();
            this.panaderia.setVisible(true);
        }
    }
    
}
