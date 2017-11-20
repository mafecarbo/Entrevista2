/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorioiipunto3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import laboratorioiipunto3.PanaderiaTriunfo;

/**
 *
 * @author myd.abogados
 */
public class Caja extends PanaderiaTriunfo{

    
    public void sobreescribir (String lineanueva, String lineavieja, File archivo) throws FileNotFoundException, IOException{
        
        String nFnuevo = "auxiliar"+archivo.getName();

        File fNuevo= new File(nFnuevo);
        
        Scanner lee = new Scanner(archivo);
        try(FileWriter fw = new FileWriter(fNuevo)){
            while(lee.hasNextLine()){
                String a = lee.nextLine();
                if(a.equals(lineavieja)){
                    fw.write(lineanueva+ "\r\n");
                }else{
                    fw.write(a + "\r\n");
                }
            }
        }
        lee.close();
        
        Scanner lee2 = new Scanner(fNuevo);
        try(FileWriter fw = new FileWriter(archivo)){
            while(lee2.hasNextLine()){
                String a = lee2.nextLine();
                fw.write(a + "\r\n");
            }
        }
        lee2.close();
        

        
    }

    
    public void Compra (String producto, String cantidad, String bool, String cedula) throws FileNotFoundException, IOException{
        Integer cant = 0;
        int Cant = cant.parseInt(cantidad); // CONVIERTE EL STRING DE LA CANTIDAD DEL PRODUCTO QUE DESEA
        Integer cc = 0;
        boolean a = true;
        if(bool.equals("si")){ //CONVIERTE EN BOOLEAN EL STRING DE REGISTRADO
            a = true;
        }else{
            a = false;
        }
        
        File file= new File("ProductosO.txt");
        Scanner leer= new Scanner(file);
        
        //PARA VERIFICAR QUE EL USUARIO ESTA REGISTRADO EN LA PLATAFORMA
        File usuarios = new File("Usuarios.txt");
        Scanner u = new Scanner(usuarios);
        if(a){
            
            while(u.hasNextLine()){

                 if(u.hasNext()){
                    u.next();
                    u.next();
                    u.next();
                    u.next();
                    String ce = u.next();
                    if(ce.equals(cedula)){

                         while(leer.hasNextLine()){
                            if(leer.hasNext()){
                                String p = leer.next();
                                String linea = null;
                                if(p.equals(producto)){
                                    int c = leer.nextInt();
                                    int d = leer.nextInt();
                                    int e = leer.nextInt();
                                    int f = leer.nextInt();
                                    String v = p + " " + c + " " + d + " " + e + " " + f;
                                    c -= Cant;
                                    linea = p + " " + c + " " + d + " " + e + " " + f;
                                    sobreescribir(linea,v,file);
                                    break;

                                }
                            }
                        }
                        leer.close();
                    }
                }
                u.nextLine();
            }
            u.close();
        }
    }
    

    

    
    @Override
    public void Vender() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
