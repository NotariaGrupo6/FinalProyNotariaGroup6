/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import java.sql.Date;

/**
 *
 * @author david
 */
public class Tb_beneficiario {
    
   
   private int TB_PERSONA_ID;
    private int TB_BENEFICIARIO_ID;
    private int BENEFICIARIO_ID;
    private String PER_DNI;
    private String PER_APEMAT;
    private String PER_APEPAT;
    private String PER_NOMBRE;
    private Date PER_FNAC;

    public Tb_beneficiario(int TB_PERSONA_ID, int TB_BENEFICIARIO_ID, int BENEFICIARIO_ID, String PER_DNI, String PER_APEMAT, String PER_APEPAT, String PER_NOMBRE, Date PER_FNAC) {
        this.TB_PERSONA_ID = TB_PERSONA_ID;
        this.TB_BENEFICIARIO_ID = TB_BENEFICIARIO_ID;
        this.BENEFICIARIO_ID = BENEFICIARIO_ID;
        this.PER_DNI = PER_DNI;
        this.PER_APEMAT = PER_APEMAT;
        this.PER_APEPAT = PER_APEPAT;
        this.PER_NOMBRE = PER_NOMBRE;
        this.PER_FNAC = PER_FNAC;
    }

    public Tb_beneficiario() {
    }

    /**
     * @return the TB_PERSONA_ID
     */
    public int getTB_PERSONA_ID() {
        return TB_PERSONA_ID;
    }

    /**
     * @param TB_PERSONA_ID the TB_PERSONA_ID to set
     */
    public void setTB_PERSONA_ID(int TB_PERSONA_ID) {
        this.TB_PERSONA_ID = TB_PERSONA_ID;
    }

    /**
     * @return the TB_BENEFICIARIO_ID
     */
    public int getTB_BENEFICIARIO_ID() {
        return TB_BENEFICIARIO_ID;
    }

    /**
     * @param TB_BENEFICIARIO_ID the TB_BENEFICIARIO_ID to set
     */
    public void setTB_BENEFICIARIO_ID(int TB_BENEFICIARIO_ID) {
        this.TB_BENEFICIARIO_ID = TB_BENEFICIARIO_ID;
    }

    /**
     * @return the BENEFICIARIO_ID
     */
    public int getBENEFICIARIO_ID() {
        return BENEFICIARIO_ID;
    }

    /**
     * @param BENEFICIARIO_ID the BENEFICIARIO_ID to set
     */
    public void setBENEFICIARIO_ID(int BENEFICIARIO_ID) {
        this.BENEFICIARIO_ID = BENEFICIARIO_ID;
    }

    /**
     * @return the PER_DNI
     */
    public String getPER_DNI() {
        return PER_DNI;
    }

    /**
     * @param PER_DNI the PER_DNI to set
     */
    public void setPER_DNI(String PER_DNI) {
        this.PER_DNI = PER_DNI;
    }

    /**
     * @return the PER_APEMAT
     */
    public String getPER_APEMAT() {
        return PER_APEMAT;
    }

    /**
     * @param PER_APEMAT the PER_APEMAT to set
     */
    public void setPER_APEMAT(String PER_APEMAT) {
        this.PER_APEMAT = PER_APEMAT;
    }

    /**
     * @return the PER_APEPAT
     */
    public String getPER_APEPAT() {
        return PER_APEPAT;
    }

    /**
     * @param PER_APEPAT the PER_APEPAT to set
     */
    public void setPER_APEPAT(String PER_APEPAT) {
        this.PER_APEPAT = PER_APEPAT;
    }

    /**
     * @return the PER_NOMBRE
     */
    public String getPER_NOMBRE() {
        return PER_NOMBRE;
    }

    /**
     * @param PER_NOMBRE the PER_NOMBRE to set
     */
    public void setPER_NOMBRE(String PER_NOMBRE) {
        this.PER_NOMBRE = PER_NOMBRE;
    }

    /**
     * @return the PER_FNAC
     */
    public Date getPER_FNAC() {
        return PER_FNAC;
    }

    /**
     * @param PER_FNAC the PER_FNAC to set
     */
    public void setPER_FNAC(Date PER_FNAC) {
        this.PER_FNAC = PER_FNAC;
    }
   
   
    
}
