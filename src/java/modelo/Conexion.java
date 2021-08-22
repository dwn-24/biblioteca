/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author HORUS
 */
public class Conexion {
    Connection con;
   
    public Connection conectar(){
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","darwin","123");
           } catch (Exception e) {
               System.out.println("Error"+e);
        }
        return con;
    
}
}
