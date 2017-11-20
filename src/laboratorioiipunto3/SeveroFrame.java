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
    private JLabel dueño1;
    private JLabel dueño2;
    private JLabel dueño3;
    private JLabel dueño4;
    private JLabel panaderias;
    private JLabel panaderias1;
    private JLabel panaderias2;
    private SeveroControl control;
    private SeveroVelandia severo;
    
    public SeveroFrame() throws FileNotFoundException {
        IntRegistro();
    }
    
    
    public void IntRegistro() throws FileNotFoundException{
        this.severo= new SeveroVelandia(); 
        this.severo.InformacionDueño();
        this.severo.InformacionPanaderias();
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
        this.dueño.setFont(new java.awt.Font("Aparajita", 3, 30));
        this.dueño.setText(this.severo.getDueño()[0]);               
        this.dueño.setBounds(50, 150, 100, 50);
        
        this.dueño1 = new javax.swing.JLabel();
        getContentPane().add(this.dueño1);
        this.dueño1.setFont(new java.awt.Font("Aparajita", 3, 30));
        this.dueño1.setText(this.severo.getDueño()[1]);               
        this.dueño1.setBounds(50, 200, 100, 50);
        
        this.dueño2 = new javax.swing.JLabel();
        getContentPane().add(this.dueño2);
        this.dueño2.setFont(new java.awt.Font("Aparajita", 3, 30));
        this.dueño2.setText(this.severo.getDueño()[2]);               
        this.dueño2.setBounds(50, 250, 100, 50);
        
        this.dueño3 = new javax.swing.JLabel();
        getContentPane().add(this.dueño3);
        this.dueño3.setFont(new java.awt.Font("Aparajita", 3, 25));
        this.dueño3.setText("Tel: "+this.severo.getDueño()[3]);               
        this.dueño3.setBounds(50, 300, 150, 50);
        
        this.dueño4 = new javax.swing.JLabel();
        getContentPane().add(this.dueño4);
        this.dueño4.setFont(new java.awt.Font("Aparajita", 3, 25));
        this.dueño4.setText("C.I: "+this.severo.getDueño()[4]);               
        this.dueño4.setBounds(50, 350, 150, 50);
        
        this.panaderias = new javax.swing.JLabel();
        getContentPane().add(this.panaderias);
        this.panaderias.setFont(new java.awt.Font("Aparajita", 3, 25));
        this.panaderias.setText(this.severo.getPanaderias()[0]);
        this.panaderias.setBounds(450, 150, 200, 50);
        
        this.panaderias1 = new javax.swing.JLabel();
        getContentPane().add(this.panaderias1);
        this.panaderias1.setFont(new java.awt.Font("Aparajita", 3, 25));
        this.panaderias1.setText(this.severo.getPanaderias()[1]);
        this.panaderias1.setBounds(450, 200, 200, 50);
        
        this.panaderias2 = new javax.swing.JLabel();
        getContentPane().add(this.panaderias2);
        this.panaderias2.setFont(new java.awt.Font("Aparajita", 3, 25));
        this.panaderias2.setText(this.severo.getPanaderias()[2]);
        this.panaderias2.setBounds(450, 250, 200, 50);
        
        this.editar = new javax.swing.JButton();
        getContentPane().add(this.editar);
        this.editar.setFont(new java.awt.Font("Aparajita", 3, 18));
        this.editar.setText("Editar");
        this.editar.setBounds(300, 400, 100, 50);
        this.editar.setActionCommand("editar");
        this.editar.addActionListener(control);
        
        this.volver = new javax.swing.JButton();
        getContentPane().add(this.volver);
        this.volver.setFont(new java.awt.Font("Aparajita", 3, 18));
        this.volver.setText("Volver");
        this.volver.setBounds(100, 400, 100, 50);
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
