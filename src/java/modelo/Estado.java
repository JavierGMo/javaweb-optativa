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
import org.json.JSONArray;
import org.json.JSONObject;

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
    
    public JSONArray queryEstados(){
        Map<String, String> todosLosEstados = null;
        JSONArray arrayJSONEstados = null;
        JSONObject jsonEstados = null;
        
        try{
            Conexion conexion = new Conexion();
            PreparedStatement preparedStatement = conexion.conectar().prepareStatement("SELECT * FROM estado");
            ResultSet resultado = preparedStatement.executeQuery();
            if(resultado != null){
                arrayJSONEstados = new JSONArray();
                //System.out.println("NO esta vacio de modelo");
                
                todosLosEstados = new HashMap<String, String>();
                while(resultado.next()){
                    jsonEstados = new JSONObject();
                    jsonEstados.put("idestado", resultado.getString("IDESTADO"));
                    jsonEstados.put("nombreestado", resultado.getString("NOMBRE"));                
                    arrayJSONEstados.put(jsonEstados);
                    jsonEstados = null;
                }
            }
            resultado.close();
            preparedStatement.close();
            conexion.conectar().close();
        }catch(Exception e){
            e.printStackTrace();
        }
        return arrayJSONEstados;
        //return todosLosEstados;
        
    }
    public Map<String, String> queryEstadoEspecifico(int idDelEstado){
        Map<String, String> dataEstados = null;
        try
        {
            Conexion conexion = new Conexion();
            PreparedStatement preparedStatement = conexion.conectar().prepareStatement("SELECT * FROM estado WHERE IDESTADO=?");
            preparedStatement.setInt(1, idDelEstado);
            ResultSet resultado = preparedStatement.executeQuery();
            if(resultado != null && resultado.first()){
                dataEstados = new HashMap<String, String>();
                System.out.println("NO esta vacio de modelo");

                dataEstados.put("idestado", resultado.getString("IDESTADO"));
                dataEstados.put("nombreestado", resultado.getString("NOMBRE"));                
            }
            
              
              resultado.close();
              preparedStatement.close();
              conexion.conectar().close();
           }
           catch (SQLException e)
           {
              e.printStackTrace();
           }
           return dataEstados;
    }
    
}
