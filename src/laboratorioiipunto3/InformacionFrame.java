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
import javax.swing.JTextField;

/**
 *
 * @author DANNA
 */
public class InformacionFrame extends JFrame{
    
    private InformacionControl control;
    private JLabel pMasVendido;
    private JLabel ganancias;
    private JLabel perdidas;
    private JButton volver;
    private JLabel titulo;
    private JLabel jLabel1;
    
    private JTextField vendidoP;
    private JTextField gananciasP;
    private JTextField perdidasP;
    

    public InformacionFrame() {
        IntInformacion();
    }
    
    public void IntInformacion(){
        this.control = new InformacionControl (this);
        setBackground(Color.blue);
        setFocusable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setMaximumSize(new java.awt.Dimension(700, 500));
        setMinimumSize(new java.awt.Dimension(700, 500));
        setPreferredSize(new java.awt.Dimension(700, 500));
        setSize(new java.awt.Dimension(700, 500));
        getContentPane().setLayout(null);
        
        
        this.pMasVendido = new javax.swing.JLabel();
        getContentPane().add(this.pMasVendido);
        this.pMasVendido.setFont(new java.awt.Font("Aparajita", 3, 18));
        this.pMasVendido.setText("Productos mas vendido");
        this.pMasVendido.setBounds(70, 200, 300, 50);
        
        this.vendidoP= new javax.swing.JTextField();
        getContentPane().add(this.vendidoP);
        this.vendidoP.setBounds(420, 200, 100, 50);
        
        this.ganancias = new javax.swing.JLabel();
        getContentPane().add(this.ganancias);
        this.ganancias.setFont(new java.awt.Font("Aparajita", 3, 18));
        this.ganancias.setText("Ganancias");
        this.ganancias.setBounds(70, 300, 300, 50);
        
        this.gananciasP= new javax.swing.JTextField();
        getContentPane().add(this.gananciasP);
        this.gananciasP.setBounds(420, 300, 100, 50);
        
        this.perdidas = new javax.swing.JLabel();
        getContentPane().add(this.perdidas);
        this.perdidas.setFont(new java.awt.Font("Aparajita", 3, 18));
        this.perdidas.setText("Ganancias");
        this.perdidas.setBounds(70, 400, 300, 50);
        
        this.perdidasP= new javax.swing.JTextField();
        getContentPane().add(this.perdidasP);
        this.perdidasP.setBounds(420, 400, 100, 50);
        
        this.volver = new javax.swing.JButton();
        getContentPane().add(this.volver);
        this.volver.setFont(new java.awt.Font("Aparajita", 3, 18));
        this.volver.setText("Volver");
        this.volver.setBounds(550, 250, 100, 50);
        this.volver.setActionCommand("volver");
        this.volver.addActionListener(control);

        
        this.titulo = new javax.swing.JLabel();
        getContentPane().add(this.titulo);
        this.titulo.setFont(new java.awt.Font("Aparajita", 3, 50));
        this.titulo.setText("Informacion ventas");
        this.titulo.setBounds(100, 10, 500, 50);
        
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
