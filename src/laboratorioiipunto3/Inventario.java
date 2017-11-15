/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorioiipunto3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author myd.abogados
 */
public class Inventario extends PanaderiaTriunfo{
    private ArrayList <Producto> producto = new ArrayList();
    private ArrayList <Proveedores> proveedores = new ArrayList();
    private boolean verInventario;
    private double gastos=0;
    
    public void AñadirProducto(String producto1, String proveedor, int cantidad, int cantidadM, double precio, double porcentaje) throws IOException{
        File productos= new File("ProductosO.txt");
        File ventas= new File("Ventas.txt");
        try (FileWriter fr = new FileWriter(productos, true)) {
            fr.write(producto1+" ");
            fr.write(proveedor+" ");
            fr.write(cantidad+" ");
            fr.write(cantidadM+" ");
            fr.write(precio+" ");
            fr.write(porcentaje+" \r\n");
        }
        try (FileWriter fr1 = new FileWriter(ventas, true)) {
            fr1.write(producto1+" ");
            fr1.write(0+" ");
            fr1.write(0+" \r\n");
        }
        gastos=gastos+(precio*cantidad);
        producto.add(new Producto(producto1, cantidad, precio, porcentaje, cantidadM));
    }
    public void VerInventario(){
        this.verInventario=true;
    }
    public void Agotado() throws FileNotFoundException, IOException{
        File productos= new File("ProductosO.txt");
        File pedir= new File("Pedir.txt");
        Scanner flujo=new Scanner(productos);
        while(flujo.hasNextLine()){
            String producto1=flujo.next();
            int cantidad=flujo.nextInt();
            int cantidadM=flujo.nextInt();
            double precio= flujo.nextDouble();
            double porcentaje= flujo.nextDouble();
            if(cantidadM>=cantidad){
               try (FileWriter fr = new FileWriter(pedir, true)) {
                    fr.write(producto1+" \r\n");
                } 
            }
        }
    }
    public void AñadirProveedores(String proveedor1, String tipoProducto, int telefono, double deuda)throws FileNotFoundException, IOException{
        File proveedor= new File("Proveedor.txt");
        try (FileWriter fr = new FileWriter("Proveedor", true)) {
            fr.write(proveedor1+" ");
            fr.write(tipoProducto+" ");
            fr.write(telefono+" ");
            fr.write(deuda+" \r\n");
        }
        proveedores.add(new Proveedores(proveedor1, tipoProducto, telefono, deuda ));
    }
    public void VerProveedores () throws FileNotFoundException{
        File proveedor= new File("Proveedor.txt");
        Scanner flujo=new Scanner(proveedor);
        while(flujo.hasNextLine()){
            String prveedor1=flujo.next();
            String tipoproducto1=flujo.next();
            int telefono=flujo.nextInt();
            double deuda= flujo.nextDouble();
        }
    }
    @Override
    public void Comprar(){}
    @Override
    public void Vender(){}
    
}
