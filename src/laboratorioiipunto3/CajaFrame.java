/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorioiipunto3;

import java.awt.Color;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
/**
 *
 * @author familia
 */
public class CajaFrame extends JFrame{
    
    private JLabel nombreProducto;
    private JLabel cedula;
    private JLabel registrado;
    private JLabel cantidad;
    private JButton confirmarVenta;
    private JButton volver;
    
    private JFormattedTextField nombreProductoF;
    private JFormattedTextField cedulaF;
    private JFormattedTextField registradoF;
    private JFormattedTextField cantidadF;
    
    private JLabel titulo;
    private JLabel jLabel1;
    private CajaControl control;

    public CajaFrame() { 
        this.control = new CajaControl(this);
        IntCaja();
    }

    public JFormattedTextField getNombreProductoF() {
        return nombreProductoF;
    }

    public JFormattedTextField getCedulaF() {
        return cedulaF;
    }

    public JFormattedTextField getCantidadF() {
        return cantidadF;
    }
    

    public void IntCaja(){
       
        setBackground(Color.blue);
        setFocusable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setMaximumSize(new java.awt.Dimension(700, 400));
        setMinimumSize(new java.awt.Dimension(700, 400));
        setPreferredSize(new java.awt.Dimension(700, 400));
        setSize(new java.awt.Dimension(700, 400));
        getContentPane().setLayout(null);
        
        

        this.registrado = new javax.swing.JLabel();
        getContentPane().add(this.registrado);
        this.registrado.setFont(new java.awt.Font("Aparajita", 3, 18));
        this.registrado.setText("El usuario esta registrado? ");
        this.registrado.setBounds(100, 200, 200, 50);
        
        this.registradoF = new javax.swing.JFormattedTextField();
        getContentPane().add(this.registradoF);
        this.registradoF.setText("si o no");
        this.registradoF.setBounds(270, 200, 100, 40);
        this.registradoF.addActionListener(this.control);

        this.nombreProducto = new javax.swing.JLabel();
        getContentPane().add(this.nombreProducto);
        this.nombreProducto.setFont(new java.awt.Font("Aparajita", 3, 18));
        this.nombreProducto.setText("Nombre del producto");
        this.nombreProducto.setBounds(100, 240, 200, 40);
        
        this.nombreProductoF = new javax.swing.JFormattedTextField();
        getContentPane().add(this.nombreProductoF);
        this.nombreProductoF.setText("Producto");
        this.nombreProductoF.setBounds(270, 240, 100, 40);
        this.nombreProductoF.addActionListener(this.control);
        
        this.cedula = new javax.swing.JLabel();
        getContentPane().add(this.cedula);
        this.cedula.setFont(new java.awt.Font("Aparajita", 3, 18));
        this.cedula.setText("Cedula del usuario");
        this.cedula.setBounds(100, 280, 100, 40);
        
        this.cedulaF = new javax.swing.JFormattedTextField();
        getContentPane().add(this.cedulaF);
        this.cedulaF.setText("Cedula");
        this.cedulaF.setBounds(270, 280, 100, 40);
        this.cedulaF.addActionListener(this.control);
        
        this.cantidad = new javax.swing.JLabel();
        getContentPane().add(this.cantidad);
        this.cantidad.setFont(new java.awt.Font("Aparajita", 3, 18));
        this.cantidad.setText("Cantidad");
        this.cantidad.setBounds(400, 200, 100, 40);
        
        this.cantidadF = new javax.swing.JFormattedTextField();
        getContentPane().add(this.cantidadF);
        this.cantidadF.setText("Cantidad");
        this.cantidadF.setBounds(550, 200, 100, 40);
        this.cantidadF.addActionListener(this.control);
        
        
        this.confirmarVenta = new javax.swing.JButton();
        getContentPane().add(this.confirmarVenta);
        this.confirmarVenta.setFont(new java.awt.Font("Aparajita", 3, 18));
        this.confirmarVenta.setText("Confirmar venta");
        this.confirmarVenta.setBounds(400, 280, 170, 50);
        this.confirmarVenta.setActionCommand("confirmar venta");
        this.confirmarVenta.addActionListener(this.control);
        
        
        
        
        this.jLabel1 = new javax.swing.JLabel();
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pan.png")));
        jLabel1.setPreferredSize(new java.awt.Dimension(700, 500));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -0, 700, 500);
    }
    
    
    public JButton getConfirmar() {
        return confirmarVenta;
    }
    
    public JFormattedTextField getRegistrado(){
        return registradoF;
    }
    

        
}
