/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 *
 * @author m01
 */
@WebServlet("")
public class index extends HttpServlet{
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        req.setAttribute("titulo", "Inicio");

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("index.jsp");
        requestDispatcher.forward(req, res);
        
    }
    
}
