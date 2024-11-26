/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import Bd.Conexion;
import java.util.List;
import java.util.ArrayList;
import models.Socio;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;

/**
 *
 * @author Cetecom
 */
public class SocioController {
    
    
    Conexion cx;
    public SocioController(){}{
        cx= new Conexion();
        cx.conectar();
    }
    
   public List<Socio> obtenerSocios() throws SQLException{
       List<Socio> socios = new ArrayList<>();
       String query = "SELECT * FROM SOCIO";
       try {
           ResultSet rs = cx.EjecutarQuery(query);
           while (rs.next()){
               Socio.add(new Socio(rs.getInt("rut"),rs.getString("nombre"),rs.getString("fechaNacimiento"),rs.getString("direccion"),rs.getBoolean("menbresiaActiva")));
           
           }
       }
       catch (Exception e){
           System.out.println("");
       }
       return socios;
   } 
    
   public void agregarSocio(int rut, String nombre,String fechaNacimiento,String direccion){
       String query = "INSERT INTO `SOCIO`(rut,, nombre, fechaNacimiento,direccion) VALUES (?,?,?,?)";
       try {
           PreparedStatement st = cx.getConnection().prepareStatement(query);
           st.setInt(1, rut);
           st.setString(2, nombre);
           st.setString(3, fechaNacimiento);
           st.setString(4, direccion);
           st.executeUpdate();
           System.out.println("Socio agregado");
       } catch (Exception e) {
           System.out.println("Erroe al agregar socio " + e.getMessage());
       }
   }
   
   public Socio listarSocios(){
       Socio find = null;
       String query = "SELECT * FROM SOCIO";
       try {
           ResultSet rs=cx.EjecutarQuery(query);
           if (rs.next()){
           find = new Socio();
           find.setRut(rs.getInt("rut"));
           find.setNombre(rs.getString("Nombre"));
           find.setDireccion(rs.getString("direccion"));
           find.setFechaNacimiento(rs.getString("Fecha de Nacimiento"));
           find.getClass();
           }
       } catch (Exception e) {
           System.out.println("Error al listar socios " + e.getMessage());
       }
   }
   
   public void editarSocio(){}
   
   
   
}
