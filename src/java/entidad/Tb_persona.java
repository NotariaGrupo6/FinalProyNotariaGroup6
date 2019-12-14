package entidad;

import java.sql.Date;

public class Tb_persona {
    private int TB_PERSONA_ID, TB_P_TDOC_ID;
    private String PER_NOMBRE, PER_APEMAT, PER_APEPAT, PER_DNI, TRA_DESCRIP, PARAM_NOMBRE;    
    private Date PER_FNAC, TRA_FECH, TRA_REG;

    public Tb_persona() {
    }

    public Tb_persona(int TB_PERSONA_ID, int TB_P_TDOC_ID, String PER_NOMBRE, String PER_APEMAT, String PER_APEPAT, String PER_DNI, String TRA_DESCRIP, String PARAM_NOMBRE, Date PER_FNAC, Date TRA_FECH, Date TRA_REG) {
        this.TB_PERSONA_ID = TB_PERSONA_ID;
        this.TB_P_TDOC_ID = TB_P_TDOC_ID;
        this.PER_NOMBRE = PER_NOMBRE;
        this.PER_APEMAT = PER_APEMAT;
        this.PER_APEPAT = PER_APEPAT;
        this.PER_DNI = PER_DNI;
        this.TRA_DESCRIP = TRA_DESCRIP;
        this.PARAM_NOMBRE = PARAM_NOMBRE;
        this.PER_FNAC = PER_FNAC;
        this.TRA_FECH = TRA_FECH;
        this.TRA_REG = TRA_REG;
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
     * @return the TB_P_TDOC_ID
     */
    public int getTB_P_TDOC_ID() {
        return TB_P_TDOC_ID;
    }

    /**
     * @param TB_P_TDOC_ID the TB_P_TDOC_ID to set
     */
    public void setTB_P_TDOC_ID(int TB_P_TDOC_ID) {
        this.TB_P_TDOC_ID = TB_P_TDOC_ID;
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
     * @return the TRA_DESCRIP
     */
    public String getTRA_DESCRIP() {
        return TRA_DESCRIP;
    }

    /**
     * @param TRA_DESCRIP the TRA_DESCRIP to set
     */
    public void setTRA_DESCRIP(String TRA_DESCRIP) {
        this.TRA_DESCRIP = TRA_DESCRIP;
    }

    /**
     * @return the PARAM_NOMBRE
     */
    public String getPARAM_NOMBRE() {
        return PARAM_NOMBRE;
    }

    /**
     * @param PARAM_NOMBRE the PARAM_NOMBRE to set
     */
    public void setPARAM_NOMBRE(String PARAM_NOMBRE) {
        this.PARAM_NOMBRE = PARAM_NOMBRE;
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

    /**
     * @return the TRA_FECH
     */
    public Date getTRA_FECH() {
        return TRA_FECH;
    }

    /**
     * @param TRA_FECH the TRA_FECH to set
     */
    public void setTRA_FECH(Date TRA_FECH) {
        this.TRA_FECH = TRA_FECH;
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
