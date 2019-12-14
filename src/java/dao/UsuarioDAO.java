package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Usuario;

public class UsuarioDAO extends dao{
    
    public void registrar(Usuario valor_usuario) throws SQLException
    {
        try {
            this.Conectar();
            PreparedStatement pst;
            pst = this.getCn().prepareStatement("INSERT INTO Usuario(nombre,carrera_prof) VALUES(?,?)");
            pst.setString(1,valor_usuario.getNombre());
            pst.setString(2,valor_usuario.getCarrera_prof());
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally
        {
            this.Cerrar();
        }
    }
    
    
    public List<Usuario> listar() throws SQLException
    {
        List<Usuario> lista = null;
        ResultSet rs;

        try {
            this.Conectar();
            PreparedStatement pst = this.getCn().prepareCall("SELECT codigo,nombre,carrera_prof FROM usuario");
            rs = pst.executeQuery();
            lista = new ArrayList();
            while (rs.next())
            {
                Usuario usu = new Usuario();
                usu.setCodigo(rs.getInt("codigo"));
                usu.setNombre(rs.getString("nombre"));
                usu.setCarrera_prof(rs.getString("carrera_prof"));
                lista.add(usu);            
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }      
        finally
        {
            this.Cerrar();
        }        
        return lista;
    }
    
    public Usuario leeID(Usuario usu) throws SQLException
    {
          Usuario usuario = null;
            ResultSet rs;
        try {
          
            
            this.Conectar();
            PreparedStatement pst = this.getCn().prepareStatement("SELECT codigo,nombre,carrera_prof FROM Usuario where codigo = ?");
            pst.setInt(1,usu.getCodigo());
            rs = pst.executeQuery();
            
            while (rs.next())
            {
                usuario = new Usuario();
                usuario.setCodigo(rs.getInt("codigo"));
                usuario.setNombre(rs.getString("nombre"));
                usuario.setCarrera_prof(rs.getString("carrera_prof"));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally
        {
            this.Cerrar();
        }        
        return usuario;                
    }
    
    public void modificar(Usuario datos_usuario) throws SQLException
    {
        try {
            this.Conectar();
            PreparedStatement pst;
            pst = this.getCn().prepareStatement("UPDATE usuario SET nombre = ?,carrera_prof = ? WHERE codigo = ?");
            pst.setString(1,datos_usuario.getNombre());
            pst.setString(2,datos_usuario.getCarrera_prof());
            pst.setInt(3,datos_usuario.getCodigo());
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally
        {
            this.Cerrar();
        }      
        
    }
    
     public void eliminar(Usuario datos_usuario) throws SQLException
    {
        try {
            this.Conectar();
            PreparedStatement pst;
            pst = this.getCn().prepareStatement("DELETE FROM usuario WHERE codigo = ?");
            pst.setInt(1,datos_usuario.getCodigo());
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally
        {
            this.Cerrar();
        }      
        
    }
}
