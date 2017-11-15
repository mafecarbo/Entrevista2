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
public class RegistroFrame extends JFrame{
       
    private JButton usuario;
    private JButton empleado;
    private JButton volver;
    
    

    private JLabel titulo;
    private JLabel jLabel1;
    private Registrocontrol control;
    

    public RegistroFrame() {
        IntRegistro();
    }
    
    
    public void IntRegistro(){
        
        this.control = new Registrocontrol(this);
        setBackground(Color.blue);
        setFocusable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setMaximumSize(new java.awt.Dimension(700, 400));
        setMinimumSize(new java.awt.Dimension(700, 400));
        setPreferredSize(new java.awt.Dimension(700, 400));
        setSize(new java.awt.Dimension(700, 400));
        getContentPane().setLayout(null);
        
        
        this.usuario = new javax.swing.JButton();
        getContentPane().add(this.usuario);
        this.usuario.setFont(new java.awt.Font("Aparajita", 3, 18));
        this.usuario.setText("Usuario");
        this.usuario.setBounds(200, 200, 100, 50);
        this.usuario.setActionCommand("usuario");
        this.usuario.addActionListener(control);
        
        this.empleado = new javax.swing.JButton();
        getContentPane().add(this.empleado);
        this.empleado.setFont(new java.awt.Font("Aparajita", 3, 18));
        this.empleado.setText("Empleado");
        this.empleado.setBounds(400, 200, 100, 50);
        this.empleado.setActionCommand("empleado");
        this.empleado.addActionListener(control);
        
        this.volver = new javax.swing.JButton();
        getContentPane().add(this.volver);
        this.volver.setFont(new java.awt.Font("Aparajita", 3, 18));
        this.volver.setText("Volver");
        this.volver.setBounds(300, 300, 100, 50);
        this.volver.setActionCommand("volver");
        this.volver.addActionListener(control);

        
        this.titulo = new javax.swing.JLabel();
        getContentPane().add(this.titulo);
        this.titulo.setFont(new java.awt.Font("Aparajita", 3, 50));
        this.titulo.setText("Registro");
        this.titulo.setBounds(300, 100, 400, 50);
        
        this.jLabel1 = new javax.swing.JLabel();
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pan.png")));
        jLabel1.setPreferredSize(new java.awt.Dimension(700, 500));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -0, 700, 500);
        
    } 

    public JButton getUsuario() {
        return usuario;
    }

    public JButton getEmpleado() {
        return empleado;
    }

    public JButton getVolver() {
        return volver;
    }

    
}
