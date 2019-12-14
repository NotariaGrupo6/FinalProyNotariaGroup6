package Bean;

// Añadiendo anotacion JSF

import dao.UsuarioDAO;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;
import modelo.Usuario;

@ManagedBean
@ViewScoped
public class UsuarioBean {
    private Usuario usuario =  new Usuario();
    private List<Usuario> lstUsuarios;

    public List<Usuario> getLstUsuarios() {
        return lstUsuarios;
    }

    public void setLstUsuarios(List<Usuario> lstUsuarios) {
        this.lstUsuarios = lstUsuarios;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }   
    public void registrar()
    { 
        UsuarioDAO dao = new UsuarioDAO();
        try {
           
            dao.registrar(usuario);
            this.listar();
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void listar()
    {
        UsuarioDAO dao = new UsuarioDAO();
        try {
            lstUsuarios = dao.listar();
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioBean.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }
    
    public void leerID(Usuario usu)
    {
        UsuarioDAO dao = new UsuarioDAO();
        Usuario validar;
        try {            
            
            validar  = dao.leeID(usu);
            if(validar != null)
            {
                this.usuario = validar;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioBean.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }
    
    public void modificar()
    {
       UsuarioDAO dao = new UsuarioDAO();
        try {

            dao.modificar(usuario);
            this.listar();
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioBean.class.getName()).log(Level.SEVERE, null, ex);
        }       
        
    }
    
     public void eliminar(Usuario usu)
    {
       UsuarioDAO dao = new UsuarioDAO();
        try {
            dao.eliminar(usu);
            this.listar();
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioBean.class.getName()).log(Level.SEVERE, null, ex);
        }               
    }
}
