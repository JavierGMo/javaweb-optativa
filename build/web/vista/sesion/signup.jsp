<%-- 
    Document   : login
    Created on : 17/04/2020, 02:09:41 PM
    Author     : m01
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>{Nombre del producto}</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
        <link href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
        <link rel="stylesheet" href="../css/style.css">
    </head>
    <body>
        <%@include file="../includes/nav.jsp" %><!--Include del navbar-->
        <div class="d-flex justify-content-center m-5">
            <!--
            nombre
            apellido
            nombreusuario
            correo
            refimagen
            tipo
            contrasenia
            productos vendidos
            productos comprados
            calle
            municipio
            estado
            -->
            <form method="post" action="servletregistro" class="mb-5">
                <div class="form-group">
                  <label for="nombre-registro">Nombre completo</label>
                  <input type="text" class="form-control" id="nombre-registro" placeholder="Nombre completo">
                </div><!--nombre-->
                <div class="form-group">
                  <label for="apellido-registro">Apellido(s)</label>
                  <input type="text" class="form-control" id="apellido-registro" placeholder="Apellido(s)">
                </div><!--apellido-->
                <div class="form-group">
                  <label for="nombreusuario-registro">Nomnbre de usuario</label>
                  <input type="text" class="form-control" id="nombreusuario-registro" placeholder="Nombre de usuario">
                </div><!--nombre de usuario-->
                <div class="form-group">
                  <label for="correo-registronuevo">Correo</label>
                  <input type="email" class="form-control" id="correo-registronuevo" aria-describedby="emailHelp" placeholder="Correo">
                </div><!--correo-->
                <div class="form-group">
                  <label for="estadovivir-registro">Estado</label>
                  <input type="text" class="form-control" id="estadovivir-registro" placeholder="Estado">
                </div><!--estado-->
                <div class="form-group">
                  <label for="calle-registro">Calle</label>
                  <input type="text" class="form-control" id="calle-registro" placeholder="Calle">
                </div><!--calle-->
                <div class="form-group">
                  <label for="municipio-registro">Municipio</label>
                  <input type="text" class="form-control" id="municipio-registro" placeholder="Municipio">
                </div><!--municipio-->
                <div class="form-group">
                  <label for="password-registronuevo">Contraseña</label>
                  <input type="password" class="form-control" id="password-registronuevo" placeholder="Contraseña">
                </div><!--contraseña-->
                <button type="submit" class="btn btn-primary form-control">Crear cuenta</button>
            </form>
        </div>
        <!--Scripts-->
        <%@include file="../includes/footer.jsp" %><!--Include del footer-->
        <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
    </body>
</html>