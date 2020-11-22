/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author bryan
 */
public class VendedorDAO {
    Connection acceso;
    Conexion con= new Conexion();
    
    PreparedStatement ps;
    ResultSet rs;
    Vendedor co = new Vendedor();
    
    public List listar() {
        List<Vendedor> lista = new ArrayList<>();
        String sql="select * from Vendedor";
        try {
            acceso=con.Conectar();
            ps=acceso.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()) {
                Vendedor v= new Vendedor();
                v.setId(rs.getInt(1));
                v.setDni(rs.getString(2));
                v.setNom(rs.getString(3));
                v.setTel(rs.getString(4));
                v.setEstado(rs.getString(5));
                v.setUser(rs.getString(6));
                lista.add(v);
            }
        } catch (Exception e) {
        }
        return lista;
    }
    
    public int add(Object[] o) {
        int r=0;
        String sql="insert into vendedor(Dni,Nombres,Telefono,Estado,User) values(?,?,?,?,?)";
        try {
            acceso=con.Conectar();
            ps=acceso.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            ps.setObject(5, o[4]);
            r =ps.executeUpdate();
        } catch (Exception e) {
        }
        return r;
    }
    
    public int actualizar(Object[] o) {
        int r=0;
        String sql="update vendedor set Dni=?, Nombres=?,Telefono=?,Estado=?,User=? where IdVendedor=?";
        try {
            acceso=con.Conectar();
            ps=acceso.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            ps.setObject(5, o[4]);
            ps.setObject(6, o[5]);
            r = ps.executeUpdate();
        } catch (Exception e) {
        }
        return r;
    }
    
    public void eliminar(int id) {
        String sql="delete from vendedor where IdVendedor=?";
        try {
            acceso=con.Conectar();
            ps=acceso.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    
    public EntidadVendedor ValidarVendedor(String dni, String user){
        EntidadVendedor ev= new EntidadVendedor();
        String sql="select * from vendedor where Dni=? and User=?";
        try {
            acceso=con.Conectar();
            ps=acceso.prepareStatement(sql);
            ps.setString(1, dni);
            ps.setString(2, user);
            rs=ps.executeQuery();
            while (rs.next()) {
                ev.setId(rs.getInt(1));
                ev.setDni(rs.getString(2));
                ev.setNom(rs.getString(3));
                ev.setTel(rs.getString(4));
                ev.setEstado(rs.getString(5));
                ev.setUser(rs.getString(6));
            }
        } catch (Exception e) {
        }    
        return ev;
    }
}
