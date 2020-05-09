/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 *
 * @author m01
 */

@WebServlet("/logout")

public class ControlLogout extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        
        req.getSession().removeAttribute("usuario");
        req.getSession().removeAttribute("sesioniniciada");
        req.getSession().invalidate();
        
        res.sendRedirect(req.getContextPath()+"/login");
        
    }    
}
