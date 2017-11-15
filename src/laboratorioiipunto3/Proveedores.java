/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorioiipunto3;

/**
 *
 * @author myd.abogados
 */
public class Proveedores {
    public String nombre;
    public String tipoProducto;
    public int telefono;
    public double deuda;

    public Proveedores(String nombre, String tipoProducto, int telefono, double deuda) {
        this.nombre = nombre;
        this.tipoProducto = tipoProducto;
        this.telefono = telefono;
        this.deuda = deuda;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public double getDeuda() {
        return deuda;
    }

    public void setDeuda(double deuda) {
        this.deuda = deuda;
    }
    
}
