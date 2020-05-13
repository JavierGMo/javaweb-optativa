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
    public JSONArray queryTodasLasCalles(){
        JSONArray arrayJSONCalles = null;
        JSONObject jsonCalles = null;
        JSONObject jsonTodasLasCalles = null;
        try
        {
            Conexion conexion = new Conexion();
            PreparedStatement preparedStatement = conexion.conectar().prepareStatement("SELECT * FROM calle");
            
            ResultSet resultado = preparedStatement.executeQuery();
            if(resultado != null){
                arrayJSONCalles = new JSONArray();
                //System.out.println("NO esta vacio de modelo");
                
                jsonTodasLasCalles = new JSONObject();
                while (resultado.next()){
                    jsonCalles = new JSONObject();
                    jsonCalles.put("idcalle", resultado.getString("IDCALLE"));
                    jsonCalles.put("nombrecalle", resultado.getString("NOMBRECALLE"));
                    jsonCalles.put("idpkestado", resultado.getString("ESTADO_IDESTADO"));
                    jsonCalles.put("idpkmunicipio", resultado.getString("MUNICIPIO_IDMUNICIPIO"));
                    
                    arrayJSONCalles.put(jsonCalles);
                    jsonCalles = null;
                    /**
                    jsonTodasLasCalles.put("calle" + i, jsonCalles);
                    jsonCalles = null;
                    ++i;
                    * */
                }                
            }
            
              
              resultado.close();
              preparedStatement.close();
              conexion.conectar().close();
           }
           catch (SQLException e)
           {
              e.printStackTrace();
           }
        return arrayJSONCalles;
        //return jsonTodasLasCalles;
        
    }
    
    public Map<String, String> queryCalleEspecifica(int idDeCalle){
        Map<String, String> dataCalle = null;

        try
        {
            Conexion conexion = new Conexion();
            PreparedStatement preparedStatement = conexion.conectar().prepareStatement("SELECT * FROM calle WHERE IDCALLE=?");
            preparedStatement.setInt(1, idDeCalle);
            ResultSet resultado = preparedStatement.executeQuery();
            if(resultado != null && resultado.first()){
                dataCalle = new HashMap<String, String>();
                System.out.println("NO esta vacio de modelo");
                
                dataCalle.put("idcalle", resultado.getString("IDCALLE"));
                dataCalle.put("nombrecalle", resultado.getString("NOMBRECALLE"));
                dataCalle.put("nombreusuario", resultado.getString("ESTADO_IDESTADO"));
                dataCalle.put("correo", resultado.getString("MUNICIPIO_IDMUNICIPIO"));
            }
            
              
              resultado.close();
              preparedStatement.close();
              conexion.conectar().close();
           }
           catch (SQLException e)
           {
              e.printStackTrace();
           }
           return dataCalle;
        
    }
    
}
