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
        req.setAttribute("titulo", "Iniciar sesion");
        
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("vista/sesion/login.jsp");
        requestDispatcher.forward(req, res);
        
    }
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException{
        
        String correoLogin = req.getParameter("correo-login");
        String passwordLogin = req.getParameter("password-login");
        HttpSession inicioSesion = req.getSession();
        Usuario usuario = new Usuario();
        Map<String, String> resultadoUsuario = usuario.traerUsuario(correoLogin, passwordLogin);
        if(resultadoUsuario != null){
            System.out.println("NO esta vacio");
            if(!resultadoUsuario.isEmpty()){
                
                System.out.println("Es distinto de cero");
                System.out.println(resultadoUsuario.get("nombre"));
                HttpSession sesion = req.getSession();
                sesion.setAttribute("usuario", resultadoUsuario);
                req.login(resultadoUsuario.get("correo"), resultadoUsuario.get("password"));
            }else{
                System.out.println("No hay usuarios");
            }
        }else{
            System.out.println("No hay usuarios");
        }
        //LinkedList<String> resultadoUsuario = usuario.traerUsuario(correoLogin, passwordLogin);
        
        //System.out.println( inicioSesion.isNew());
        //req.login(correoLogin, correoLogin);
        //System.out.println(correoLogin+" : "+ passwordLogin);
    }
    
}
