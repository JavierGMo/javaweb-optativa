/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
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
    private String nombre, apellidos, nombreUsuario, correo, refImagen, tipo, contrasenia, calle, municipio, estado;
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
        
    }
    public void crearUsuarios(){
        
    }
    public void actualizarUsuario(){
        
    }
    public void borrarUsuario(){
        
    }
    
}
