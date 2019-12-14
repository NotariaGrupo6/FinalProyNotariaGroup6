package model;

import controlador.tb_persona;
import entidad.Tb_beneficiario;
import entidad.Tb_persona;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import miConexion.mysqlDbConection;

public class ModelTb_persona {
    
    public int insertaPersona(Tb_persona obj) {
        int salida = -1;
        try {            
            PreparedStatement pstm;
            Connection conn;
            conn = mysqlDbConection.getonexion();
            String sql = "insert into tb_persona values (null, ?, ?, ?, ?, ?, ?, NULL, NULL, NULL, NULL, NULL)";
            pstm = conn.prepareStatement(sql);
            
            pstm.setInt(1, obj.getTB_P_TDOC_ID());
            pstm.setString(2, obj.getPER_DNI());
            pstm.setString(3, obj.getPER_NOMBRE());
            pstm.setString(4, obj.getPER_APEPAT());
            pstm.setString(5, obj.getPER_APEMAT());            
            pstm.setDate(6, obj.getPER_FNAC());
            
            salida = pstm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ModelTb_persona.class.getName()).log(Level.SEVERE, null, ex);
        }
        return salida;
    }
    
    public ArrayList<Tb_persona>listaPersona() {
        
        ArrayList<Tb_persona> data = new ArrayList<>();
        
        try {                       
            PreparedStatement pstm;
            Connection conn;
            conn = mysqlDbConection.getonexion();
            ResultSet rs;
            String sql = "SELECT a.*, b.PARAM_NOMBRE " +
                            "FROM tb_persona a " +
                            "inner join tb_p_tdoc b on a.TB_P_TDOC_ID=b.TB_P_TDOC_ID " +
                            "order by a.tb_persona_id desc";
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            
            Tb_persona obj;
            while(rs.next()) {
                obj = new Tb_persona();
                obj.setTB_PERSONA_ID(rs.getInt("TB_PERSONA_ID"));
                obj.setTB_P_TDOC_ID(rs.getInt("TB_P_TDOC_ID"));
                obj.setPER_DNI(rs.getString("PER_DNI"));
                obj.setPER_NOMBRE(rs.getString("PER_NOMBRE"));
                obj.setPARAM_NOMBRE(rs.getString("PARAM_NOMBRE"));
                obj.setPER_APEMAT(rs.getString("PER_APEMAT"));
                obj.setPER_APEPAT(rs.getString("PER_APEPAT"));
                obj.setPER_FNAC(rs.getDate("PER_FNAC"));
                obj.setTRA_FECH(rs.getDate("TRA_FECH"));
                obj.setTRA_REG(rs.getDate("TRA_REG"));
                obj.setTRA_DESCRIP(rs.getString("TRA_DESCRIP"));
                data.add(obj);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ModelTb_persona.class.getName()).log(Level.SEVERE, null, ex);
        }
        return data;
    }
    
    public ArrayList<Tb_beneficiario>listaBeneficiario() {
        
        ArrayList<Tb_beneficiario> data = new ArrayList<>();
        
        try {                       
            PreparedStatement pstm;
            Connection conn;
            conn = mysqlDbConection.getonexion();
            ResultSet rs;
            String sql = "SELECT " +
                    "a.TB_PERSONA_ID, " +
                    "d.PARAM_NOMBRE, " +
                    "a.PER_APEPAT, " +
                    "a.PER_APEMAT, " +
                    "a.PER_NOMBRE, " +
                    "a.PER_DNI " +
                    "FROM tb_beneficiario a " +
                    "INNER JOIN tb_persona c ON a.TB_PERSONA_ID=c.TB_PERSONA_ID " +
                    "INNER JOIN tb_p_tdoc d ON c.TB_P_TDOC_ID=d.TB_P_TDOC_ID";
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            
            Tb_beneficiario obj;
            while(rs.next()) {
                obj = new Tb_beneficiario();
                obj.setTB_PERSONA_ID(rs.getInt("TB_PERSONA_ID"));
                obj.setPER_DNI(rs.getString("PER_DNI"));
                obj.setPER_NOMBRE(rs.getString("PER_NOMBRE"));
                obj.setPER_APEMAT(rs.getString("PER_APEMAT"));
                obj.setPER_APEPAT(rs.getString("PER_APEPAT"));
                obj.setPER_FNAC(rs.getDate("PER_FNAC"));
                data.add(obj);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ModelTb_persona.class.getName()).log(Level.SEVERE, null, ex);
        }
        return data;
    }
    

public int actualizaPersona(Tb_persona obj) {

    int salida = -1;
        try {            
            PreparedStatement pstm;
            Connection conn;
            conn = mysqlDbConection.getonexion();
            String sql = "update tb_persona set PER_DNI=?, PER_NOMBRE=?, PER_APEMAT=?, PER_APEPAT=?, PER_FNAC=?, TRA_FECH=?, TRA_REG=?, TRA_DESCRIP=? where TB_PERSONA_ID=?";
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, obj.getPER_DNI());
            pstm.setString(2, obj.getPER_NOMBRE());
            pstm.setString(3, obj.getPER_APEMAT());
            pstm.setString(4, obj.getPER_APEPAT());
            pstm.setDate(5, obj.getPER_FNAC());
            
            pstm.setDate(6, obj.getTRA_FECH());
            pstm.setDate(7, obj.getTRA_REG());
            pstm.setString(8, obj.getTRA_DESCRIP());
            
            pstm.setInt(9, obj.getTB_PERSONA_ID());
            
            salida = pstm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ModelTb_persona.class.getName()).log(Level.SEVERE, null, ex);
        }
        return salida;
    }

public Tb_persona buscaPersona(int TB_PERSONA_ID) {

    Tb_persona obj=null;
        try {            
            PreparedStatement pstm;
            Connection conn;
            ResultSet rs;
            
            conn = mysqlDbConection.getonexion();
            String sql = "select * from tb_persona where TB_PERSONA_ID=?";
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, TB_PERSONA_ID);
            
            rs = pstm.executeQuery();
            
            if(rs.next())  {
                obj = new Tb_persona();
                obj.setTB_PERSONA_ID(rs.getInt("TB_PERSONA_ID"));
                obj.setTB_P_TDOC_ID(rs.getInt("TB_P_TDOC_ID"));
                obj.setPER_DNI(rs.getString("PER_DNI"));
                obj.setPER_APEPAT(rs.getString("PER_APEPAT"));
                obj.setPER_APEMAT(rs.getString("PER_APEMAT"));
                obj.setPER_NOMBRE(rs.getString("PER_NOMBRE"));   
                obj.setPER_FNAC(rs.getDate("PER_FNAC"));  
                obj.setTRA_FECH(rs.getDate("TRA_FECH"));
                obj.setTRA_REG(rs.getDate("TRA_REG"));
                obj.setTRA_DESCRIP(rs.getString("TRA_DESCRIP"));
            }            
        } catch (SQLException ex) {
            Logger.getLogger(ModelTb_persona.class.getName()).log(Level.SEVERE, null, ex);
        }
        return obj;
    }

public int eliminarPersona(int TB_PERSONA_ID) {

    int salida = -1;
        try {            
            PreparedStatement pstm;
            Connection conn;
            conn = mysqlDbConection.getonexion();
            String sql = "delete from tb_persona where TB_PERSONA_ID=?";
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, TB_PERSONA_ID);            
            salida = pstm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ModelTb_persona.class.getName()).log(Level.SEVERE, null, ex);
        }
        return salida;
    }
}