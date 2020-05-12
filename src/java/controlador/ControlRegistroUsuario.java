/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.sql.SQLException;
import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import modelo.Usuario;

/**
 *
 * @author m01
 */

@WebServlet("/registro")
@MultipartConfig

public class ControlRegistroUsuario extends HttpServlet{
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        /*if(req.getSession().getAttribute("usuario") != null ){
            Map<String, String> usuarioAdmin =  (Map<String, String>) req.getSession().getAttribute("usuario");
            if(!usuarioAdmin.get("tipo").equals("admin")){
                res.sendRedirect(req.getContextPath()+ "/");
            }
        if(req.getSession().getAttribute("sesioniniciada") != null && req.getSession().getAttribute("usuario") != null) res.sendRedirect(req.getContextPath()+ "/");
        }*/
        //Direccion default
        
        req.setAttribute("titulo", "Registro");
        
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("vista/sesion/signup.jsp");
        requestDispatcher.forward(req, res);
        if(req.getSession().getAttribute("sesioniniciada") != null && req.getSession().getAttribute("usuario") != null) res.sendRedirect(req.getContextPath()+ "/");
        
    }
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        Part imagenDeUsuario = req.getPart("imagenperfil-registro");
        String nombreArchivo = "notuser.png";//Nombre del archivo por defecto que no tiene imagen
        
        String nombreCompletoUsuario = req.getParameter("nombre-registro");
        String apellidoCompletoUsuario = req.getParameter("apellido-registro");
        String correoRegistro = req.getParameter("correo-registronuevo");
        String tipoDeUsuarioRegistro = req.getParameter("tipousuario-registro");
        String nombreDeUsuarioRegistro = req.getParameter("nombreusuario-registro");
        String estadoUsusario = req.getParameter("estadovivir-registro");
        String calleUsuario = req.getParameter("calle-registro");
        String municipioUsuario = req.getParameter("municipio-registro");
        String passworUsusario = req.getParameter("password-registronuevo");
        String passworConfirmadoUsusario = req.getParameter("passwordconfirmar-registronuevo");
        System.out.println(req.getContextPath());
        /*
            tengo que hacer desde cero el metodo de obtener el nombre del archivo
        
        */        
        
        if(imagenDeUsuario != null){
            nombreArchivo = getSubmittedFileName(imagenDeUsuario); //Nombre del archivo
            
            String path = "/archivos/";//Ruta de todas la imagenes
            //System.out.println(req.getContextPath());
            File carpetaDestino = new File(path);
            carpetaDestino.mkdirs();
            File file = File.createTempFile(req.getSession().getId(), nombreArchivo, carpetaDestino);
            try(InputStream input = imagenDeUsuario.getInputStream()){
                Files.copy(input, file.toPath(), StandardCopyOption.REPLACE_EXISTING);
            }catch(Exception e){
                e.printStackTrace();
            }
            nombreArchivo = file.getPath();
            System.out.println(nombreArchivo);
        }
        
        //Mandamos la data del usuario para que pueda ser procesada por el query
        Usuario nuevoUsuario = new Usuario(
                nombreCompletoUsuario,
                apellidoCompletoUsuario,
                nombreDeUsuarioRegistro,
                correoRegistro,
                nombreArchivo,
                tipoDeUsuarioRegistro,
                passworUsusario,
                estadoUsusario,
                calleUsuario,
                municipioUsuario,
                1,
                1
        );
        
        try {
            if(nuevoUsuario.crearUsuarios()){
                System.out.println("Creado con exito");
                        
                res.sendRedirect(req.getContextPath() + "/login");
                /*RequestDispatcher requestDispatcher = req.getRequestDispatcher("vista/sesion/login.jsp");
                requestDispatcher.forward(req, res);*/
            }else{
                System.out.println("no Creado con exito");
            }
                    
        } catch (SQLException ex) {
            ex.printStackTrace();
            Logger.getLogger(ControlRegistroUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        /**System.out.println(nombreCompletoUsuario + "\n" + apellidoCompletoUsuario 
                + "\n" + correoRegistro + "\n" + tipoDeUsuarioRegistro + "\n" + nombreDeUsuarioRegistro + "\n"
                +  estadoUsusario + "\n" + calleUsuario + "\n" + municipioUsuario + "\n"
                + passworUsusario + "\n" + passworConfirmadoUsusario);*/
    }
    //Se tuvo que hacer manual la obtencion del nombre del archivo
    private static String getSubmittedFileName(Part part) {
        for (String cd : part.getHeader("content-disposition").split(";")) {
            if (cd.trim().startsWith("filename")) {
                String fileName = cd.substring(cd.indexOf('=') + 1).trim().replace("\"", "");
                return fileName.substring(fileName.lastIndexOf('/') + 1).substring(fileName.lastIndexOf('\\') + 1); // MSIE fix.
            }
        }
        return null;
}
    
}
