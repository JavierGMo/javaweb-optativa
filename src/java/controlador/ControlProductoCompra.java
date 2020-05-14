/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Producto;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 *
 * @author m01
 */
@WebServlet("/compraproducto")
public class ControlProductoCompra extends HttpServlet{
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        String nombreProducto = req.getParameter("nombrep");

        req.setAttribute("titulo", "Producto | " + nombreProducto);
        
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("vista/producto/producto.jsp");
        requestDispatcher.forward(req, res);
        
        
        
    }
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException{
        
    }
}
