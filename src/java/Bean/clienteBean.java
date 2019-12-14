
package Bean;

import java.sql.SQLException;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.servlet.ServletContext;

/**
 *
 * @author Nelson
 */
@ManagedBean
@ViewScoped
public class clienteBean {

    /**
     * Creates a new instance of clienteBean
     */
    public clienteBean() {
    }
    
    //Metodo para invocar el reporte y enviarle los parametros si es que necesita
    public void verReportePdf() throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        
        //Instancia hacia la clase reporteClientes        
        reporteCliente rCliente = new reporteCliente();
        
        FacesContext facesContext = FacesContext.getCurrentInstance();
        ServletContext servletContext = (ServletContext) facesContext.getExternalContext().getContext();
        String ruta = servletContext.getRealPath("/reportes/report.jasper");
       
        rCliente.getReportePdf(ruta);        
        FacesContext.getCurrentInstance().responseComplete();               
    }
    
    
    public void verReporteExcel() throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        
        //Instancia hacia la clase reporteClientes        
        reporteCliente rCliente = new reporteCliente();
        
        FacesContext facesContext = FacesContext.getCurrentInstance();
        ServletContext servletContext = (ServletContext) facesContext.getExternalContext().getContext();
        String ruta = servletContext.getRealPath("/reportes/report.jasper");
       
        rCliente.getReporteExcel(ruta);        
        FacesContext.getCurrentInstance().responseComplete();               
    }
    
    public void verReporteWord() throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        
        //Instancia hacia la clase reporteClientes        
        reporteCliente rCliente = new reporteCliente();
        
        FacesContext facesContext = FacesContext.getCurrentInstance();
        ServletContext servletContext = (ServletContext) facesContext.getExternalContext().getContext();
        String ruta = servletContext.getRealPath("/reportes/report.jasper");
       
        rCliente.getReporteWord(ruta);        
        FacesContext.getCurrentInstance().responseComplete();               
    }
    
    
    public void verReportePpt() throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        
        //Instancia hacia la clase reporteClientes        
        reporteCliente rCliente = new reporteCliente();
        
        FacesContext facesContext = FacesContext.getCurrentInstance();
        ServletContext servletContext = (ServletContext) facesContext.getExternalContext().getContext();
        String ruta = servletContext.getRealPath("/reportes/report.jasper");
       
        rCliente.getReportePPT(ruta);        
        FacesContext.getCurrentInstance().responseComplete();               
    }
}
