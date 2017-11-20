package laboratorioiipunto3;


import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextArea;
import laboratorioiipunto3.InventarioControl;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DANNA
 */
public class verInventFrame extends JFrame {
    private JTextArea lista;
    private JButton volver;
    private JButton confirmar;
    private JLabel titulo;
    private JLabel jLabel1;
    private verInventControl control;
    private Inventario inventario;
    private DefaultListModel model;
    
    public verInventFrame() {
        verInventario();
    }

    public void verInventario(){
        this.inventario=new Inventario(); 
        this.control = new verInventControl (this);
        setBackground(Color.blue);
        setFocusable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setMaximumSize(new java.awt.Dimension(700, 500));
        setMinimumSize(new java.awt.Dimension(700, 500));
        setPreferredSize(new java.awt.Dimension(700, 500));
        setSize(new java.awt.Dimension(700, 500));
        getContentPane().setLayout(null);

        
        
        this.lista = new javax.swing.JTextArea();
        getContentPane().add(this.lista);
        this.lista.setBounds(70, 150, 300, 300);

        this.confirmar = new javax.swing.JButton();
        getContentPane().add(this.confirmar);
        this.confirmar.setFont(new java.awt.Font("Aparajita", 3, 18));
        this.confirmar.setText("Confirmar");
        this.confirmar.setBounds(520, 250, 150, 50);
        this.confirmar.setActionCommand("confirmar");
        this.confirmar.addActionListener(control);
        
        this.volver = new javax.swing.JButton();
        getContentPane().add(this.volver);
        this.volver.setFont(new java.awt.Font("Aparajita", 3, 18));
        this.volver.setText("Volver");
        this.volver.setBounds(520, 350, 100, 50);
        this.volver.setActionCommand("volver");
        this.volver.addActionListener(control);

        
        this.titulo = new javax.swing.JLabel();
        getContentPane().add(this.titulo);
        this.titulo.setFont(new java.awt.Font("Aparajita", 3, 50));
        this.titulo.setText("Inventario");
        this.titulo.setBounds(250, 0, 200, 50);
        
        this.jLabel1 = new javax.swing.JLabel();
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pan.png")));
        jLabel1.setPreferredSize(new java.awt.Dimension(700, 500));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -0, 700, 500);
        
    }    
    
    public JButton getConfirmar(){
        return confirmar;
    }
    
    public JButton getVolver() {
        return volver;
    }

    public JTextArea getLista() {
        return lista;
    }

}
