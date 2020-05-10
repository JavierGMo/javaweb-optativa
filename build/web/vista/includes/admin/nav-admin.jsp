<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    
    <title>${titulo}</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
    <link href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/vista/css/style.css">
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
    <a class="navbar-brand mr-5" href="${pageContext.request.contextPath}">
        <img src="/docs/4.4/assets/brand/bootstrap-solid.svg" width="30" height="30" class="d-inline-block align-top" alt="">
        Car-Tomatic
    </a>
    <form class="form-inline ml-5 mr-5">
      <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
      <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
    </form>
    <div class="collapse navbar-collapse" id="navbarNav">
        <ul class="navbar-nav ml-5">
          <li class="nav-item active">
            <a class="nav-link text-light" href="#">Inicio</a>
          </li>
          <li class="nav-item">
            <a class="nav-link text-light" href="#">Ayuda</a>
          </li>
          <li class="nav-item ml-3">
            <div class="dropdown ml-3">
                <button class="btn btn-dark dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                  <i class="fa fa-user-circle text-light mr-1"></i>Usuario
                </button>
                <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
                    <a class="dropdown-item" href="${pageContext.request.contextPath}/controlusuario">Perfil</a>
                    <a class="dropdown-item" href="${pageContext.request.contextPath}/logout">Cerrar sesion</a>
                </div>
            </div>
          </li>
        </ul>
    </div>
</nav>
