/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorioiipunto3;

import java.awt.Color;
import java.io.FileNotFoundException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author myd.abogados
 */
public class SeveroFrame extends JFrame {
    private JButton volver;
    private JButton editar;
    private JLabel titulo;
    private JLabel jLabel1;
    private JLabel dueño;
    private JLabel panaderias;
    private SeveroControl control;
    private SeveroVelandia severo;
    
    public SeveroFrame() throws FileNotFoundException {
        IntRegistro();
    }
    
    
    public void IntRegistro() throws FileNotFoundException{
        
        this.control = new SeveroControl(this);
        setBackground(Color.blue);
        setFocusable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setMaximumSize(new java.awt.Dimension(700, 400));
        setMinimumSize(new java.awt.Dimension(700, 400));
        setPreferredSize(new java.awt.Dimension(700, 400));
        setSize(new java.awt.Dimension(700, 400));
        getContentPane().setLayout(null);

        this.titulo = new javax.swing.JLabel();
        getContentPane().add(this.titulo);
        this.titulo.setFont(new java.awt.Font("Aparajita", 3, 50));
        this.titulo.setText("Contactos");
        this.titulo.setBounds(300, 100, 400, 50);
        
        this.dueño = new javax.swing.JLabel();
        getContentPane().add(this.dueño);
        this.dueño.setFont(new java.awt.Font("Aparajita", 3, 50));
        this.dueño.setText("2");               
        this.dueño.setBounds(50, 150, 200, 150);
        
        
        this.panaderias = new javax.swing.JLabel();
        getContentPane().add(this.panaderias);
        this.panaderias.setFont(new java.awt.Font("Aparajita", 3, 50));
        this.panaderias.setText("2");
        this.panaderias.setBounds(450, 150, 200, 150);
        
        this.editar = new javax.swing.JButton();
        getContentPane().add(this.editar);
        this.editar.setFont(new java.awt.Font("Aparajita", 3, 18));
        this.editar.setText("Editar");
        this.editar.setBounds(300, 350, 100, 50);
        this.editar.setActionCommand("editar");
        this.editar.addActionListener(control);
        
        this.volver = new javax.swing.JButton();
        getContentPane().add(this.volver);
        this.volver.setFont(new java.awt.Font("Aparajita", 3, 18));
        this.volver.setText("Volver");
        this.volver.setBounds(500, 350, 100, 50);
        this.volver.setActionCommand("volver");
        this.volver.addActionListener(control);
        
        this.jLabel1 = new javax.swing.JLabel();
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pan.png")));
        jLabel1.setPreferredSize(new java.awt.Dimension(700, 500));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -0, 700, 500);
        
    }

    public JButton getVolver() {
        return volver;
    }

    public JButton getEditar() {
        return editar;
    }
    
}
