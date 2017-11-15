/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorioiipunto3;

import javax.swing.JFrame;

/**
 *
 * @author myd.abogados
 */
public class LaboratorioIIpunto3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PanaderiaTriunfo p= new PanaderiaTriunfo() {
            @Override
            public void Comprar() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void Vender() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        JFrame panaderia = new PanaderiaFrame();
        panaderia.setVisible(true);
    }
    
}
