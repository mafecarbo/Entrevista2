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
import java.util.Scanner;

/**
 *
 * @author myd.abogados
 */
public class Caja extends PanaderiaTriunfo{
    private int situacionCompra;

    public Caja() {
        this.situacionCompra=0;
    }
    
    
    public void ComprarProducto(String producto, boolean usuario, int usuarioCedula) throws FileNotFoundException, IOException{
        double precioFinal;
        int a=0, b=0;
        File productos= new File("ProductosO.txt");
        Scanner flujo=new Scanner(productos);
        String producto1=flujo.next();
        while(flujo.hasNextLine()){
            int cantidad=flujo.nextInt();
            int cantidadM=flujo.nextInt();
            double precio= flujo.nextDouble();
            double porcentaje= flujo.nextDouble();
            if(producto1.equals(producto)){
                if(cantidad>0){
                    b++;
                    if(usuario==true){
                        cantidad--;
                        precioFinal= precio+(precio*porcentaje);
                        File ventasH= new File("ventasH.txt");
                        try (FileWriter fr1 = new FileWriter(ventasH, true)) {
                            fr1.write("Sin usuario ");
                            fr1.write(producto1+" ");
                            fr1.write(precioFinal+" \r\n");
                        }
                        File ventas= new File("ventas.txt");
                        //* Aqui es donde toca sobre escribir para mirar cuando se esta vendiendo de cada producto y cual es el valor de ganancia total por producto/*
                    }
                    else{
                        File usuarios= new File("Usuarios.txt");
                        Scanner flujo1=new Scanner(usuarios); 
                        int cedula=flujo1.nextInt();
                        while(flujo1.hasNextLine()){
                            String nombre=flujo1.next();
                            String apellido=flujo1.next();
                            String direccion=flujo1.next();
                            int telefono=flujo1.nextInt();
                            if(cedula==usuarioCedula){
                                a++;
                                cantidad--;
                                precioFinal= precio+(precio*porcentaje);
                                File ventasH= new File("ventasH.txt");
                                try (FileWriter fr1 = new FileWriter(ventasH, true)) {
                                    fr1.write(usuarioCedula+" ");
                                    fr1.write(producto1+" ");
                                    fr1.write(precioFinal+" \r\n");
                                }
                                File ventas= new File("ventas.txt");
                                //* Aqui es donde toca sobre escribir para mirar cuando se esta vendiendo de cada producto y cual es el valor de ganancia total por producto/*
                            } else {
                                cedula=flujo1.nextInt();
                            }
                        }
                        if(a==0){
                            this.situacionCompra=3; 
                        }
                    } 
                }
                else{
                   this.situacionCompra=2; 
                }
            }
            else{
                producto1=flujo.next();
            }
        }
        if(b==0){
            this.situacionCompra=1;
        }
    }

    

    @Override
    public void Comprar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public void Vender() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public void Registrar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
