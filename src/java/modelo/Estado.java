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
public class Estado {
    private String idEstado, idNombre;
    
    public Estado(){
        
    }

    public Estado(String idEstado, String idNombre) {
        this.idEstado = idEstado;
        this.idNombre = idNombre;
    }

    public String getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(String idEstado) {
        this.idEstado = idEstado;
    }

    public String getIdNombre() {
        return idNombre;
    }

    public void setIdNombre(String idNombre) {
        this.idNombre = idNombre;
    }
    
    public void queryEstados(){
        try{
            Conexion conexion = new Conexion();
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
    public void queryEstadoEspecifico(int idDelEstado){
        LinkedList<String[]> usuario = new LinkedList<>();
        Map<String, String> dataUsuario = null;
        int i = 0;
        try
        {
            Conexion conexion = new Conexion();
            PreparedStatement preparedStatement = conexion.conectar().prepareStatement("SELECT * FROM estado WHERE IDESTADO=?");
            preparedStatement.setInt(1, idDelEstado);
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
