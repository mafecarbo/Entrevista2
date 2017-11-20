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
    private CajaFrame caja;
    private VentasFrame ventas;
    public  void Inventario(){
        this.inventario = new InventarioFrame();
        this.inventario.setVisible(true);
    };
    public void Comprar(){
        this.caja= new CajaFrame();
        this.caja.setVisible(true);
    };
    public  void Registrar(){
        this.registar = new RegistroFrame();
        this.registar.setVisible(true);
    };
    public  void Vender(){
        this.ventas= new VentasFrame();
        this.ventas.setVisible(true);
    };
    public void Contactos() throws FileNotFoundException{
        this.severo = new SeveroFrame();
        this.severo.setVisible(true);
    };
}
