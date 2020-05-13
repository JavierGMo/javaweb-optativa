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
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 *
 * @author m01
 */
public class Municipio {
    private String idMunicipio, nombreMunicipio;
    private int idPkEstado;
    public Municipio(){
        
    }

    public Municipio(String idMunicipio, String nombreMunicipio, int idPkEstado) {
        this.idMunicipio = idMunicipio;
        this.nombreMunicipio = nombreMunicipio;
        this.idPkEstado = idPkEstado;
    }

    public String getIdMunicipio() {
        return idMunicipio;
    }

    public void setIdMunicipio(String idMunicipio) {
        this.idMunicipio = idMunicipio;
    }

    public String getNombreMunicipio() {
        return nombreMunicipio;
    }

    public void setNombreMunicipio(String nombreMunicipio) {
        this.nombreMunicipio = nombreMunicipio;
    }

    public int getIdPkEstado() {
        return idPkEstado;
    }

    public void setIdPkEstado(int idPkEstado) {
        this.idPkEstado = idPkEstado;
    }
    
    public JSONArray queryTodosLosMunicipios(){
        Map<String, String> todosLosMunicipios = null;
        JSONArray arrayJSONMunicipios = null;
        JSONObject jsonMunicipio = null;
        try{
            Conexion conexion = new Conexion();
            PreparedStatement preparedStatement = conexion.conectar().prepareStatement("SELECT * FROM municipio");
            ResultSet resultado = preparedStatement.executeQuery();
            if(resultado != null){
                arrayJSONMunicipios = new JSONArray();
                todosLosMunicipios = new HashMap<String, String>();
                while(resultado.next()){
                    jsonMunicipio = new JSONObject();
                    jsonMunicipio.put("idmunicipio", resultado.getString("IDMUNICIPIO"));
                    jsonMunicipio.put("nombremunicipio", resultado.getString("NOMBREMUNICIPIO"));                
                    jsonMunicipio.put("idestadopk", resultado.getString("ESTADO_IDESTADO"));
                    arrayJSONMunicipios.put(jsonMunicipio);
                    jsonMunicipio = null;
                }
            }
            resultado.close();
            preparedStatement.close();
            conexion.conectar().close();
        }catch(Exception e){
            e.printStackTrace();
        }
        return arrayJSONMunicipios;
        //return todosLosMunicipios;
        
        
    }
    
    public Map<String, String> queryMunicipioEspecifico(int idDelMunicipio){
        Map<String, String> dataMunicipio = null;
        try
        {
            Conexion conexion = new Conexion();
            PreparedStatement preparedStatement = conexion.conectar().prepareStatement("SELECT * FROM municipio WHERE IDMUNICIPIO=?");
            preparedStatement.setInt(1, idDelMunicipio);
            ResultSet resultado = preparedStatement.executeQuery();
            if(resultado != null && resultado.first()){
                dataMunicipio = new HashMap<String, String>();
                System.out.println("NO esta vacio de modelo");

                dataMunicipio.put("idmunicipio", resultado.getString("IDMUNICIPIO"));
                dataMunicipio.put("nombremunicipio", resultado.getString("NOMBREMUNICIPIO"));                
                dataMunicipio.put("idestadopk", resultado.getString("ESTADO_IDESTADO"));
            }
            
              
              resultado.close();
              preparedStatement.close();
              conexion.conectar().close();
           }
           catch (SQLException e)
           {
              e.printStackTrace();
           }
           return dataMunicipio;
    }
    
}
