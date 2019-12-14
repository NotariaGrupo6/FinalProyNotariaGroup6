/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import dao.PersonaBeneDAO;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import modelo.PersonaBene;
//import modelo.Usuario;

/**
 *
 * @author david
 */


@ManagedBean
@ViewScoped
public class PersonaBeneBean {
    
    private PersonaBene personabene =  new PersonaBene();
    private List<PersonaBene> lstPersonaBene;

    /**
     * @return the personabene
     */
    public PersonaBene getPersonabene() {
        return personabene;
    }

    /**
     * @param personabene the personabene to set
     */
    public void setPersonabene(PersonaBene personabene) {
        this.personabene = personabene;
    }

    /**
     * @return the lstPersonaBene
     */
    public List<PersonaBene> getLstPersonaBene() {
        return lstPersonaBene;
    }

    /**
     * @param lstPersonaBene the lstPersonaBene to set
     */
    public void setLstPersonaBene(List<PersonaBene> lstPersonaBene) {
        this.lstPersonaBene = lstPersonaBene;
    }

    public void listar()
    {
        PersonaBeneDAO dao = new PersonaBeneDAO();
        try {
            lstPersonaBene = dao.listar();
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioBean.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }
    
        public void leerID(PersonaBene usu)
    {
        PersonaBeneDAO dao = new PersonaBeneDAO();
        PersonaBene validar;
        try {     
            validar  = dao.leeID(usu);
            if(validar != null)
            {
                this.personabene = validar;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioBean.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }
        
        public void modificar()
    {
       PersonaBeneDAO dao = new PersonaBeneDAO();
        try {
            dao.modificar(personabene);
            this.listar();
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioBean.class.getName()).log(Level.SEVERE, null, ex);
        }               
    }
        
        public void eliminar(PersonaBene usu)
    {
       PersonaBeneDAO dao = new PersonaBeneDAO();
        try {

            dao.eliminar(usu);
            this.listar();
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioBean.class.getName()).log(Level.SEVERE, null, ex);
        }       
        
    }
    
}
