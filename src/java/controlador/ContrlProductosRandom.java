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
import org.json.JSONArray;
import org.json.JSONObject;

/**
 *
 * @author m01
 */
@WebServlet("/productosrandom")
public class ContrlProductosRandom extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        
        //Direccion default
        res.setContentType("application/json;charset=utf-8");
        //Data en JSONArray
        
        Producto productosRandom = new Producto();
        JSONArray arrayJSONProductos = productosRandom.leerProductosRandom();
        PrintWriter pw = res.getWriter();
        if(arrayJSONProductos != null){
            JSONObject dataProductosRandom = new JSONObject();
            dataProductosRandom.put("producto", arrayJSONProductos);
            pw.print(dataProductosRandom);
            //System.out.println(todasLasCalles.toString());
            //pw.print(todasLasCalles);
        }else{
            System.out.println();
            pw.print(new JSONObject().put("data", "no"));
        }
        
        pw.close();
    }
    
}
