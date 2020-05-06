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
import java.sql.Statement;
import java.util.LinkedList;

/*
            nombre
            apellido
            nombreusuario
            correo
            refimagen
            tipo
            contrasenia
            productos vendidos
            productos comprados
            calle
            municipio
            estado
*/
/**
 *
 * @author m01
 */
public class Usuario {
    private String id, nombre, apellidos, nombreUsuario, correo, refImagen, tipo, contrasenia, calle, municipio, estado;
    private int productosVendidos, productosComprados;
    
    public Usuario(){
        
    }
    public Usuario(String nombre, String apellidos, String nombreUsuario, String correo, String refImagen, String tipo, String contrasenia, String calle, String municipio, String estado, int productosVendidos, int productosComprados) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nombreUsuario = nombreUsuario;
        this.correo = correo;
        this.refImagen = refImagen;
        this.tipo = tipo;
        this.contrasenia = contrasenia;
        this.calle = calle;
        this.municipio = municipio;
        this.estado = estado;
        this.productosVendidos = productosVendidos;
        this.productosComprados = productosComprados;
    }
    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getRefImagen() {
        return refImagen;
    }

    public void setRefImagen(String refImagen) {
        this.refImagen = refImagen;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getProductosVendidos() {
        return productosVendidos;
    }

    public void setProductosVendidos(int productosVendidos) {
        this.productosVendidos = productosVendidos;
    }

    public int getProductosComprados() {
        return productosComprados;
    }

    public void setProductosComprados(int productosComprados) {
        this.productosComprados = productosComprados;
    }
    public void leerUsuarios(){
        LinkedList<Usuario> listaUsuarios=new LinkedList<Usuario>();
        try
        {
              Conexion conexion = new Conexion();
              Statement st = conexion.conectar().createStatement();
              ResultSet rs = st.executeQuery("select * from Usuario" );
              while (rs.next())
              {
                 Usuario usuario = new Usuario();
                 /*Usuario.setId(rs.getInt("id"));
                 Usuario.setNombre(rs.getString("nombre"));
                 Usuario.setApellido(rs.getString("apellidos"));
                 Usuario.setTelefono(rs.getString("telefono"));*/
                 listaUsuarios.add(usuario);
              }
              rs.close();
              st.close();
              conexion.conectar().close();
           }
           catch (Exception e)
           {
              e.printStackTrace();
           }
           //return listaContactos;   
    }
    public LinkedList<String> traerUsuario(String correo, String password){
        LinkedList<String> usuario = new LinkedList<>();
        int i = 0;
        try
        {
            Conexion conexion = new Conexion();
            PreparedStatement preparedStatement = conexion.conectar().prepareStatement("SELECT * FROM usuario WHERE CORREO=? AND CONTRASENIA = ?");
            preparedStatement.setString(1, correo);
            preparedStatement.setString(2, password);
            ResultSet resultado = preparedStatement.executeQuery();
              
            while (resultado.next()){
                usuario.add(resultado.getString(i));
                ++i;
              }
              
              resultado.close();
              preparedStatement.close();
              conexion.conectar().close();
           }
           catch (SQLException e)
           {
              e.printStackTrace();
           }
           return usuario;
    }
    public void crearUsuarios(){
        
    }
    public void actualizarUsuario(){
        
    }
    public void borrarUsuario(){
        
    }
    
}
