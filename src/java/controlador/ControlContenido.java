/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.IOException;
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
@WebServlet("/controlusuario")

public class ControlContenido extends HttpServlet{
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        Map<String, String> dataUsuario = (Map<String, String>) req.getSession().getAttribute("usuario");
        
        req.setAttribute("titulo", "Panel de " + dataUsuario.get("nombre").toUpperCase());
        
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("vista/admin/admin-contenido.jsp");
        requestDispatcher.forward(req, res);
    }
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        
    }
}
