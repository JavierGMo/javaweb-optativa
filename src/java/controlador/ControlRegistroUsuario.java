/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Usuario;

/**
 *
 * @author m01
 */
@WebServlet("/registro")
public class ControlRegistroUsuario extends HttpServlet{
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        req.setAttribute("titulo", "Registro");
        
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("vista/sesion/signup.jsp");
        requestDispatcher.forward(req, res);
        
    }
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
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
        Usuario nuevoUsuario = new Usuario(
                nombreCompletoUsuario,
                apellidoCompletoUsuario,
                nombreDeUsuarioRegistro,
                correoRegistro,
                "dasd",
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
                        
                RequestDispatcher requestDispatcher = req.getRequestDispatcher("vista/sesion/login.jsp");
                requestDispatcher.forward(req, res);
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
    
}
