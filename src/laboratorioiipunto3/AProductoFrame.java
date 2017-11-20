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
import laboratorioiipunto3.PanaderiaFrame;

/**
 *
 * @author DANNA
 */
public class AProductoFrame extends JFrame {
    
    private JLabel nombre;
    private JLabel nombreProv;
    private JLabel cantidad;
    private JLabel cantidadM;
    private JLabel precio;
    private JLabel porcentaje;
    private JButton confirmar;
    private JButton volver;
    
    private JFormattedTextField nombreP;
    private JFormattedTextField nombrePP;
    private JFormattedTextField cantidadP;
    private JFormattedTextField cantidadMP;
    private JFormattedTextField precioP;
    private JFormattedTextField porcentajeP;
    
    
    private JLabel titulo;
    private JLabel jLabel1;
    private AProductoControl control;
    private PanaderiaFrame panaderia;
    

    public AProductoFrame() {
        IntAñadir();
    }
    
    
    public void IntAñadir(){
        
        this.control = new AProductoControl (this);
        setBackground(Color.blue);
        setFocusable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setMaximumSize(new java.awt.Dimension(700, 500));
        setMinimumSize(new java.awt.Dimension(700, 500));
        setPreferredSize(new java.awt.Dimension(700, 500));
        setSize(new java.awt.Dimension(700, 500));
        getContentPane().setLayout(null);
        
        
        this.nombre = new javax.swing.JLabel();
        getContentPane().add(this.nombre);
        this.nombre.setFont(new java.awt.Font("Aparajita", 3, 18));
        this.nombre.setText("Nombre producto");
        this.nombre.setBounds(70, 200, 140, 50);
        
        this.nombreP = new javax.swing.JFormattedTextField();
        getContentPane().add(this.nombreP);
        this.nombreP.setText("Nombre producto");
        this.nombreP.setBounds(220, 200, 100, 50);
        this.nombreP.addActionListener(control);
        
        this.nombreProv = new javax.swing.JLabel();
        getContentPane().add(this.nombreProv);
        this.nombreProv.setFont(new java.awt.Font("Aparajita", 3, 18));
        this.nombreProv.setText("Nombre proveedor");
        this.nombreProv.setBounds(370, 200, 140, 50);
        
        this.nombrePP = new javax.swing.JFormattedTextField();
        getContentPane().add(this.nombrePP);
        this.nombrePP.setText("Nombre proveedor");
        this.nombrePP.setBounds(520, 200, 110, 50);
        this.nombrePP.addActionListener(control);
        
        this.cantidad = new javax.swing.JLabel();
        getContentPane().add(this.cantidad);
        this.cantidad.setFont(new java.awt.Font("Aparajita", 3, 18));
        this.cantidad.setText("Cantidad");
        this.cantidad.setBounds(70, 240, 100, 50);
        
        this.cantidadP = new javax.swing.JFormattedTextField();
        getContentPane().add(this.cantidadP);
        this.cantidadP.setText("Cantidad");
        this.cantidadP.setBounds(220, 240, 100, 50);
        this.cantidadP.addActionListener(control);
        
        this.cantidadM = new javax.swing.JLabel();
        getContentPane().add(this.cantidadM);
        this.cantidadM.setFont(new java.awt.Font("Aparajita", 3, 18));
        this.cantidadM.setText("Cantidad minima");
        this.cantidadM.setBounds(370, 240, 130, 50);
        
        this.cantidadMP = new javax.swing.JFormattedTextField();
        getContentPane().add(this.cantidadMP);
        this.cantidadMP.setText("Cantidad minima");
        this.cantidadMP.setBounds(520, 240, 110, 50);
        this.cantidadMP.addActionListener(control);
        
        this.precio = new javax.swing.JLabel();
        getContentPane().add(this.precio);
        this.precio.setFont(new java.awt.Font("Aparajita", 3, 18));
        this.precio.setText("Precio");
        this.precio.setBounds(70, 280, 100, 50);

        this.precioP = new javax.swing.JFormattedTextField();
        getContentPane().add(this.precioP);
        this.precioP.setText("Precio");
        this.precioP.setBounds(220, 280, 100, 50);
        this.precioP.addActionListener(control);
        
        this.porcentaje= new javax.swing.JLabel();
        getContentPane().add(this.porcentaje);
        this.porcentaje.setFont(new java.awt.Font("Aparajita", 3, 18));
        this.porcentaje.setText("Porcentaje");
        this.porcentaje.setBounds(370, 280, 100, 50);
        
        this.porcentajeP = new javax.swing.JFormattedTextField();
        getContentPane().add(this.porcentajeP);
        this.porcentajeP.setText("Porcentaje");
        this.porcentajeP.setBounds(520, 280, 110, 50);
        this.porcentajeP.addActionListener(control);
        

        this.confirmar = new javax.swing.JButton();
        getContentPane().add(this.confirmar);
        this.confirmar.setFont(new java.awt.Font("Aparajita", 3, 18));
        this.confirmar.setText("Confirmar");
        this.confirmar.setBounds(220, 350, 150, 50);
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
        this.titulo.setText("Añadir Producto");
        this.titulo.setBounds(150, 100, 450, 50);
        
        this.jLabel1 = new javax.swing.JLabel();
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pan.png")));
        jLabel1.setPreferredSize(new java.awt.Dimension(700, 500));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -0, 700, 500);
        
    }

    public JButton getConfirmar() {
        return confirmar;
    }
    
     public JButton getVolver() {
        return volver;
    }

    public JFormattedTextField getNombreP() {
        return nombreP;
    }
    
    public JFormattedTextField getNombrePP(){
        return nombrePP;
    }

    public JFormattedTextField getCantidadP() {
        return cantidadP;
    }
    
    public JFormattedTextField getCantidadMP() {
        return cantidadMP;
    }

    public JFormattedTextField getPrecioP() {
        return precioP;
    }

    public JFormattedTextField getPorcentajeP() {
        return porcentajeP;
    }
    
    

    
    
}
