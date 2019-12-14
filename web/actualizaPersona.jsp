<%@page import="entidad.Tb_beneficiario"%>
<%@page import="java.util.List"%>
<%@page import="entidad.Tb_persona"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Lista Personas Registradas</title>
        <meta name="description" content="Free Bootstrap Theme by BootstrapMade.com">
        <meta name="keywords" content="free website templates, free bootstrap themes, free template, free bootstrap, free website template">

        <link rel="stylesheet" type="text/css" href="https://fonts.googleapis.com/css?family=Open+Sans|Raleway|Candal">
        <link rel="stylesheet" type="text/css" href="css/font-awesome.min.css">
        <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
        <link rel="stylesheet" type="text/css" href="css/style.css">
        <!-- =======================================================
          Theme Name: Medilab
          Theme URL: https://bootstrapmade.com/medilab-free-medical-bootstrap-theme/
          Author: BootstrapMade.com
          Author URL: https://bootstrapmade.com
        ======================================================= -->
    </head>

    <body id="myPage" data-spy="scroll" data-target=".navbar" data-offset="60">
        <!--banner-->
        <section id="banner" class="banner">
            <div class="bg-color">
                <nav class="navbar navbar-default navbar-fixed-top">
                    <div class="container">
                        <div class="col-md-12">
                            <div class="navbar-header">
                                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
                                    <span class="icon-bar"></span>
                                    <span class="icon-bar"></span>
                                    <span class="icon-bar"></span>
                                </button>
                                <a class="navbar-brand" href="#"><img src="img/logo.png" class="img-responsive" style="width: 140px; margin-top: -16px;"></a>
                            </div>
                            <div class="collapse navbar-collapse navbar-right" id="myNavbar">
                                <ul class="nav navbar-nav">
                                    <li class="active"><a href="index.jsp">INICIO</a></li>
                                    <li class=""><a href="#service">SERVICIOS</a></li>
                                    <li class=""><a href="#about">DESARROLLADO</a></li>               
                                    <li class=""><a href="#contact">CONTACTO</a></li>
                                </ul>
                            </div>
                        </div>
                    </div>
                </nav>
                <br><br><br><br><br><br>      


                <div class="container">
                   
                    <h1>Actualizacion de la Persona Registrada</h1>
                    
                    <% 
            Tb_persona a = (Tb_persona) request.getAttribute("data");
            
        %>
        
        <form action="tb_persona" method="post">
            <input type="hidden" name="metodo" value="actualiza">
            <input type="hidden" name="id" value="<%= a.getTB_PERSONA_ID()%>">
            <input type="hidden" name="TB_P_TDOC_ID" value="<%= a.getTB_P_TDOC_ID()%>">
            <table>
                
                              
                <TR>
                    <td>
                        DNI
                    </td>
                    <td>
                        <input type="text" name="PER_DNI" value="<%= a.getPER_DNI()%>" required="" maxlength="8"
                        onKeypress="if (event.keyCode < 45 || event.keyCode > 57) event.returnValue = false;">
                    </td>
                </tr>
                <tr>
                    <td>
                        APELLIDO PATERNO
                    </td>
                    <td>
                        <input type="text" name="PER_APEPAT" maxlength="15" value="<%= a.getPER_APEPAT()%>">
                    </td>
                </tr>
                <tr>
                    <td>
                        APELLIDO MATERNO
                    </td>
                    <td>
                        <input type="text" name="PER_APEMAT" maxlength="15" value="<%= a.getPER_APEMAT()%>">
                    </td>
                </tr>
                <tr>
                    <td>
                        NOMBRES
                    </td>
                    <td>
                        <input type="text" name="PER_NOMBRE" maxlength="15" value="<%= a.getPER_NOMBRE()%>">
                    </td>
                </tr>
                <tr>
                    <td>
                        FECHA DE NACIMIENTO
                    </td>
                    <td>
                        <input type="DATE" name="PER_FNAC" value="<%= a.getPER_FNAC()%>">
                    </td>
                </tr>
                
                
                
                <tr>
                    <td>
                        FECHA DEL EVENTO
                    </td>
                    <td>
                        <input type="date" name="TRA_FECH" value="<%= a.getTRA_FECH()%>">
                    </td>
                    </tr>
                    
                    <tr>
                    <td>
                        FECHA QUE SE REGISTRO EL EVENTO
                    </td>
                    <td>
                        <input type="date" name="TRA_REG" value="<%= a.getTRA_REG()%>">
                    </td>
                    </tr>
                
                 <tr>
                    <td>
                        DESCRIPCION DEL TRAMITE
                    </td>
                    <td>
                        <textarea rows="4" cols="80" name="TRA_DESCRIP" maxlength="300" ><%= a.getTRA_DESCRIP() %>
                            
                        </textarea>
                    </td>
                </tr>
                
                <tr>
                    <td>
                        <input type="submit" name="enviar" class="btn btn-primary" value="Actualizar"/>
                    </td>
                    <td>
                        <input type="submit" name="borrar" class="btn btn-warning" value="Cancelar" onclick="history.back()"/>
                    </td>
                </tr> 
                
                </table>
        </form>                                            
                
                <%
                   int x = a.getTB_P_TDOC_ID();                   
                    if(x==1) {
                        %>
          <form action="tb_beneficiario" method="post">               
            <table>     
                <tr>
                    <td>
              <input type="hidden" name="metodo" value="registra">
             <input type="hidden" name="TB_PERSONA_ID" value="<%= a.getTB_PERSONA_ID()%>">
            
                    </td>
                </tr>
                <tr>
                    <td>
                        TIPO DE TRAMITE
                    </td>
                    <td>
                        <select id="tramite" name="BENEFICIARIO_ID">
                            <option value="1" selected>MATRIMONIO</option>
                        <option value="2">TESTAMENTO</option>                        
                      </select>
                    </td>
                </tr>
                
                <tr>
                    <td>
                       CONYUGUE
                    </td>
                 </tr>
                 <tr>
                    <td>
                        DNI
                    </td>
                    <td>
                        <input type="text" name="PER_DNI_C" required="" maxlength="8"
                        onKeypress="if (event.keyCode < 45 || event.keyCode > 57) event.returnValue = false;">
                    </td>
                </tr>
                <tr>
                    <td>
                        APELLIDO PATERNO
                    </td>
                    <td>
                        <input type="text" name="PER_APEPAT_C" maxlength="15">
                    </td>
                </tr>
                <tr>
                    <td>
                        APELLIDO MATERNO
                    </td>
                    <td>
                        <input type="text" name="PER_APEMAT_C" maxlength="15">
                    </td>
                </tr>
                <tr>
                    <td>
                        NOMBRES
                    </td>
                    <td>
                        <input type="text" name="PER_NOMBRE_C" maxlength="25">
                    </td>
                </tr>
                
                <tr>
                    <td>
                        FECHA DE NACIMIENTO
                    </td>
                    <td>
                        <input type="DATE" name="PER_FNAC_C">
                    </td>
                </tr>
            <tr>
                    <td>
                        <input type="submit" name="enviar" class="btn btn-primary" value="Grabar" onclick="history.back()"/>
                    </td>
                    <td>
                        <input type="submit" name="borrar" class="btn btn-warning" value="Cancelar" onclick="history.back()"/>
                    </td>
                </tr> 
                
            </table>
        </form>     
                        
                     <%   
                    }
                    else {
%>
                         
               <form action="tb_beneficiario" method="post">               
            <table>     
                <tr>
                    <td>
              <input type="hidden" name="metodo" value="registra">
             <input type="hidden" name="TB_PERSONA_ID" value="<%= a.getTB_PERSONA_ID()%>">
            
                    </td>
                </tr>
                <tr>
                    <td>
                        TIPO DE TRAMITE
                    </td>
                    <td>
                        <select id="tramite" name="BENEFICIARIO_ID">
                             <option value="2" selected>TESTAMENTO</option>         
                            <option value="1" >MATRIMONIO</option>                            
                      </select>
                    </td>
                </tr>
                
                <tr>
                    <td>
                       CONYUGUE
                    </td>
                 </tr>
                 <tr>
                    <td>
                        DNI
                    </td>
                    <td>
                        <input type="text" name="PER_DNI_C" required="" maxlength="8"
                        onKeypress="if (event.keyCode < 45 || event.keyCode > 57) event.returnValue = false;">
                    </td>
                </tr>
                <tr>
                    <td>
                        APELLIDO PATERNO
                    </td>
                    <td>
                        <input type="text" name="PER_APEPAT_C" maxlength="15">
                    </td>
                </tr>
                <tr>
                    <td>
                        APELLIDO MATERNO
                    </td>
                    <td>
                        <input type="text" name="PER_APEMAT_C" maxlength="15">
                    </td>
                </tr>
                <tr>
                    <td>
                        NOMBRES
                    </td>
                    <td>
                        <input type="text" name="PER_NOMBRE_C" maxlength="25">
                    </td>
                </tr>
                
                <tr>
                    <td>
                        FECHA DE NACIMIENTO
                    </td>
                    <td>
                        <input type="DATE" name="PER_FNAC_C">
                    </td>
                </tr>
            <tr>
                    <td>
                        <input type="submit" name="enviar" class="btn btn-primary" value="Grabar" onclick="history.back()"/>
                    </td>
                    <td>
                        <input type="submit" name="borrar" class="btn btn-warning" value="Cancelar" onclick="history.back()"/>
                    </td>
                </tr> 
                
            </table>
        </form>     
                
<%                        
                    }                    
                %>
                                
                        </div>

                    </div>
                </div>
            </div>
        </section>
        <!--/ banner-->
        <!--service-->
        <section id="service" class="section-padding">

        </section>
        <!--/ service-->
        <!--cta-->

        <!--cta-->
        <!--about-->

        <!--/ about-->
        <!--doctor team-->
        <section id="doctor-team" class="section-padding">

        </section>
        <!--/ doctor team-->
        <!--testimonial-->

        <!--/ testimonial-->
        <!--cta 2-->

        <!--cta-->
        <!--contact-->
        <section id="contact" class="section-padding">

        </section>
        <!--/ contact-->
        <!--footer-->
        <footer id="footer">
            <div class="top-footer">
                <div class="container">
                    <div class="row">
                        <div class="col-md-4 col-sm-4 marb20">
                            <div class="ftr-tle">
                                <h4 class="white no-padding">About Us</h4>
                            </div>
                            <div class="info-sec">
                                <p>Praesent convallis tortor et enim laoreet, vel consectetur purus latoque penatibus et dis parturient.</p>
                            </div>
                        </div>
                        <div class="col-md-4 col-sm-4 marb20">
                            <div class="ftr-tle">
                                <h4 class="white no-padding">Quick Links</h4>
                            </div>
                            <div class="info-sec">
                                <ul class="quick-info">
                                    <li><a href="index.html"><i class="fa fa-circle"></i>Home</a></li>
                                    <li><a href="#service"><i class="fa fa-circle"></i>Service</a></li>
                                    <li><a href="#contact"><i class="fa fa-circle"></i>Appointment</a></li>
                                </ul>
                            </div>
                        </div>
                        <div class="col-md-4 col-sm-4 marb20">
                            <div class="ftr-tle">
                                <h4 class="white no-padding">Follow us</h4>
                            </div>
                            <div class="info-sec">
                                <ul class="social-icon">
                                    <li class="bglight-blue"><i class="fa fa-facebook"></i></li>
                                    <li class="bgred"><i class="fa fa-google-plus"></i></li>
                                    <li class="bgdark-blue"><i class="fa fa-linkedin"></i></li>
                                    <li class="bglight-blue"><i class="fa fa-twitter"></i></li>
                                </ul>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="footer-line">
                <div class="container">
                    <div class="row">
                        <div class="col-md-12 text-center">
                            © Copyright Medilab Theme. All Rights Reserved
                            <div class="credits">
                                <!--
                                  All the links in the footer should remain intact.
                                  You can delete the links only if you purchased the pro version.
                                  Licensing information: https://bootstrapmade.com/license/
                                  Purchase the pro version with working PHP/AJAX contact form: https://bootstrapmade.com/buy/?theme=Medilab
                                -->
                                Designed by <a href="https://bootstrapmade.com/">BootstrapMade.com</a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </footer>
        <!--/ footer-->

        <script src="js/jquery.min.js"></script>
        <script src="js/jquery.easing.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="js/custom.js"></script>
        <script src="contactform/contactform.js"></script>

    </body>

</html>

