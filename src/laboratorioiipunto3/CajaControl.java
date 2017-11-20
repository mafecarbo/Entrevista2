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


/**
 *
 * @author familia
 */
public class CajaControl implements ActionListener {

    private CajaFrame caja;
    private PanaderiaFrame panaderia;
    private Caja Caja1;
    
    public CajaControl(CajaFrame caja) {
        this.caja = caja;
        this.Caja1 = new Caja();
    }
        
    @Override
    public void actionPerformed(ActionEvent ae) {
        String comando = ae.getActionCommand();
        
     if(comando.equals(this.caja.getConfirmar().getActionCommand())){
         
         String producto = this.caja.getNombreProductoF().getText();
         String bool = this.caja.getRegistrado().getText();
         String cantidad = this.caja.getCantidadF().getText();
         System.out.println(bool);
         String cc = this.caja.getCedulaF().getText();
         try {
                this.Caja1.Compra(producto,cantidad, bool, cc);
            } catch (IOException ex) {
                Logger.getLogger(CajaControl.class.getName()).log(Level.SEVERE, null, ex);
            }
         
            this.caja.setVisible(false);
            this.panaderia= new PanaderiaFrame();
            this.panaderia.setVisible(true);
            
         
     }
    }
    
}
