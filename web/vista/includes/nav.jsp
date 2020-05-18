<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>${titulo}</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
    <link href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/vista/css/style.css">
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
    <a class="navbar-brand" href="${pageContext.request.contextPath}/">
        <img src="/docs/4.4/assets/brand/bootstrap-solid.svg" width="30" height="30" class="d-inline-block align-top" alt="">
        Car-Ito
    </a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
        <div class="navbar-nav">
            <form class="form-inline">
              <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
              <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
            </form><!--Formulario para buscar productos-->
            <ul class="navbar-nav">
              <li class="nav-item active">
                <a class="nav-link text-light" href="#">Inicio</a>
              </li>
              <li class="nav-item">
                <a class="nav-link text-light" href="#">Ayuda</a>
              </li>
              <li class="nav-item">
                <div class="dropdown ml-3">
                    <button class="btn btn-dark dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                      <i class="fa fa-cart-plus text-light mr-2"></i>
                    </button>
                    <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
                        <a class="dropdown-item" href="#">
                            <div class="d-flex flex-row">
                                <img src="/HolaChido/vista/images/productos/producto.jpg" class="w-25 h-25" />
                                <p class="ml-2"><span id="titulo-producto-cesta">Dron elite</span></p>
                            </div>
                        </a>
                        <a class="dropdown-item" href="#">
                            <div class="d-flex flex-row">
                                <img src="/HolaChido/vista/images/productos/producto.jpg" class="w-25 h-25" />
                                <p class="ml-2"><span id="titulo-producto-cesta">Dron elite</span></p>
                            </div>
                        </a>
                        <a class="dropdown-item" href="#">
                            <div class="d-flex flex-row">
                                <img src="/HolaChido/vista/images/productos/producto.jpg" class="w-25 h-25" />
                                <p class="ml-2"><span id="titulo-producto-cesta">Dron elite</span></p>
                            </div>
                        </a>
                    </div>
                </div>
              </li>
              <li class="nav-item">
                <div class="dropdown ml-3">
                    <button class="btn btn-dark dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                      <i class="fa fa-user-circle text-light mr-1"></i>Sesion
                    </button>
                    <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
                        <%
                            //java.util.Map<String, String> usuario = session.getAttribute("usuario");
                            //out.print(session);
                            //out.print(session.getAttribute("usuario"));
                            if(session.getAttribute("usuario") == null){
                        %>
                            <a class="dropdown-item" href="${pageContext.request.contextPath}/login">Iniciar sesion</a>
                            <a class="dropdown-item" href="${pageContext.request.contextPath}/registro">Registro</a>
                         <% }else{%>
                            <a class="dropdown-item" href="${pageContext.request.contextPath}/controlusuario">Perfil</a>
                            <a class="dropdown-item" href="${pageContext.request.contextPath}/logout">Cerrar sesion</a>
                        <%
                            }
                        %>
                    </div>
                </div>
              </li>
            </ul><!--opciones de inicio, ayuda, sesion y carrito-->
        </div>
    </div>
</nav>
