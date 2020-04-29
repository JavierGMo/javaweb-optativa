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
    <link rel="stylesheet" href="vista/css/style.css">
</head>
    <body>
        <%@include file="../includes/admin/nav-admin.jsp" %>
        <div class="flex-row">
            <%@include file="../includes/admin/aside-menu-admin.jsp" %>
            <!--Nav bar-->
        </div>
         
    <%@include file="../includes/admin/footer-admin.jsp" %><!--footer-->
    <script src="../js/jquery.min.js"></script>
    </body>
</html>