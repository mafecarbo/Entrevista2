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
public class Producto {
    private String nombre;
    private int cantidad;
    private double precio;
    private double porcentaje;
    private int cantidadM;
    private String proovedor;

    public Producto(String nombre, String proovedor, int cantidad,  int cantidadM,double precio, double porcentaje) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
        this.porcentaje = porcentaje;
        this.cantidadM= cantidadM;
    }

    public void setCantidadM(int cantidadM) {
        this.cantidadM = cantidadM;
    }

    public void setProovedor(String proovedor) {
        this.proovedor = proovedor;
    }

    public int getCantidadM() {
        return cantidadM;
    }

    public String getProovedor() {
        return proovedor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }
    
}
