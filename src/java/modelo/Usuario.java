/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

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
    private String id, nombre, apellidos, nombreUsuario, correo, refImagen, tipo, contrasenia;
    private int calle, municipio, estado, productosVendidos, productosComprados;
    
    public Usuario(){
        
    }
    public Usuario(String nombre, String apellidos, String nombreUsuario, String correo, String refImagen, String tipo, String contrasenia, int calle, int municipio, int estado, int productosVendidos, int productosComprados) {
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

    public int getCalle() {
        return calle;
    }

    public void setCalle(int calle) {
        this.calle = calle;
    }

    public int getMunicipio() {
        return municipio;
    }

    public void setMunicipio(int municipio) {
        this.municipio = municipio;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
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
        LinkedList<String[]> listaUsuarios=new LinkedList<String[]>();
        try
        {
              Conexion conexion = new Conexion();
              Connection conn = conexion.conectar();
              Statement st = conn.createStatement();
              ResultSet rs = st.executeQuery("select NOMBRE, APELLIDO, NOMBREUSUARIO, CORREO, REFIMAGENPERFIL, TIPO from usuario" );
              while (rs.next())
              {
                 
                 /*Usuario.setId(rs.getInt("id"));
                 Usuario.setNombre(rs.getString("nombre"));
                 Usuario.setApellido(rs.getString("apellidos"));
                 Usuario.setTelefono(rs.getString("telefono"));*/
                 listaUsuarios.add(new String[]{
                 });
              }
              rs.close();
              st.close();
              conn.close();
           }
           catch (Exception e)
           {
              e.printStackTrace();
           }
           //return listaContactos;   
    }
    public Map<String, String> traerUsuario(String correo, String password){
        
        Map<String, String> dataUsuario = null;
        int i = 0;
        try
        {
            Conexion conexion = new Conexion();
            Connection conn = conexion.conectar();
            PreparedStatement preparedStatement = conn.prepareStatement("SELECT * FROM usuario WHERE CORREO=? AND CONTRASENIA = ?");
            preparedStatement.setString(1, correo);
            preparedStatement.setString(2, password);
            ResultSet resultado = preparedStatement.executeQuery();
            if(resultado != null && resultado.first()){
                dataUsuario = new HashMap<String, String>();
                System.out.println("NO esta vacio de modelo");
                
                dataUsuario.put("idusuario", resultado.getString("ID"));
                dataUsuario.put("nombre", resultado.getString("NOMBRE"));
                dataUsuario.put("apellido", resultado.getString("APELLIDO"));
                dataUsuario.put("nombreusuario", resultado.getString("NOMBREUSUARIO"));
                dataUsuario.put("correo", resultado.getString("CORREO"));
                dataUsuario.put("refimagenperfil", resultado.getString("REFIMAGENPERFIL"));
                dataUsuario.put("tipo", resultado.getString("TIPO"));
                dataUsuario.put("password", resultado.getString("CONTRASENIA"));
                dataUsuario.put("totalproductosvendidos", resultado.getString("TOTALPRODUCTOSVENDIDOS"));
                dataUsuario.put("idpkcalle", resultado.getString("CALLE_IDCALLE"));
                dataUsuario.put("idpkmunicipio", resultado.getString("MUNICIPIO_IDMUNICIPIO"));
                dataUsuario.put("idpkestado", resultado.getString("ESTADO_IDESTADO"));
            }
            
              
              resultado.close();
              preparedStatement.close();
              conn.close();
           }
           catch (SQLException e)
           {
              e.printStackTrace();
           }
           return dataUsuario;
    }
    public boolean crearUsuarios() throws SQLException{
        boolean consultaCreada = false;
        Conexion conexion = new Conexion();
        Connection conn = conexion.conectar();
        PreparedStatement preparedStatement = conn.prepareStatement("INSERT INTO `usuario`(`ID`, `NOMBRE`, `APELLIDO`, `NOMBREUSUARIO`, `CORREO`, `REFIMAGENPERFIL`, `TIPO`, `CONTRASENIA`, `TOTALPRODUCTOSVENDIDOS`, `CALLE_IDCALLE`, `MUNICIPIO_IDMUNICIPIO`, `ESTADO_IDESTADO`) VALUES (null, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
        preparedStatement.setString(1, this.nombre);
        preparedStatement.setString(2, this.apellidos);
        preparedStatement.setString(3, this.nombreUsuario);
        preparedStatement.setString(4, this.correo);
        preparedStatement.setString(5, this.refImagen);
        preparedStatement.setString(6, this.tipo);
        preparedStatement.setString(7, this.contrasenia);
        preparedStatement.setInt(8, 0);
        preparedStatement.setInt(9, this.calle);
        preparedStatement.setInt(10, this.municipio);
        preparedStatement.setInt(11, this.estado);
        if(preparedStatement.executeUpdate() == 1){
            consultaCreada = true; 
        }
        preparedStatement.close();
        conn.close();
        return consultaCreada;
        
    }
    public void actualizarUsuario(){
        
    }
    public void borrarUsuario(){
        
    }
    public boolean actualizarContrasenia(int idUser, String nuevaContrasenia) throws SQLException{
        //UPDATE usuario SET NUMERODEPIEZAS=? WHERE ID=?
        boolean ok = false;
        Conexion conexion = new Conexion();
        Connection conn = conexion.conectar();
        PreparedStatement preparedStatement = conn.prepareStatement("UPDATE usuario SET CONTRASENIA=? WHERE ID=?");
        preparedStatement.setString(1, nuevaContrasenia);
        preparedStatement.setInt(2, idUser);
        if(preparedStatement.executeUpdate()==1){
            ok = true;
        }
        preparedStatement.close();
        conn.close();
        return ok;
    }
    public boolean eliminarCuenta(int idUser, String password) throws SQLException{
        boolean isOK = false;
        Connection conexion = new Conexion().conectar();
        PreparedStatement preparedStatement = conexion.prepareStatement("DELETE FROM usuario WHERE ID=? AND CONTRASENIA=?");
        preparedStatement.setInt(1, idUser);
        preparedStatement.setString(2, password);
        if(preparedStatement.executeUpdate() == 1){
            isOK = true;
        }
        preparedStatement.close();
        conexion.close();
        return isOK;
    }
    
}
