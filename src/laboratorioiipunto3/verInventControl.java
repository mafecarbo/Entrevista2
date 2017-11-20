package laboratorioiipunto3;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListModel;
import laboratorioiipunto3.PanaderiaFrame;
import laboratorioiipunto3.PanaderiaFrame;
import laboratorioiipunto3.verProvControl;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DANNA
 */
public class verInventControl implements ActionListener{
    
    private verInventFrame productos;
    private PanaderiaFrame panaderia;
    private Inventario verInventario;


    public verInventControl (verInventFrame productos) {
        this.productos = productos;
        
    }
    

    public void actionPerformed(ActionEvent ae) {
        String comando = ae.getActionCommand();
        if (comando.equals(this.productos.getConfirmar().getActionCommand())){
        verInventario = new Inventario();
            try {
                this.productos.getLista().setText(this.verInventario.VerInventario());
            } catch (IOException ex) {
                Logger.getLogger(verProvControl.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }if(comando.equals(this.productos.getVolver().getActionCommand())){
            this.productos.setVisible(false);
            this.panaderia= new PanaderiaFrame();
            this.panaderia.setVisible(true);
            
        }    
    }
}
