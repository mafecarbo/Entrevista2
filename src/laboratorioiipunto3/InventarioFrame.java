/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorioiipunto3;

import java.awt.Color;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author myd.abogados
 */
public class InventarioFrame extends JFrame {
    private JButton verInventario;
    private JButton añadirProducto;
    private JButton añadirProveedor;
    private JButton verProveedores;
    private JButton agotado;
    private JButton volver;
    private JLabel titulo;
    private JLabel jLabel1;
    private InventarioControl control;
    private Inventario inventario;
    public InventarioFrame() {
        IntInventario();
    }
    public void IntInventario(){
        this.inventario=new Inventario(); 
        this.control = new InventarioControl(this);
        setBackground(Color.blue);
        setFocusable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setMaximumSize(new java.awt.Dimension(700, 400));
        setMinimumSize(new java.awt.Dimension(700, 400));
        setPreferredSize(new java.awt.Dimension(700, 400));
        setSize(new java.awt.Dimension(700, 400));
        getContentPane().setLayout(null);
        
        
        this.verInventario = new javax.swing.JButton();
        getContentPane().add(this.verInventario);
        this.verInventario.setFont(new java.awt.Font("Aparajita", 3, 18));
        this.verInventario.setText("Ver Inventario");
        this.verInventario.setBounds(200, 150, 150, 50);
        this.verInventario.setActionCommand("verInventario");
        this.verInventario.addActionListener(control);
        
        this.añadirProducto = new javax.swing.JButton();
        getContentPane().add(this.añadirProducto);
        this.añadirProducto.setFont(new java.awt.Font("Aparajita", 3, 18));
        this.añadirProducto.setText("Añadir Producto");
        this.añadirProducto.setBounds(400, 150, 150, 50);
        this.añadirProducto.setActionCommand("añadirProducto");
        this.añadirProducto.addActionListener(control);

        this.añadirProveedor = new javax.swing.JButton();
        getContentPane().add(this.añadirProveedor);
        this.añadirProveedor.setFont(new java.awt.Font("Aparajita", 3, 18));
        this.añadirProveedor.setText("Añadir Proveedor");
        this.añadirProveedor.setBounds(100, 250, 150, 50);
        this.añadirProveedor.setActionCommand("añadirProveedor");
        this.añadirProveedor.addActionListener(control);

        this.verProveedores = new javax.swing.JButton();
        getContentPane().add(this.verProveedores);
        this.verProveedores.setFont(new java.awt.Font("Aparajita", 3, 18));
        this.verProveedores.setText("Ver Proveedores");
        this.verProveedores.setBounds(300, 250, 150, 50);
        this.verProveedores.setActionCommand("verProveedores");
        this.verProveedores.addActionListener(control);

        this.agotado = new javax.swing.JButton();
        getContentPane().add(this.agotado);
        this.agotado.setFont(new java.awt.Font("Aparajita", 3, 18));
        this.agotado.setText("Agotado");
        this.agotado.setBounds(500, 250, 150, 50);  
        this.agotado.setActionCommand("agotado");
        this.agotado.addActionListener(control);
        
        this.titulo = new javax.swing.JLabel();
        getContentPane().add(this.titulo);
        this.titulo.setFont(new java.awt.Font("Aparajita", 3, 50));
        this.titulo.setText("Inventario");
        this.titulo.setBounds(150, 50, 400, 50);
        
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

    public JButton getVerInventario() {
        return verInventario;
    }

    public JButton getAñadirProducto() {
        return añadirProducto;
    }

    public JButton getAñadirProveedor() {
        return añadirProveedor;
    }

    public JButton getVerProveedores() {
        return verProveedores;
    }

    public JButton getAgotado() {
        return agotado;
    }

    public JButton getVolver() {
        return volver;
    }
    
}
