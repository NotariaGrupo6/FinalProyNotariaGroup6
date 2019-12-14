/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import dao.PersonaBeneBDAO;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import modelo.PersonaBBene;
//import modelo.Usuario;

/**
 *
 * @author david
 */


@ManagedBean
@ViewScoped
public class PersonaBeneBBean {
    
    private PersonaBBene personabbene =  new PersonaBBene();
    private List<PersonaBBene> lstPersonaBBene;

    public PersonaBeneBBean(List<PersonaBBene> lstPersonaBBene) {
        this.lstPersonaBBene = lstPersonaBBene;
    }

    public PersonaBeneBBean() {
    }
    
    

    /**
     * @return the personabbene
     */
    public PersonaBBene getPersonabbene() {
        return personabbene;
    }

    /**
     * @param personabbene the personabbene to set
     */
    public void setPersonabbene(PersonaBBene personabbene) {
        this.personabbene = personabbene;
    }

    /**
     * @return the lstPersonaBBene
     */
    public List<PersonaBBene> getLstPersonaBBene() {
        return lstPersonaBBene;
    }

    /**
     * @param lstPersonaBBene the lstPersonaBBene to set
     */
    public void setLstPersonaBBene(List<PersonaBBene> lstPersonaBBene) {
        this.lstPersonaBBene = lstPersonaBBene;
    }

        public void listar()
    {
        PersonaBeneBDAO dao = new PersonaBeneBDAO();
        try {
            lstPersonaBBene = dao.listar();
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioBean.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }
    
}
