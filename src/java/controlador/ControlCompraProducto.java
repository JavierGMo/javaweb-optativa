/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Producto;
import org.json.JSONObject;

/**
 *
 * @author m01
 */
@WebServlet("/compraproductojs")
public class ControlCompraProducto extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        
    }
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        String idUsuario = req.getParameter("idusuario");
        String idProducto = req.getParameter("idproducto");
        String piezasFinalesStock = req.getParameter("cantidadtotaldeproductos");
        String piezasCompradas = req.getParameter("piezascompradas");
        Producto producto = new Producto();
        boolean consultaCorrecta = producto.compraProducto(
                idUsuario,
                idProducto,
                piezasCompradas,
                piezasFinalesStock
            );
        PrintWriter pw = res.getWriter();
        if(consultaCorrecta){
            System.out.println("Exito en la consulta");
            pw.print(new JSONObject().put("ok", 1));
        }else{
            System.out.println("Hubo un error");
            pw.print(new JSONObject().put("ok", 0));
        }
        pw.close();
    }
    
}
