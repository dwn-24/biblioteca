
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class LibroDAO {
    PreparedStatement ps;
    ResultSet rs;
    Conexion c =new Conexion();
    Connection con;
    
    public  List listar(){
        List<Libro>lista=new ArrayList<>();
        String sql="select * from libro order by codigo_libro";
        
        try {
            con=c.conectar();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Libro p=new Libro();
                p.setCODIGO_LIBRO(rs.getInt(1));
                p.setTITULO_LIBRO(rs.getString(2));
                p.setEDITORIAL_LIBRO(rs.getString(3));
                p.setANIO_ESCRITO(rs.getInt(4));
                p.setANIO_EDICION(rs.getInt(5));
                p.setISBN(rs.getInt(6));
                lista.add(p);
            }
            
        } catch (Exception e) {
        }
        return lista;
    }
    
    public int agregar(Libro p){
        int r=0;
        String sql="insert into libro(codigo_libro, titulo_libro, editorial_libro, anio_escrito, anio_edicion, isbn) values(?,?,?,?,?,?)";
        try {
            con=c.conectar();
            ps=con.prepareStatement(sql);
            ps.setInt(1, p.getCODIGO_LIBRO());
            ps.setString(2, p.getTITULO_LIBRO());
            ps.setString(3, p.getEDITORIAL_LIBRO());
            ps.setInt(4, p.getANIO_ESCRITO());
            ps.setInt(5, p.getANIO_EDICION());
            ps.setInt(6, p.getISBN());
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
    
    
    public Libro listarId(String id){
    String sql="select * from libro where codigo_libro="+id;
    Libro p=new Libro();
    try {
            con=c.conectar();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                p.setCODIGO_LIBRO(rs.getInt(1));
                p.setTITULO_LIBRO(rs.getString(2));
                p.setEDITORIAL_LIBRO(rs.getString(3));
                p.setANIO_ESCRITO(rs.getInt(4));
                p.setANIO_EDICION(rs.getInt(5));
                p.setISBN(rs.getInt(6));
            }
        } catch (Exception e) {
        }
    return p;
    }
    
    public int actualizar (Libro p){
        int r=0;
        String sql="update libro set titulo_libro=?, editorial_libro=?, anio_escrito=?, anio_edicion=?, isbn=? where codigo_libro=?";
        try {
            con=c.conectar();
            ps=con.prepareStatement(sql);
            ps.setString(1,p.getTITULO_LIBRO());
            ps.setString(2,p.getEDITORIAL_LIBRO());
            ps.setInt(3,p.getANIO_ESCRITO());
            ps.setInt(4,p.getANIO_EDICION());
            ps.setInt(5,p.getISBN());
            ps.setInt(6,p.getCODIGO_LIBRO());
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
     String sql="delete from libro where codigo_libro="+id;
        try {
            con=c.conectar();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
            
        } catch (Exception e) {
        }
                
    }
    
    
}
