/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorioiipunto3;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;


/**
 *
 * @author Lenovo
 */
public class Panaderiacontrol implements ActionListener{

    public PanaderiaFrame frame;
    public PanaderiaTriunfo panaderia;

    public Panaderiacontrol(PanaderiaFrame panaderia) {
        this.frame = panaderia;
    }
    
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        String clave = ae.getActionCommand();
      if(clave.equals(this.frame.getRegistrar().getActionCommand())){
            this.frame.setVisible(false);
            this.panaderia=new PanaderiaTriunfo() {
               
            };
            this.panaderia.Registrar();
      }
      if(clave.equals(this.frame.getComprar().getActionCommand())){
          this.frame.setVisible(false);
            this.panaderia=new PanaderiaTriunfo() {    

                
            };
            this.panaderia.Comprar();
      }
      if(clave.equals(this.frame.getContactos().getActionCommand())){
          this.frame.setVisible(false);
            this.panaderia=new PanaderiaTriunfo() {    
                

                
            };
            try {
                this.panaderia.Contactos();
            } catch (FileNotFoundException ex) {
                System.out.println("pollito");
            }
      
      }
      if(clave.equals(this.frame.getVender().getActionCommand())){
          this.frame.setVisible(false);
            this.panaderia=new PanaderiaTriunfo() {
               
            };
            this.panaderia.Vender();
      
      }
      if(clave.equals(this.frame.getInventario().getActionCommand())){
        this.frame.setVisible(false);
            this.panaderia=new PanaderiaTriunfo() {
                
                

                @Override
                public void Vender() {}
            };
        this.panaderia.Inventario();
      
      }
      
    }
    
}
