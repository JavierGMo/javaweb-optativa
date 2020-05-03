<%-- 
    Document   : admin-panel
    Created on : 27/04/2020, 04:01:18 PM
    Author     : m01
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    
    <title>Administracion</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
    <link href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
    <link rel="stylesheet" href="/HolaChido/vista/css/style.css">
</head>
    <body>
        <%@include file="../includes/admin/nav-admin.jsp" %>
        <div class="d-flex flex-row">
            <%@include file="../includes/admin/aside-menu-admin.jsp" %>
            <!--Nav bar-->
            <div class="w-80 mt-2 ml-2">
                <div id="contenedor-de-opciones" class="p-3"></div>
            </div>
        </div>
         
    <%@include file="../includes/admin/footer-admin.jsp" %><!--footer-->
    <script src="../js/jquery.min.js"></script>
    <script src="../js/menu.js"></script>
    <script src="../js/utilidadesdeusuario.js"></script>
    </body>
</html>