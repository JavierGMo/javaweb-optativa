/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

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
    
    public void queryNombresMunicipios(){
        
    }
    
    public void queryMunicipioEspecifico(int idDeMunicipio){
        
    }
    
}
