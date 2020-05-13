/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Calle;
import modelo.Estado;
import modelo.Municipio;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 *
 * @author m01
 */
@WebServlet("/datavivienda")
@MultipartConfig
public class ControlDataFormularios extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        
        //Direccion default
        res.setContentType("application/json;charset=utf-8");
        Calle calles = new Calle();
        Estado estados = new Estado();
        Municipio municipios = new Municipio();
        //Data en JSONArray
        JSONArray todasLasCalles = calles.queryTodasLasCalles();
        JSONArray todosLosEstados = estados.queryEstados();
        JSONArray todosLosMunicipios = municipios.queryTodosLosMunicipios();
        
        PrintWriter pw = res.getWriter();
        if(todasLasCalles != null && todosLosEstados != null && todosLosMunicipios != null){
            JSONObject dataVivienda = new JSONObject();
            dataVivienda.put("calles", todasLasCalles);
            dataVivienda.put("estados", todosLosEstados);
            dataVivienda.put("municipios", todosLosMunicipios);
            pw.print(dataVivienda);
            //System.out.println(todasLasCalles.toString());
            //pw.print(todasLasCalles);
        }else{
            System.out.println(todasLasCalles.toString());
            pw.print(new JSONObject().put("data", "no"));
        }
        
        pw.close();
    }
    
}
