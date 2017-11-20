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
import laboratorioiipunto3.PanaderiaTriunfo;
import laboratorioiipunto3.Producto;
import laboratorioiipunto3.Proveedores;


/**
 *
 * @author myd.abogados
 */
public class Inventario extends PanaderiaTriunfo{
    private ArrayList <Producto> producto = new ArrayList();
    private ArrayList <Proveedores> proveedores = new ArrayList();
    private boolean verInventario;
    private double gastos=0;
    private String productos1;
    private String proveedores1;
    
    public void AñadirProducto(String producto1, String proveedor, int cantidad, int cantidadM, 
            double precio, double porcentaje) throws IOException{
        File productos= new File("ProductosO.txt");
        File ventas= new File("Ventas.txt");
        try (FileWriter fr = new FileWriter(productos, true)) {
            fr.write(producto1+", ");
            fr.write(proveedor+", ");
            fr.write(cantidad+", ");
            fr.write(cantidadM+", ");
            fr.write(precio+", ");
            fr.write(porcentaje+" \r\n");
        }
        try (FileWriter fr1 = new FileWriter(ventas, true)) {
            fr1.write(producto1+" ");
            fr1.write(0+" ");
            fr1.write(0+" \r\n");
        }
        gastos=gastos+(precio*cantidad);
        producto.add(new Producto(producto1,proveedor, cantidad,cantidadM, precio, porcentaje));
    }
    public String VerInventario() throws FileNotFoundException{
        File productos = new File ("ProductosO.txt");
        Scanner flujo = new Scanner (productos);
        String producto1, total="Productos:" + "\n";
        while (flujo.hasNextLine()){
            producto1 = flujo.nextLine();
            total = total+"\n" + producto1;
        }
        this.productos1 = total;
        return total;
        
    }
    public String Agotado() throws FileNotFoundException, IOException{
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
        return null;
    }
    public void AñadirProveedores(String proveedor1, String tipoProducto, int telefono, double deuda)throws FileNotFoundException, IOException{
        File proveedor= new File("Proveedores.txt");
        try (FileWriter fr = new FileWriter(proveedor, true)) {
            fr.write(proveedor1+", ");
            fr.write(tipoProducto+", ");
            fr.write(telefono+", ");
            fr.write(deuda+" \r\n");
        }
        proveedores.add(new Proveedores(proveedor1, tipoProducto, telefono, deuda ));
    }
    public String VerProveedores () throws FileNotFoundException{
        File proveedor= new File("Proveedores.txt");
        Scanner flujo=new Scanner(proveedor);
        String provee1, total="Proveedores:"+"\n";
        while (flujo.hasNextLine()){
            provee1 = flujo.nextLine();
            total = total+"/n" + provee1;
        }
        this.proveedores1 = total;
        return total;
    }
    
    
}
