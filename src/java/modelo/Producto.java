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
import org.json.JSONArray;
import org.json.JSONObject;

/**
 *
 * @author m01
 */
public class Producto {
    private String nombreProducto, descripcion, refImagenProducto, idUsuario, idCategoria, idProveedor;
    private int precio;
    public Producto(){
        
    }
    public Producto(String nombreProducto, String descripcion, String refImagenProducto, String idUsuario, String idCategoria, String idProveedor, int precio) {
        this.nombreProducto = nombreProducto;
        this.descripcion = descripcion;
        this.refImagenProducto = refImagenProducto;
        this.idUsuario = idUsuario;
        this.idCategoria = idCategoria;
        this.idProveedor = idProveedor;
        this.precio = precio;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getRefImagenProducto() {
        return refImagenProducto;
    }

    public void setRefImagenProducto(String refImagenProducto) {
        this.refImagenProducto = refImagenProducto;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(String idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(String idProveedor) {
        this.idProveedor = idProveedor;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    public JSONArray leerProductosRandom(){
        JSONArray arrayJSONProductos = null;
        JSONObject jsonProductos = null;
        try
        {
            Conexion conexion = new Conexion();
            PreparedStatement preparedStatement = conexion.conectar().prepareStatement("SELECT * FROM `producto` ORDER BY rand() LIMIT 3");
            
            ResultSet resultado = preparedStatement.executeQuery();
            if(resultado != null){
                arrayJSONProductos = new JSONArray();
                //System.out.println("NO esta vacio de modelo");
                
                while (resultado.next()){
                    jsonProductos = new JSONObject();
                    
                    jsonProductos.put("idproducto", resultado.getString("ID"));
                    jsonProductos.put("nombreproducto", resultado.getString("NOMBREPRODUCTO"));
                    jsonProductos.put("descripcionproducto", resultado.getString("DESCRIPCION"));
                    jsonProductos.put("numerodepiezas", resultado.getString("NUMERODEPIEZAS"));
                    jsonProductos.put("precio", resultado.getString("PRECIO"));
                    jsonProductos.put("refimagen", resultado.getString("REFIMAGENPRODUCTO"));
                    jsonProductos.put("idpkusuario", resultado.getString("USUARIO_IDUSUARIO"));
                    jsonProductos.put("idpkcategoria", resultado.getString("CATEGORIA_IDCATEGORIA"));
                    jsonProductos.put("idpkproveedor", resultado.getString("PROVEEDOR_ID"));
                    arrayJSONProductos.put(jsonProductos);
                    jsonProductos = null;
                    
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
        return arrayJSONProductos;
    }//Productos para mostrar en el index
    public void leerProductos(){
        
    }
    public JSONObject productoEspecifico(String idProducto){
        JSONObject productoJSON = null;
        int id = idProducto != null || idProducto.equals("") ? Integer.parseInt(idProducto):1;
        try
        {
            Conexion conexion = new Conexion();
            PreparedStatement preparedStatement = conexion.conectar().prepareStatement("SELECT * FROM `producto` WHERE ID=?");
            preparedStatement.setInt(1, id);
            ResultSet resultado = preparedStatement.executeQuery();
           
            if(resultado != null && resultado.first()){
                productoJSON = new JSONObject();


                productoJSON.put("idproducto", resultado.getString("ID"));
                productoJSON.put("nombreproducto", resultado.getString("NOMBREPRODUCTO"));
                productoJSON.put("descripcionproducto", resultado.getString("DESCRIPCION"));
                productoJSON.put("numerodepiezas", resultado.getString("NUMERODEPIEZAS"));
                productoJSON.put("precio", resultado.getString("PRECIO"));
                productoJSON.put("refimagen", resultado.getString("REFIMAGENPRODUCTO"));
                productoJSON.put("idpkusuario", resultado.getString("USUARIO_IDUSUARIO"));
                productoJSON.put("idpkcategoria", resultado.getString("CATEGORIA_IDCATEGORIA"));
                productoJSON.put("idpkproveedor", resultado.getString("PROVEEDOR_ID"));                                        

            }                
              
            resultado.close();
            preparedStatement.close();
            conexion.conectar().close();
        }
        catch (SQLException e)
        {
           e.printStackTrace();
        }
        return productoJSON;
        
    }
    public void crearProducto(){
        /*INSERT INTO `producto` (`ID`, `NOMBREPRODUCTO`, `DESCRIPCION`, `PRECIO`, `REFIMAGENPRODUCTO`, `USUARIO_IDUSUARIO`, `CATEGORIA_IDCATEGORIA`, `PROVEEDOR_ID`) 
        VALUES (NULL, 'tele plana', 'Es una tele plana', '1000', '\\productos\\heroku.png', '23', '3', '1'), 
        (NULL, 'iphone', 'es un iphone', '15000', '\\productos\\heroku.png', '1', '2', '1');*/
    }
    public void actualizarProducto(){
        
    }
    public void borrarProducto(){
        
    }
    public boolean compraProducto(String idUsuario, String idProducto, String cantidadDeProdcutosComprados, String cantidadDeProductoEnStock){
        boolean compraCorrecta = false;
        int idusuario = Integer.parseInt(idUsuario);
        int idproducto = Integer.parseInt(idProducto);
        int cantidadDeProductosInsert = Integer.parseInt(cantidadDeProdcutosComprados);
        int cantidadDeProductosUpdate = Integer.parseInt(cantidadDeProductoEnStock);
        try
        {
            Conexion conexion = new Conexion();
            PreparedStatement preparedStatementProducto = conexion.conectar().prepareStatement("UPDATE producto SET NUMERODEPIEZAS=? WHERE ID=?");
            PreparedStatement preparedStatementCompraDeProducto = conexion.conectar().prepareStatement("INSERT INTO `productocomprado` (`IDPRODUCTOCOMPRADO`, `PIEZASCOMPRADAS`, `USUARIO_ID`, `PRODUCTO_ID`) VALUES (NULL, ?, ?, ?)");
            //Parametros para actualizar el producto
            preparedStatementProducto.setInt(1, cantidadDeProductosUpdate);
            preparedStatementProducto.setInt(2, idproducto);
            //Parametros para insertar un productocomprado
            preparedStatementCompraDeProducto.setInt(1, cantidadDeProductosInsert);
            preparedStatementCompraDeProducto.setInt(2, idusuario);
            preparedStatementCompraDeProducto.setInt(3, idproducto);
            
            
            
            compraCorrecta = (  preparedStatementProducto.executeUpdate() == 1 
                                && preparedStatementCompraDeProducto.executeUpdate() == 1
                            )?true:false;
              
            
            preparedStatementProducto.close();
            preparedStatementCompraDeProducto.close();
            conexion.conectar().close();
        }
        catch (SQLException e)
        {
            compraCorrecta = false;
            e.printStackTrace();
        }
        
        return compraCorrecta;
    }
    
}
