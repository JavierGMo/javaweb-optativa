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
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import modelo.Usuario;

/**
 *
 * @author m01
 */
public class ControlLogout extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        
        req.getSession().invalidate();
        req.logout();
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("vista/sesion/index.jsp");
        requestDispatcher.forward(req, res);
        
    }
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException{
        

    }

    
}
