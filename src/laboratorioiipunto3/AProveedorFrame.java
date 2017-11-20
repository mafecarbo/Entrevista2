/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorioiipunto3;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import laboratorioiipunto3.PanaderiaFrame;

/**
 *
 * @author DANNA
 */
public class AProveedorFrame extends JFrame {
    
    private JLabel nombre;
    private JLabel tipoPro;
    private JLabel telefono;
    private JLabel deuda;
    private JButton confirmar;
    private JButton volver;
    
    private JFormattedTextField nombreP;
    private JFormattedTextField tipoProP;
    private JFormattedTextField telefonoP;
    private JFormattedTextField deudaP;

    private JLabel titulo;
    private JLabel jLabel1;
    private AProveedorControl control;
    private PanaderiaFrame panaderia;
    
    
    public AProveedorFrame() {
        IntAñadir();
    }
    
    
    public void IntAñadir(){
        
        this.control = new AProveedorControl (this);
        setBackground(Color.blue);
        setFocusable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setMaximumSize(new java.awt.Dimension(700, 500));
        setMinimumSize(new java.awt.Dimension(700, 500));
        setPreferredSize(new java.awt.Dimension(700, 500));
        setSize(new java.awt.Dimension(700, 500));
        getContentPane().setLayout(null);
        
        
        this.nombre = new javax.swing.JLabel();
        getContentPane().add(this.nombre);
        this.nombre.setFont(new java.awt.Font("Aparajita", 3, 18));
        this.nombre.setText("Nombre proveedor");
        this.nombre.setBounds(30, 200, 180, 50);
        
        this.nombreP = new javax.swing.JFormattedTextField();
        getContentPane().add(this.nombreP);
        this.nombreP.setText("Nombre");
        this.nombreP.setBounds(220, 200, 100, 50);
        this.nombreP.addActionListener(control);
        
        this.tipoPro = new javax.swing.JLabel();
        getContentPane().add(this.tipoPro);
        this.tipoPro.setFont(new java.awt.Font("Aparajita", 3, 18));
        this.tipoPro.setText("Tipo producto");
        this.tipoPro.setBounds(370, 200, 140, 50);
        
        this.tipoProP = new javax.swing.JFormattedTextField();
        getContentPane().add(this.tipoProP);
        this.tipoProP.setText("Tipo producto");
        this.tipoProP.setBounds(520, 200, 110, 50);
        this.tipoProP.addActionListener(control);
        
        this.telefono = new javax.swing.JLabel();
        getContentPane().add(this.telefono);
        this.telefono.setFont(new java.awt.Font("Aparajita", 3, 18));
        this.telefono.setText("Telefono");
        this.telefono.setBounds(30, 240, 100, 50);
        
        this.telefonoP = new javax.swing.JFormattedTextField();
        getContentPane().add(this.telefonoP);
        this.telefonoP.setText("Telefono");
        this.telefonoP.setBounds(220, 240, 100, 50);
        this.telefonoP.addActionListener(control);
        
        this.deuda = new javax.swing.JLabel();
        getContentPane().add(this.deuda);
        this.deuda.setFont(new java.awt.Font("Aparajita", 3, 18));
        this.deuda.setText("Deuda");
        this.deuda.setBounds(370, 240, 130, 50);
        
        this.deudaP = new javax.swing.JFormattedTextField();
        getContentPane().add(this.deudaP);
        this.deudaP.setText("Inserte un valor");
        this.deudaP.setBounds(520, 240, 110, 50);
        this.deudaP.addActionListener(control);

        this.confirmar = new javax.swing.JButton();
        getContentPane().add(this.confirmar);
        this.confirmar.setFont(new java.awt.Font("Aparajita", 3, 18));
        this.confirmar.setText("Confirmar");
        this.confirmar.setBounds(220, 300, 150, 50);
        this.confirmar.setActionCommand("confirmar");
        this.confirmar.addActionListener(control);
        
        this.volver = new javax.swing.JButton();
        getContentPane().add(this.volver);
        this.volver.setFont(new java.awt.Font("Aparajita", 3, 18));
        this.volver.setText("Volver");
        this.volver.setBounds(520, 300, 100, 50);
        this.volver.setActionCommand("volver");
        this.volver.addActionListener(control);

        
        this.titulo = new javax.swing.JLabel();
        getContentPane().add(this.titulo);
        this.titulo.setFont(new java.awt.Font("Aparajita", 3, 50));
        this.titulo.setText("Añadir Proveedor");
        this.titulo.setBounds(150, 100, 450, 50);
        
        this.jLabel1 = new javax.swing.JLabel();
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pan.png")));
        jLabel1.setPreferredSize(new java.awt.Dimension(700, 500));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -0, 700, 500);
        
    }

    public JButton getConfirmar() {
        return confirmar;
    }
    
     public JButton getVolver() {
        return volver;
    }

    public JFormattedTextField getNombreP() {
        return nombreP;
    }
    
    public JFormattedTextField getTipoProP(){
        return tipoProP;
    }

    public JFormattedTextField getTelefonoP() {
        return telefonoP;
    }
    
    public JFormattedTextField getDeudaP() {
        return deudaP;
    }
  
}
