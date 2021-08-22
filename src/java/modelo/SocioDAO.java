
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class SocioDAO {
    
    PreparedStatement ps;
    ResultSet rs;
    Conexion c =new Conexion();
    Connection con;
    
    public  List listar(){
        List<Socio>lista=new ArrayList<>();
        String sql="select * from socio order by codigo_socio";
        
        try {
            con=c.conectar();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Socio p=new Socio();
                p.setCODIGO_SOCIO(rs.getInt(1));
                p.setCEDULA_SOCIO(rs.getString(2));
                p.setUSUARIO_SOCIO(rs.getString(3));
                p.setNOMBRE_SOCIO(rs.getString(4));
                p.setAPELLIDO_SOCIO(rs.getString(5));
                p.setTELEFONO_SOCIO(rs.getString(6));
                lista.add(p);
            }
            
        } catch (Exception e) {
        }
        return lista;
    }
    
    public int agregar(Socio p){
        int r=0;
        String sql="insert into socio(codigo_socio, cedula_socio, usuario_socio, nombre_socio, apellido_socio, telefono_socio) values(?,?,?,?,?,?)";
        try {
            con=c.conectar();
            ps=con.prepareStatement(sql);
            ps.setInt(1, p.getCODIGO_SOCIO());
            ps.setString(2, p.getCEDULA_SOCIO());
            ps.setString(3, p.getUSUARIO_SOCIO());
            ps.setString(4, p.getNOMBRE_SOCIO());
            ps.setString(5, p.getAPELLIDO_SOCIO());
            ps.setString(6, p.getTELEFONO_SOCIO());
            r=ps.executeUpdate();
            if(r==1){
                r=1;
            }else{
                r=0;
            }
        } catch (Exception e) {
        }
        return r;
    }
    
    
    public Socio listarId(String id){
    String sql="select * from socio where codigo_socio="+id;
    Socio p=new Socio();
    try {
            con=c.conectar();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                p.setCODIGO_SOCIO(rs.getInt(1));
                p.setCEDULA_SOCIO(rs.getString(2));
                p.setUSUARIO_SOCIO(rs.getString(3));
                p.setNOMBRE_SOCIO(rs.getString(4));
                p.setAPELLIDO_SOCIO(rs.getString(5));
                p.setTELEFONO_SOCIO(rs.getString(6));
            }
        } catch (Exception e) {
        }
    return p;
    }
    
    public int actualizar (Socio p){
        int r=0;
        String sql="update socio set cedula_socio=?, usuario_socio=?, nombre_socio=?, apellido_socio=?, telefono_socio=? where codigo_socio=?";
        try {
            con=c.conectar();
            ps=con.prepareStatement(sql);
            ps.setString(1,p.getCEDULA_SOCIO());
            ps.setString(2,p.getUSUARIO_SOCIO());
            ps.setString(3,p.getNOMBRE_SOCIO());
            ps.setString(4,p.getAPELLIDO_SOCIO());
            ps.setString(5,p.getTELEFONO_SOCIO());
            ps.setInt(6,p.getCODIGO_SOCIO());
            r=ps.executeUpdate();
            if(r==1){
                r=1;
            }else{
                r=0;
            }
        } catch (Exception e) {
        }
        return r;
    }
    public void eliminar(String id){
     String sql="delete from socio where codigo_socio="+id;
        try {
            con=c.conectar();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
            
        } catch (Exception e) {
        }
                
    }
    
}
