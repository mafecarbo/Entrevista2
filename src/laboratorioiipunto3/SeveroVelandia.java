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
public class SeveroVelandia extends PanaderiaTriunfo {
    private String[] dueño;
    private String[] panaderias;

    public SeveroVelandia() throws FileNotFoundException {
        this.InformacionDueño();
        this.InformacionPanaderias();
    }
    
    public void Editar (String nombre, String apellido, String direccion, String telefono, String cedula) throws IOException{
        File usuarios= new File("Dueño.txt");
        try (FileWriter fr = new FileWriter(usuarios)) {
            fr.write(nombre+" ");
            fr.write(apellido+" ");
            fr.write(direccion+" ");
            fr.write("-"+telefono+" ");
            fr.write("C.C:"+cedula+" \r\n");
        }
    }
    public void InformacionDueño() throws FileNotFoundException{
        System.out.println("entro");
        File dueño1= new File("Dueño.txt");
        Scanner flujo= new Scanner(dueño1);
        String nombre= flujo.next();
        String apellido= flujo.next();
        String direccion= flujo.next();
        String telefono=flujo.next();
        String cedula=flujo.next();
        dueño=new String[5];
        dueño[0]=nombre;
        dueño[1]=apellido;
        dueño[2]=direccion;
        dueño[3]=telefono;
        dueño[4]=cedula;
    }
    public void InformacionPanaderias() throws FileNotFoundException{
        System.out.println("entro1");
        int a=0;
        String direccion, telefono;
        File panaderia= new File("Panaderias.txt");
        Scanner flujo= new Scanner(panaderia);
        panaderias=new String[3];
        while(flujo.hasNextLine() && a<3){
            direccion= flujo.next();
            telefono=flujo.next();
            panaderias[a]=direccion+" Tel:"+telefono;
            a++;
        }
    }

    public String[] getDueño() {
        return dueño;
    }

    public String[] getPanaderias() {
        return panaderias;
    }
    


    
}
