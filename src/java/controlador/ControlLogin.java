/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Map;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import modelo.Usuario;

/**
 *
 * @author m01
 */
@WebServlet("/login")

public class ControlLogin extends HttpServlet{
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        //if(req.getSession().getAttribute("sesioniniciada") != null && req.getSession().getAttribute("usuario") != null) res.sendRedirect(req.getContextPath()+ "/");
        req.setAttribute("titulo", "Iniciar sesion");
        
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("vista/sesion/login.jsp");
        requestDispatcher.forward(req, res);
    }
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        //Me hace falta el ajax con jsp
        String correoLogin = req.getParameter("correo-login");
        String passwordLogin = req.getParameter("password-login");
        Usuario usuario = new Usuario();
        boolean sesionIniciada = false;
        String paginaRedireccion = "/login";
        HttpSession sesion = req.getSession();
        Map<String, String> resultadoUsuario = usuario.traerUsuario(correoLogin, passwordLogin);
        if(resultadoUsuario != null){
            if(!resultadoUsuario.isEmpty()){
                //Con esta variable verifico si el usuario existe y puede iniciar sesion. Por defecto esta en false
                sesionIniciada = true;
                //Con esta variable si el usuario existe lo redirecciono al index sino se queda en el login
                paginaRedireccion = "/";
                sesion.setMaxInactiveInterval(60*10);
                sesion.setAttribute("usuario", resultadoUsuario);
            }
        }
        sesion.setAttribute("sesioniniciada", sesionIniciada);
        res.sendRedirect(req.getContextPath()+ paginaRedireccion);
        
    }
    
}
