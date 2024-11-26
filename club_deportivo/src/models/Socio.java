/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author Cetecom
 */
public class Socio {

    public static void add(Socio socio) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    private int rut;
    private String nombre;
    private String fechaNacimiento;
    private String direccion;
    private boolean menbresiaActiva;

    public Socio() {
    }

    public Socio(int rut, String nombre, String fechaNacimiento, String direccion, boolean menbresiaActiva) {
        this.rut = rut;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
        this.menbresiaActiva = menbresiaActiva;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public boolean isMenbresiaActiva() {
        return menbresiaActiva;
    }

    public void setMenbresiaActiva(boolean menbresiaActiva) {
        this.menbresiaActiva = menbresiaActiva;
    }
    
    
}
