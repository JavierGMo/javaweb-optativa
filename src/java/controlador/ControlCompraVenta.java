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
 * @author Javier GMo
 */
//Mediante este servlet puedo controlar que se puede mostrar si productos comprados o vendidos.
//controldeproductos
@WebServlet("/controldeproductos")
public class ControlCompraVenta extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        
        
        res.setContentType("application/json;charset=utf-8");
        Producto productosComprados = new Producto();
        
        String dataDelAjax = req.getParameter("opciondeproductos");
        int idusuario = Integer.parseInt(req.getParameter("idusuario"));
        JSONArray todoslosProductos = productosComprados.mostrarProductosComprados(idusuario);
        JSONArray listaParaPaginar = new JSONArray();
        //System.out.println(filtrarPorID(productosComprados, ""+((JSONObject)todoslosProductos.get(i)).get("idpkproducto")).get("nombreproducto"));
        for(int i=0; i < todoslosProductos.length(); ++i) listaParaPaginar.put(filtrarPorID(productosComprados, ""+((JSONObject)todoslosProductos.get(i)).get("idpkproducto")));
        
        System.out.println(dataDelAjax);
        PrintWriter pw = res.getWriter();
        pw.print(listaParaPaginar);
        todoslosProductos = null;
        listaParaPaginar = null;
        pw.close();
    }
    private JSONObject filtrarPorID(Producto producto,String id){
        return producto.productoEspecifico(id);
    }
}
