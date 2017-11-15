/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorioiipunto3;

import java.io.FileNotFoundException;



/**
 *
 * @author myd.abogados
 */
public abstract class  PanaderiaTriunfo {
    private  RegistroFrame registar;
    private  InventarioFrame inventario;
    private SeveroFrame severo;
    public  void Inventario(){
        this.inventario = new InventarioFrame();
        this.inventario.setVisible(true);
    };
    public abstract void Comprar();
    public  void Registrar(){
        this.registar = new RegistroFrame();
        this.registar.setVisible(true);
    };
    public abstract void Vender();
    public void Contactos() throws FileNotFoundException{
        this.severo = new SeveroFrame();
        this.severo.setVisible(true);
    };
}
