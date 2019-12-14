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
                                    <li class=""><a href="#">SERVICIOS</a></li>
                                    <li class=""><a href="#">DESARROLLADO</a></li>               
                                    <li class=""><a href="#">CONTACTO</a></li>
                                </ul>
                            </div>
                        </div>
                    </div>
                </nav>
                <br><br><br><br><br><br>       


                <div class="container">
                    <div class="row">
                        <div class="col-md-12">
                            <h2 class="ser-title">Lista Personas Registradas</h2>
                           
                            <hr class="botm-line">
                        </div>
                        <div class="col-md-3 col-sm-3 col-xs-7">          

                            
                            <a href="tb_persona?metodo=lista" title="VER TODA LA BD"><img alt="" src="img/lista.jpg"></a>
                            <a href="insertaPersona.jsp" title="AGREGA MAS PERSONAS"><img alt="" src="img/agregar.jfif"></a><BR>
                            <br>

                            <table class="table table-sm">

                                <thead>
                                    <tr>
                                        <th scope="col">ID</th>
                                        <th scope="col">DESCRIPCION DEL TRAMITE</th>
                                        <th scope="col">DNI</th>
                                        <th scope="col">PATERNO</th>
                                        <th scope="col">MATERNO</th>
                                        <th scope="col">NOMBRES</th>
                                        <th scope="col">FECHA DE NACIMIENTO</th>
                                        <th scope="col">ELIMINAR</th>
                                        <th scope="col">EDITAR</th> 
                                        <th scope="col">TIPO DE TRAMITE</th> 
                                    </tr>
                                </thead>

                                <tbody>
                                    <%
                                        List<Tb_persona> data = (List<Tb_persona>) request.getAttribute("data");
                                        if (data != null) {
                                            for (Tb_persona x : data) {
                                    %>

                                    <tr>
                                        <th scope="row"><%= x.getTB_PERSONA_ID()%></th>
                                        <td><%= x.getPARAM_NOMBRE()%></td>
                                        <td><%= x.getPER_DNI()%></td>
                                        <td><%= x.getPER_APEPAT()%></td>
                                        <td><%= x.getPER_APEMAT()%></td>
                                        <td><%= x.getPER_NOMBRE()%></td> 
                                        <td><%= x.getPER_FNAC() %></td> 
                                        <td>                        
                                            <a href="tb_persona?metodo=elimina&id=<%= x.getTB_PERSONA_ID()%>">
                                                <img alt="Elimina" src="img/Delete.gif">
                                            </a>                        
                                        </td>

                                        <td>
                                            <a href="tb_persona?metodo=busca&id=<%= x.getTB_PERSONA_ID()%>">
                                                <img alt="Actualizar" src="img/Edit.gif">
                                            </a>
                                        </td> 
                                        <td>
                                            <a title="Registra Tramite" href="tb_persona?metodo=busca_2&id=<%= x.getTB_PERSONA_ID()%>">
                                                <img alt="ActTramite" src="img/tramite.jfif">
                                            </a>
                                        </td> 
                                    </tr>
                                    <%
                                            }
                                        }
                                    %>
                                </tbody>

                            </table>  

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
