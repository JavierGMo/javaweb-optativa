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
@WebServlet("/eliminarcuenta")
public class ControlEliminarCuenta extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        res.setContentType("application/json;charset=utf-8");
        int ok = 0;
        int idUser = req.getSession().getAttribute("usuario")!=null?Integer.parseInt(((Map<String, String>)req.getSession().getAttribute("usuario")).get("idusuario")):0;
        String password = req.getParameter("password");
        PrintWriter pw = res.getWriter();
        try{
            if(password!=null&&idUser!=0){
                Usuario borrarCuenta = new Usuario();
                if(borrarCuenta.eliminarCuenta(idUser, password)){
                    pw.close();
                    System.out.println("_,.-----.,_\n" +
                            ",-~...............~-.\n" +
                            ",^___...............___^.\n" +
                            "/~\"...~\"...........\"~...\"~\\\n" +
                            "Y..,--._......I......_.--...Y\n" +
                            "¡.Y........~-...,-~........Y.¡\n" +
                            "¡.¡............}:{............¡.¡\n" +
                            "j.l............/..\\............!.l\n" +
                            ".-~(__,..--\"..^..\"--..,__)~-.\n" +
                            "(............././..\\.\\.............)\n" +
                            "\\.____..~..\\/\"\\/..~..____,/\n" +
                            "^.____...............____.^\n" +
                            "¡.¡T.~\\..!.....!../~.T¡.¡\n" +
                            "¡.¡¡..._._._._._._...¡¡.¡\n" +
                            "¡.¡...\\/LLLLLLLL\\/...¡.¡\n" +
                            "\\..\\....\\ADIOS/..../../\n" +
                            "\\..\\..LLLLLL../../\n" +
                            "\\.'^^^^^^^'./\n" +
                            "\\.............../\n" +
                            "\\............/");
                    req.getSession().removeAttribute("usuario");
                    req.getSession().invalidate();
                    res.sendRedirect(req.getContextPath()+"");
                    
                }else{
                    pw.print(new JSONObject().put("ok", ok));
                    pw.close();
                }
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}
