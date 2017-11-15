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
 * @author Lenovo
 */
public class Registrocontrol implements ActionListener{
    
    private RegistroFrame registro;
    private UsuariosFrame usuario;
    private EmpleadosFrame empleado;
    private PanaderiaFrame panaderia;

    public Registrocontrol(RegistroFrame registro) {
        this.registro = registro;
    }
    
    
    @Override
    public void actionPerformed(ActionEvent ae) {
      String clave = ae.getActionCommand();
      if(clave.equals(this.registro.getUsuario().getActionCommand())){
          this.registro.setVisible(false);
          this.usuario = new UsuariosFrame();
          this.usuario.setVisible(true);
      
      }
      if(clave.equals(this.registro.getEmpleado().getActionCommand())){
          this.registro.setVisible(false);
          this.empleado = new EmpleadosFrame();
          this.empleado.setVisible(true); 
      }
      
      if(clave.equals(this.registro.getVolver().getActionCommand())){
          this.registro.setVisible(false);
          this.panaderia = new PanaderiaFrame();
          this.panaderia.setVisible(true);
    }
          
}
}