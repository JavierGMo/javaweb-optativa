/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Usuario;
import org.json.JSONObject;

/**
 *
 * @author m01
 */
@WebServlet("/cambiopass")
public class ControlCambioPass extends HttpServlet{
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        res.setContentType("application/json;charset=utf-8");
        String contrasenia = req.getParameter("nuevacontrasenia");
        int idUser = req.getSession().getAttribute("usuario")!=null?Integer.parseInt(((Map<String,String>)req.getSession().getAttribute("usuario")).get("idusuario")):0;
        int isOK = 0;
        Usuario cambioC = new Usuario();
        PrintWriter pw = res.getWriter();
        
        try{
            if(contrasenia!=null && idUser != 0){
                if(cambioC.actualizarContrasenia(idUser, contrasenia)){
                    System.out.println("exito");
                    isOK = 1;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ControlCambioPass.class.getName()).log(Level.SEVERE, null, ex);
        }
        pw.print(new JSONObject().put("ok", isOK));
        pw.close();
        
    }
    
}
