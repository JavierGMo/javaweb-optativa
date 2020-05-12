/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import conexion.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 *
 * @author m01
 */
public class Calle {
    private String idCalle, nombreCalle;
    private int idPkEstado, idPkMunicipio;
    public Calle(){
        
    }

    public Calle(String idCalle, String nombreCalle, int idPkEstado, int idPkMunicipio) {
        this.idCalle = idCalle;
        this.nombreCalle = nombreCalle;
        this.idPkEstado = idPkEstado;
        this.idPkMunicipio = idPkMunicipio;
    }

    public String getIdCalle() {
        return idCalle;
    }

    public void setIdCalle(String idCalle) {
        this.idCalle = idCalle;
    }

    public String getNombreCalle() {
        return nombreCalle;
    }

    public void setNombreCalle(String nombreCalle) {
        this.nombreCalle = nombreCalle;
    }

    public int getIdPkEstado() {
        return idPkEstado;
    }

    public void setIdPkEstado(int idPkEstado) {
        this.idPkEstado = idPkEstado;
    }

    public int getIdPkMunicipio() {
        return idPkMunicipio;
    }

    public void setIdPkMunicipio(int idPkMunicipio) {
        this.idPkMunicipio = idPkMunicipio;
    }
    public void queryNombreCalles(){
        
    }
    
    public void queryCalleEspecifica(int idDeCalle){
        LinkedList<String[]> usuario = new LinkedList<>();
        Map<String, String> dataUsuario = null;
        int i = 0;
        try
        {
            Conexion conexion = new Conexion();
            PreparedStatement preparedStatement = conexion.conectar().prepareStatement("SELECT * FROM usuario WHERE CORREO=? AND CONTRASENIA = ?");
            //preparedStatement.setString(1, correo);
            //preparedStatement.setString(2, password);
            ResultSet resultado = preparedStatement.executeQuery();
            if(resultado != null && resultado.first()){
                dataUsuario = new HashMap<String, String>();
                System.out.println("NO esta vacio de modelo");

                dataUsuario.put("nombre", resultado.getString("NOMBRE"));
                dataUsuario.put("apellido", resultado.getString("APELLIDO"));
                dataUsuario.put("nombreusuario", resultado.getString("NOMBREUSUARIO"));
                dataUsuario.put("correo", resultado.getString("CORREO"));
                dataUsuario.put("refimagenperfil", resultado.getString("REFIMAGENPERFIL"));
                dataUsuario.put("tipo", resultado.getString("TIPO"));
                dataUsuario.put("password", resultado.getString("CONTRASENIA"));
                
                /*
                while (resultado.next()){
                    System.out.println(resultado.getString(i));
                    usuario.add(resultado.getString(i));
                    ++i;
                }*/
            }
            
              
              resultado.close();
              preparedStatement.close();
              conexion.conectar().close();
           }
           catch (SQLException e)
           {
              e.printStackTrace();
           }
           //return dataUsuario;
        
    }
    
}
