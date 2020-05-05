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
    public void leerProductos(){
        
    }
    public void crearProducto(){
        
    }
    public void actualizarProducto(){
        
    }
    public void borrarProducto(){
        
    }
    
}
