/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import entidad.Tb_beneficiario;
import entidad.Tb_persona;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
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
import model.ModelTb_beneficiario;
import model.ModelTb_persona;

/**
 *
 * @author david
 */
@WebServlet(name = "tb_beneficiario", urlPatterns = {"/tb_beneficiario"})
public class tb_beneficiario extends HttpServlet {

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
            out.println("<title>Servlet tb_beneficiario</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet tb_beneficiario at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }
    
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String metodo = request.getParameter("metodo");

        if (metodo.equals("registra")) {
            registra(request, response);
        } 
    }

    protected void registra(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try {
            int TB_PERSONA_ID = Integer.parseInt(request.getParameter("TB_PERSONA_ID"));
            int BENEFICIARIO_ID = Integer.parseInt(request.getParameter("BENEFICIARIO_ID"));
            String PER_NOMBRE = request.getParameter("PER_NOMBRE_C");
            String PER_APEMAT = request.getParameter("PER_APEMAT_C");
            String PER_APEPAT = request.getParameter("PER_APEPAT_C");
            String PER_DNI = request.getParameter("PER_DNI_C");

            SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
            java.util.Date fechaN = f.parse(request.getParameter("PER_FNAC_C"));
            Date fechaM = new Date(fechaN.getTime());

            Tb_beneficiario a = new Tb_beneficiario();
            a.setTB_PERSONA_ID(TB_PERSONA_ID);
            a.setBENEFICIARIO_ID(BENEFICIARIO_ID);
            a.setPER_DNI(PER_DNI);
            a.setPER_NOMBRE(PER_NOMBRE);
            a.setPER_APEPAT(PER_APEPAT);
            a.setPER_APEMAT(PER_APEMAT);
            a.setPER_FNAC(fechaM);

            ModelTb_beneficiario model = new ModelTb_beneficiario();
            model.insertaBeneficiario(a);

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
