/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import entidad.Tb_persona;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.ModelTb_persona;

/**
 *
 * @author david
 */
@WebServlet(name = "tb_persona", urlPatterns = {"/tb_persona"})
public class tb_persona extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet tb_persona</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet tb_persona at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String metodo = request.getParameter("metodo");

        if (metodo.equals("registra")) {
            registra(request, response);
        } else if (metodo.equals("lista")) {
            lista(request, response);
        } else if (metodo.equals("elimina")) {
            elimina(request, response);
        } else if (metodo.equals("actualiza")) {
            actualiza(request, response);
        } else if (metodo.equals("busca")) {
            buscar(request, response);
        } 
    }

    protected void registra(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try {
            int TB_P_TDOC_ID = Integer.parseInt(request.getParameter("TB_P_TDOC_ID"));
            String PER_NOMBRE = request.getParameter("PER_NOMBRE");
            String PER_APEMAT = request.getParameter("PER_APEMAT");
            String PER_APEPAT = request.getParameter("PER_APEPAT");
            String PER_DNI = request.getParameter("PER_DNI");

            SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
            java.util.Date fechaN = f.parse(request.getParameter("PER_FNAC"));
            Date fechaM = new Date(fechaN.getTime());

            Tb_persona a = new Tb_persona();
            a.setTB_P_TDOC_ID(TB_P_TDOC_ID);
            a.setPER_DNI(PER_DNI);
            a.setPER_NOMBRE(PER_NOMBRE);
            a.setPER_APEPAT(PER_APEPAT);
            a.setPER_APEMAT(PER_APEMAT);
            a.setPER_FNAC(fechaM);

            ModelTb_persona model = new ModelTb_persona();
            model.insertaPersona(a);

            lista(request, response);

        } catch (ParseException ex) {
            Logger.getLogger(tb_persona.class.getName()).log(Level.SEVERE, null, ex);
        }

//        Date PER_FNAC = Date.valueOf(request.getParameter("PER_FNAC"));
//        Date FREGISTRO = Date.valueOf(request.getParameter("FREGISTRO"));               
    }

    protected void lista(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ModelTb_persona model = new ModelTb_persona();
        List<Tb_persona> data = model.listaPersona();

        request.setAttribute("data", data);
        request.getRequestDispatcher("/listaPersona.jsp").forward(request, response);
    }
    
    protected void elimina(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");

        ModelTb_persona model = new ModelTb_persona();
        model.eliminarPersona(Integer.parseInt(id));

        lista(request, response);
    }

    protected void buscar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");

        ModelTb_persona model = new ModelTb_persona();
        Tb_persona a = model.buscaPersona(Integer.parseInt(id));

        request.setAttribute("data", a);
        request.getRequestDispatcher("/actualizaPersona.jsp").forward(request, response);
    }
    
//    protected void buscar_2(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        String id = request.getParameter("id");
//
//        ModelTb_persona model = new ModelTb_persona();
//        Tb_persona a = model.buscaPersona(Integer.parseInt(id));
//
//        request.setAttribute("data", a);
//        request.getRequestDispatcher("/actualizaTramite.jsp").forward(request, response);
//    }

    protected void actualiza(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try {
            int id = Integer.parseInt(request.getParameter("id"));
            int TB_P_TDOC_ID = Integer.parseInt(request.getParameter("TB_P_TDOC_ID"));
            String PER_DNI = request.getParameter("PER_DNI");
            String PER_APEPAT = request.getParameter("PER_APEPAT");
            String PER_APEMAT = request.getParameter("PER_APEMAT");
            String PER_NOMBRE = request.getParameter("PER_NOMBRE");
            
            SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
            java.util.Date fechaN = f.parse(request.getParameter("PER_FNAC"));
            java.util.Date fechaF = f.parse(request.getParameter("TRA_FECH"));
            java.util.Date fechaR = f.parse(request.getParameter("TRA_REG"));
            Date fechaFf = new Date(fechaF.getTime());
            Date fechaRr = new Date(fechaR.getTime());
            Date fechaM = new Date(fechaN.getTime());            
            String TRA_DESCRIP = request.getParameter("TRA_DESCRIP");
                
//        String PER_FNAC = request.getParameter("PER_FNAC");
            Tb_persona a = new Tb_persona();
            a.setTB_P_TDOC_ID(TB_P_TDOC_ID);
            a.setTB_PERSONA_ID(id);
            a.setPER_DNI(PER_DNI);
            a.setPER_APEPAT(PER_APEPAT);
            a.setPER_APEMAT(PER_APEMAT);
            a.setPER_NOMBRE(PER_NOMBRE);
            a.setPER_FNAC(fechaM);
            a.setTRA_FECH(fechaFf);
            a.setTRA_REG(fechaRr);
            a.setTRA_DESCRIP(TRA_DESCRIP);

            ModelTb_persona model = new ModelTb_persona();
            model.actualizaPersona(a);
            lista(request, response);
        } catch (ParseException ex) {
            Logger.getLogger(tb_persona.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
