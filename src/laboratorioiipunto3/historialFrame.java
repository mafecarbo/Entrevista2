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
import javax.swing.JList;

/**
 *
 * @author DANNA
 */
public class historialFrame extends JFrame {
    
    private historialControl control;
    private JLabel historial;
    private JLabel titulo;
    private JLabel jLabel1;
    private JButton volver;
    private JLabel jlabel2;
    private JList lista1;
    
    public historialFrame() {
        IntHistorial();
    }
    
    
    public void IntHistorial(){
        
        this.control = new historialControl (this);
        setBackground(Color.blue);
        setFocusable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setMaximumSize(new java.awt.Dimension(700, 500));
        setMinimumSize(new java.awt.Dimension(700, 500));
        setPreferredSize(new java.awt.Dimension(700, 500));
        setSize(new java.awt.Dimension(700, 500));
        getContentPane().setLayout(null);
       
        
        this.lista1 = new javax.swing.JList();
        getContentPane().add(this.lista1);
        this.lista1.setBounds(70, 100, 500, 270);

        this.volver = new javax.swing.JButton();
        getContentPane().add(this.volver);
        this.volver.setFont(new java.awt.Font("Aparajita", 3, 18));
        this.volver.setText("Volver");
        this.volver.setBounds(300, 400, 100, 50);
        this.volver.setActionCommand("volver");
        this.volver.addActionListener(control);

        this.titulo = new javax.swing.JLabel();
        getContentPane().add(this.titulo);
        this.titulo.setFont(new java.awt.Font("Aparajita", 3, 50));
        this.titulo.setText("Historial");
        this.titulo.setBounds(150, 10, 300, 50);
        
        this.jlabel2 = new javax.swing.JLabel();
        getContentPane().add(this.jlabel2);
        this.jlabel2.setFont(new java.awt.Font("Aparajita", 3, 18));
        this.jlabel2.setBounds(70, 200, 140, 50);
        
        this.jLabel1 = new javax.swing.JLabel();
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pan.png")));
        jLabel1.setPreferredSize(new java.awt.Dimension(700, 500));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -0, 700, 500);
    
        
    }

     public JButton getVolver() {
        return volver;
    }
     
    
    
    
    
}
