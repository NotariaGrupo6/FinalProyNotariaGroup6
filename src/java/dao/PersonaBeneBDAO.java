package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.PersonaBBene;
//import modelo.Usuario;

public class PersonaBeneBDAO extends dao{
    
//    public void registrar(Usuario valor_usuario) throws SQLException
//    {
//        try {
//            this.Conectar();
//            PreparedStatement pst;
//            pst = this.getCn().prepareStatement("INSERT INTO Usuario(nombre,carrera_prof) VALUES(?,?)");
//            pst.setString(1,valor_usuario.getNombre());
//            pst.setString(2,valor_usuario.getCarrera_prof());
//            pst.executeUpdate();
//        } catch (SQLException ex) {
//            Logger.getLogger(PersonaBeneDAO.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        finally
//        {
//            this.Cerrar();
//        }
//    }
    
    
    public List<PersonaBBene> listar() throws SQLException
    {
        List<PersonaBBene> lista = null;
        ResultSet rs;

        try {
            this.Conectar();
            PreparedStatement pst = this.getCn().prepareCall(
            "SELECT a.TB_PERSONA_ID, a.PER_DNI PER_DNI_T, a.PER_APEPAT PER_APEPAT_T, a.PER_APEMAT PER_APEMAT_T, a.PER_NOMBRE PER_NOMBRE_T, a.TRA_DESCRIP TRA_DESCRIP_T, a.TRA_REG, b.TB_BENEFICIARIO_ID, b.BENEFICIARIO_ID, b.PER_DNI PER_DNI_D, b.PER_APEPAT PER_APEPAT_D, b.PER_APEMAT PER_APEMAT_D, b.PER_NOMBRE PER_NOMBRE_D FROM tb_persona a inner join tb_beneficiario b on a.TB_PERSONA_ID=b.TB_PERSONA_ID where b.BENEFICIARIO_ID='2'");
            rs = pst.executeQuery();
            lista = new ArrayList();
            while (rs.next())
            {
                PersonaBBene usu = new PersonaBBene();
                usu.setTB_PERSONA(rs.getInt("TB_PERSONA_ID"));                
                usu.setPER_APEPAT_T(rs.getString("PER_APEPAT_T"));
                usu.setPER_APEMAT_T(rs.getString("PER_APEMAT_T"));
                usu.setPER_NOMBRE_T(rs.getString("PER_NOMBRE_T"));
                usu.setPER_DNI_T(rs.getString("PER_DNI_T"));
                usu.setTRA_DESCRIP_T(rs.getString("TRA_DESCRIP_T"));                
                usu.setTRA_REG(rs.getDate("TRA_REG"));
                usu.setTB_BENEFICIARIO_ID(rs.getInt("TB_BENEFICIARIO_ID"));
                usu.setBENEFICIARIO_ID(rs.getInt("BENEFICIARIO_ID"));
                usu.setPER_APEPAT_D(rs.getString("PER_APEPAT_D"));
                usu.setPER_APEMAT_D(rs.getString("PER_APEMAT_D"));
                usu.setPER_NOMBRE_D(rs.getString("PER_NOMBRE_D"));
                usu.setPER_DNI_D(rs.getString("PER_DNI_D"));               
                lista.add(usu);            
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(PersonaBeneBDAO.class.getName()).log(Level.SEVERE, null, ex);
        }      
        finally
        {
            this.Cerrar();
        }        
        return lista;
    }
    
//    public Usuario leeID(Usuario usu) throws SQLException
//    {
//          Usuario usuario = null;
//            ResultSet rs;
//        try {
//          
//            
//            this.Conectar();
//            PreparedStatement pst = this.getCn().prepareStatement("SELECT codigo,nombre,carrera_prof FROM Usuario where codigo = ?");
//            pst.setInt(1,usu.getCodigo());
//            rs = pst.executeQuery();
//            
//            while (rs.next())
//            {
//                usuario = new Usuario();
//                usuario.setCodigo(rs.getInt("codigo"));
//                usuario.setNombre(rs.getString("nombre"));
//                usuario.setCarrera_prof(rs.getString("carrera_prof"));
//            }
//            
//        } catch (SQLException ex) {
//            Logger.getLogger(PersonaBeneDAO.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        finally
//        {
//            this.Cerrar();
//        }        
//        return usuario;                
//    }
//    
//    public void modificar(Usuario datos_usuario) throws SQLException
//    {
//        try {
//            this.Conectar();
//            PreparedStatement pst;
//            pst = this.getCn().prepareStatement("UPDATE usuario SET nombre = ?,carrera_prof = ? WHERE codigo = ?");
//            pst.setString(1,datos_usuario.getNombre());
//            pst.setString(2,datos_usuario.getCarrera_prof());
//            pst.setInt(3,datos_usuario.getCodigo());
//            pst.executeUpdate();
//        } catch (SQLException ex) {
//            Logger.getLogger(PersonaBeneDAO.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        finally
//        {
//            this.Cerrar();
//        }      
//        
//    }
//    
//     public void eliminar(Usuario datos_usuario) throws SQLException
//    {
//        try {
//            this.Conectar();
//            PreparedStatement pst;
//            pst = this.getCn().prepareStatement("DELETE FROM usuario WHERE codigo = ?");
//            pst.setInt(1,datos_usuario.getCodigo());
//            pst.executeUpdate();
//        } catch (SQLException ex) {
//            Logger.getLogger(PersonaBeneDAO.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        finally
//        {
//            this.Cerrar();
//        }      
//        
//    }
}
