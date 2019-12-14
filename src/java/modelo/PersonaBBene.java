/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;

/**
 *
 * @author david
 */
public class PersonaBBene {
    
    private int TB_PERSONA, TB_BENEFICIARIO_ID, BENEFICIARIO_ID;
    private String PER_DNI_T, PER_NOMBRE_T, PER_APEPAT_T, PER_APEMAT_T, TRA_DESCRIP_T;
    private String PER_DNI_D, PER_NOMBRE_D, PER_APEPAT_D, PER_APEMAT_D, TRA_DESCRIP_D;
    private Date TRA_REG;

    public PersonaBBene(int TB_PERSONA, int TB_BENEFICIARIO_ID, int BENEFICIARIO_ID, String PER_DNI_T, String PER_NOMBRE_T, String PER_APEPAT_T, String PER_APEMAT_T, String TRA_DESCRIP_T, String PER_DNI_D, String PER_NOMBRE_D, String PER_APEPAT_D, String PER_APEMAT_D, String TRA_DESCRIP_D, Date TRA_REG) {
        this.TB_PERSONA = TB_PERSONA;
        this.TB_BENEFICIARIO_ID = TB_BENEFICIARIO_ID;
        this.BENEFICIARIO_ID = BENEFICIARIO_ID;
        this.PER_DNI_T = PER_DNI_T;
        this.PER_NOMBRE_T = PER_NOMBRE_T;
        this.PER_APEPAT_T = PER_APEPAT_T;
        this.PER_APEMAT_T = PER_APEMAT_T;
        this.TRA_DESCRIP_T = TRA_DESCRIP_T;
        this.PER_DNI_D = PER_DNI_D;
        this.PER_NOMBRE_D = PER_NOMBRE_D;
        this.PER_APEPAT_D = PER_APEPAT_D;
        this.PER_APEMAT_D = PER_APEMAT_D;
        this.TRA_DESCRIP_D = TRA_DESCRIP_D;
        this.TRA_REG = TRA_REG;
    }

    public PersonaBBene() {
    }

    /**
     * @return the TB_PERSONA
     */
    public int getTB_PERSONA() {
        return TB_PERSONA;
    }

    /**
     * @param TB_PERSONA the TB_PERSONA to set
     */
    public void setTB_PERSONA(int TB_PERSONA) {
        this.TB_PERSONA = TB_PERSONA;
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
     * @return the PER_DNI_T
     */
    public String getPER_DNI_T() {
        return PER_DNI_T;
    }

    /**
     * @param PER_DNI_T the PER_DNI_T to set
     */
    public void setPER_DNI_T(String PER_DNI_T) {
        this.PER_DNI_T = PER_DNI_T;
    }

    /**
     * @return the PER_NOMBRE_T
     */
    public String getPER_NOMBRE_T() {
        return PER_NOMBRE_T;
    }

    /**
     * @param PER_NOMBRE_T the PER_NOMBRE_T to set
     */
    public void setPER_NOMBRE_T(String PER_NOMBRE_T) {
        this.PER_NOMBRE_T = PER_NOMBRE_T;
    }

    /**
     * @return the PER_APEPAT_T
     */
    public String getPER_APEPAT_T() {
        return PER_APEPAT_T;
    }

    /**
     * @param PER_APEPAT_T the PER_APEPAT_T to set
     */
    public void setPER_APEPAT_T(String PER_APEPAT_T) {
        this.PER_APEPAT_T = PER_APEPAT_T;
    }

    /**
     * @return the PER_APEMAT_T
     */
    public String getPER_APEMAT_T() {
        return PER_APEMAT_T;
    }

    /**
     * @param PER_APEMAT_T the PER_APEMAT_T to set
     */
    public void setPER_APEMAT_T(String PER_APEMAT_T) {
        this.PER_APEMAT_T = PER_APEMAT_T;
    }

    /**
     * @return the TRA_DESCRIP_T
     */
    public String getTRA_DESCRIP_T() {
        return TRA_DESCRIP_T;
    }

    /**
     * @param TRA_DESCRIP_T the TRA_DESCRIP_T to set
     */
    public void setTRA_DESCRIP_T(String TRA_DESCRIP_T) {
        this.TRA_DESCRIP_T = TRA_DESCRIP_T;
    }

    /**
     * @return the PER_DNI_D
     */
    public String getPER_DNI_D() {
        return PER_DNI_D;
    }

    /**
     * @param PER_DNI_D the PER_DNI_D to set
     */
    public void setPER_DNI_D(String PER_DNI_D) {
        this.PER_DNI_D = PER_DNI_D;
    }

    /**
     * @return the PER_NOMBRE_D
     */
    public String getPER_NOMBRE_D() {
        return PER_NOMBRE_D;
    }

    /**
     * @param PER_NOMBRE_D the PER_NOMBRE_D to set
     */
    public void setPER_NOMBRE_D(String PER_NOMBRE_D) {
        this.PER_NOMBRE_D = PER_NOMBRE_D;
    }

    /**
     * @return the PER_APEPAT_D
     */
    public String getPER_APEPAT_D() {
        return PER_APEPAT_D;
    }

    /**
     * @param PER_APEPAT_D the PER_APEPAT_D to set
     */
    public void setPER_APEPAT_D(String PER_APEPAT_D) {
        this.PER_APEPAT_D = PER_APEPAT_D;
    }

    /**
     * @return the PER_APEMAT_D
     */
    public String getPER_APEMAT_D() {
        return PER_APEMAT_D;
    }

    /**
     * @param PER_APEMAT_D the PER_APEMAT_D to set
     */
    public void setPER_APEMAT_D(String PER_APEMAT_D) {
        this.PER_APEMAT_D = PER_APEMAT_D;
    }

    /**
     * @return the TRA_DESCRIP_D
     */
    public String getTRA_DESCRIP_D() {
        return TRA_DESCRIP_D;
    }

    /**
     * @param TRA_DESCRIP_D the TRA_DESCRIP_D to set
     */
    public void setTRA_DESCRIP_D(String TRA_DESCRIP_D) {
        this.TRA_DESCRIP_D = TRA_DESCRIP_D;
    }

    /**
     * @return the TRA_REG
     */
    public Date getTRA_REG() {
        return TRA_REG;
    }

    /**
     * @param TRA_REG the TRA_REG to set
     */
    public void setTRA_REG(Date TRA_REG) {
        this.TRA_REG = TRA_REG;
    }

    
        
}
