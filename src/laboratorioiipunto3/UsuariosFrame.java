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

/**
 *
 * @author Lenovo
 */
public class UsuariosFrame extends JFrame {
       
    private JLabel nombre;
    private JLabel apellido;
    private JLabel direccion;
    private JLabel telefono;
    private JLabel cedula;
    private JButton confirmar;
    private JButton volver;
    private JFormattedTextField nombreF;
    private JFormattedTextField apellidoF;
    private JFormattedTextField direccionF;
    private JFormattedTextField telefonoF;
    private JFormattedTextField cedulaF;
    
    private JLabel titulo;
    private JLabel jLabel1;
    private Usuarioscontrol control;
    

    public UsuariosFrame() {
        IntRegistro();
    }
    
    
    public void IntRegistro(){
        
        this.control = new Usuarioscontrol(this);
        setBackground(Color.blue);
        setFocusable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setMaximumSize(new java.awt.Dimension(700, 400));
        setMinimumSize(new java.awt.Dimension(700, 400));
        setPreferredSize(new java.awt.Dimension(700, 400));
        setSize(new java.awt.Dimension(700, 400));
        getContentPane().setLayout(null);
        
        
        this.nombre = new javax.swing.JLabel();
        getContentPane().add(this.nombre);
        this.nombre.setFont(new java.awt.Font("Aparajita", 3, 18));
        this.nombre.setText("Nombre");
        this.nombre.setBounds(100, 200, 100, 50);
        
        this.nombreF = new javax.swing.JFormattedTextField();
        getContentPane().add(this.nombreF);
        this.nombreF.setText("Nombre");
        this.nombreF.setBounds(250, 200, 100, 40);
        this.nombreF.addActionListener(control);
        
        this.apellido = new javax.swing.JLabel();
        getContentPane().add(this.apellido);
        this.apellido.setFont(new java.awt.Font("Aparajita", 3, 18));
        this.apellido.setText("Apellido");
        this.apellido.setBounds(100, 240, 100, 40);
        
        this.apellidoF = new javax.swing.JFormattedTextField();
        getContentPane().add(this.apellidoF);
        this.apellidoF.setText("Apellido");
        this.apellidoF.setBounds(250, 240, 100, 40);
        this.apellidoF.addActionListener(control);
        
        this.direccion = new javax.swing.JLabel();
        getContentPane().add(this.direccion);
        this.direccion.setFont(new java.awt.Font("Aparajita", 3, 18));
        this.direccion.setText("Direccion");
        this.direccion.setBounds(100, 280, 100, 40);

        this.direccionF = new javax.swing.JFormattedTextField();
        getContentPane().add(this.direccionF);
        this.direccionF.setFont(new java.awt.Font("Aparajita", 3, 18));
        this.direccionF.setText("Direccion");
        this.direccionF.setBounds(250, 280, 100, 40);
        
        this.telefono = new javax.swing.JLabel();
        getContentPane().add(this.telefono);
        this.telefono.setFont(new java.awt.Font("Aparajita", 3, 18));
        this.telefono.setText("Telefono");
        this.telefono.setBounds(400, 200, 100, 40);
        
        this.telefonoF = new javax.swing.JFormattedTextField();
        getContentPane().add(this.telefonoF);
        this.telefonoF.setText("Nombre");
        this.telefonoF.setBounds(550, 200, 100, 40);
        this.telefonoF.addActionListener(control);
        
        this.cedula = new javax.swing.JLabel();
        getContentPane().add(this.cedula);
        this.cedula.setFont(new java.awt.Font("Aparajita", 3, 18));
        this.cedula.setText("Cedula");
        this.cedula.setBounds(400, 240, 100, 40);
        
        this.cedulaF = new javax.swing.JFormattedTextField();
        getContentPane().add(this.cedulaF);
        this.cedulaF.setText("Cedula");
        this.cedulaF.setBounds(550, 240, 100, 40);
        this.cedulaF.addActionListener(control);
        
        this.confirmar = new javax.swing.JButton();
        getContentPane().add(this.confirmar);
        this.confirmar.setFont(new java.awt.Font("Aparajita", 3, 18));
        this.confirmar.setText("Confirmar");
        this.confirmar.setBounds(400, 280, 100, 50);
        this.confirmar.setActionCommand("confirmar");
        this.confirmar.addActionListener(control);

        
        this.titulo = new javax.swing.JLabel();
        getContentPane().add(this.titulo);
        this.titulo.setFont(new java.awt.Font("Aparajita", 3, 50));
        this.titulo.setText("Crear Usuario");
        this.titulo.setBounds(300, 100, 400, 50);
        this.volver = new javax.swing.JButton();
        getContentPane().add(this.volver);
        this.volver.setFont(new java.awt.Font("Aparajita", 3, 18));
        this.volver.setText("Volver");
        this.volver.setBounds(300, 350, 100, 50);
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

    public JButton getConfirmar() {
        return confirmar;
    }

    public JFormattedTextField getNombreF() {
        return nombreF;
    }

    public JFormattedTextField getApellidoF() {
        return apellidoF;
    }

    public JFormattedTextField getDireccionF() {
        return direccionF;
    }

    public JFormattedTextField getTelefonoF() {
        return telefonoF;
    }

    public JFormattedTextField getCedulaF() {
        return cedulaF;
    }
    
    
    
    

    
}
