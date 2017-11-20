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
 * @author Lenovo
 */
public class PanaderiaFrame extends JFrame{
    
    private JButton registrar;
    private JButton inventario;
    private JButton vender;
    private JButton comprar;
    private JButton contactos;
    private JLabel titulo;
    private JLabel jLabel1;
    private Panaderiacontrol control;
    private PanaderiaTriunfo panaderia;

    public PanaderiaFrame() {
        IntPanaderia();
    }
    
    
    public void IntPanaderia(){
        this.panaderia=new PanaderiaTriunfo() {};

            
        this.control = new Panaderiacontrol(this);
        setBackground(Color.blue);
        setFocusable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(800, 600));
        setSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(null);
        
        
        this.registrar = new javax.swing.JButton();
        getContentPane().add(this.registrar);
        this.registrar.setFont(new java.awt.Font("Aparajita", 3, 18));
        this.registrar.setText("Registrar");
        this.registrar.setBounds(200, 150, 100, 50);
        this.registrar.setActionCommand("registrar");
        this.registrar.addActionListener(control);
        
        this.inventario = new javax.swing.JButton();
        getContentPane().add(this.inventario);
        this.inventario.setFont(new java.awt.Font("Aparajita", 3, 18));
        this.inventario.setText("Inventario");
        this.inventario.setBounds(400, 150, 100, 50);
        this.inventario.setActionCommand("inventario");
        this.inventario.addActionListener(control);

        this.vender = new javax.swing.JButton();
        getContentPane().add(this.vender);
        this.vender.setFont(new java.awt.Font("Aparajita", 3, 18));
        this.vender.setText("Vender");
        this.vender.setBounds(100, 250, 100, 50);
        this.vender.setActionCommand("vender");
        this.vender.addActionListener(control);

        this.comprar = new javax.swing.JButton();
        getContentPane().add(this.comprar);
        this.comprar.setFont(new java.awt.Font("Aparajita", 3, 18));
        this.comprar.setText("Compar");
        this.comprar.setBounds(300, 250, 100, 50);
        this.comprar.setActionCommand("comprar");
        this.comprar.addActionListener(control);

        this.contactos = new javax.swing.JButton();
        getContentPane().add(this.contactos);
        this.contactos.setFont(new java.awt.Font("Aparajita", 3, 18));
        this.contactos.setText("Contactos");
        this.contactos.setBounds(500, 250, 100, 50);  
        this.contactos.setActionCommand("contactos");
        this.contactos.addActionListener(control);
        
        this.titulo = new javax.swing.JLabel();
        getContentPane().add(this.titulo);
        this.titulo.setFont(new java.awt.Font("Aparajita", 3, 50));
        this.titulo.setText("Panaderia El Triunfo");
        this.titulo.setBounds(150, 50, 400, 50);
        
        this.jLabel1 = new javax.swing.JLabel();
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pan.png")));
        jLabel1.setPreferredSize(new java.awt.Dimension(700, 500));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -0, 700, 500);
        
    }

    public JButton getRegistrar() {
        return registrar;
    }

    public JButton getInventario() {
        return inventario;
    }

    public JButton getVender() {
        return vender;
    }

    public JButton getComprar() {
        return comprar;
    }

    public JButton getContactos() {
        return contactos;
    }

    public Panaderiacontrol getControl() {
        return control;
    }
    
}
