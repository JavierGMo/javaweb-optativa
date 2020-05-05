/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author m01
 */
public class Conexion {
    Connection conectar = null;
    String SERVIDOR = "jdbc:mysql://localhost/carritocompras";
    String USUARIO = "root";
    String CONTRASENIA = "";
    public Connection conectar(){
        Connection conectar = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conectar = (Connection)DriverManager.getConnection(SERVIDOR, USUARIO, CONTRASENIA);
        }catch(ClassNotFoundException eClass){
            eClass.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            return conectar;
        }
    }
    
}
