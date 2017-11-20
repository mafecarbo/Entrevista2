/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorioiipunto3;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author DANNA
 */
public class VentasFrame extends JFrame {
    
    private VentasControl control;
    private JButton historial;
    private JButton informacion;
    private JButton volver;
    private JLabel titulo;
    private JLabel jLabel1;
    private Ventas venta;
    

    public VentasFrame() {
        IntVentas();
    }
    
    
    public void IntVentas(){
        this.venta = new Ventas();
        this.control = new VentasControl (this);
        setBackground(Color.blue);
        setFocusable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setMaximumSize(new java.awt.Dimension(700, 500));
        setMinimumSize(new java.awt.Dimension(700, 500));
        setPreferredSize(new java.awt.Dimension(700, 500));
        setSize(new java.awt.Dimension(700, 500));
        getContentPane().setLayout(null);
        

        this.historial = new javax.swing.JButton();
        getContentPane().add(this.historial);
        this.historial.setFont(new java.awt.Font("Aparajita", 3, 18));
        this.historial.setText("Historial");
        this.historial.setBounds(200, 200, 150, 50);
        this.historial.setActionCommand("historial");
        this.historial.addActionListener(control);
        
        this.informacion = new javax.swing.JButton();
        getContentPane().add(this.informacion);
        this.informacion.setFont(new java.awt.Font("Aparajita", 3, 18));
        this.informacion.setText("Informacion");
        this.informacion.setBounds(420, 200, 150, 50);
        this.informacion.setActionCommand("informacion");
        this.informacion.addActionListener(control);
        
        this.volver = new javax.swing.JButton();
        getContentPane().add(this.volver);
        this.volver.setFont(new java.awt.Font("Aparajita", 3, 18));
        this.volver.setText("Volver");
        this.volver.setBounds(320, 300, 100, 50);
        this.volver.setActionCommand("volver");
        this.volver.addActionListener(control);

        
        this.titulo = new javax.swing.JLabel();
        getContentPane().add(this.titulo);
        this.titulo.setFont(new java.awt.Font("Aparajita", 3, 50));
        this.titulo.setText("Ventas");
        this.titulo.setBounds(150, 100, 450, 50);
        
        this.jLabel1 = new javax.swing.JLabel();
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pan.png")));
        jLabel1.setPreferredSize(new java.awt.Dimension(700, 500));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -0, 700, 500);
        
    }

    public JButton getHistorial() {
        return historial;
    }
    
    public JButton getInformacion() {
        return informacion;
    }
    
     public JButton getVolver() {
        return volver;
    }
     
    public VentasControl getControl(){
        return control;
    }
}
