<%-- 
    Document   : admin-panel
    Created on : 27/04/2020, 04:01:18 PM
    Author     : Javier GMO
--%>

<!--
<!DOCTYPE html>
<html>
<head>
    
    <title>${titulo}</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
    <link href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
    <link rel="stylesheet" href="/HolaChido/vista/css/style.css">
</head>
    <body>-->
        <%@include file="../includes/admin/nav-admin.jsp" %>
        <div class="d-flex flex-row">
            <%@include file="../includes/admin/aside-menu-admin.jsp" %>
            <!--Nav bar-->
            <div class="w-80 mt-2 ml-2">
                <div id="contenedor-de-opciones" class="p-3"></div>
            </div>
        </div>
         
    <%@include file="../includes/admin/footer-admin.jsp" %><!--footer-->
    <script src="https://cdn.jsdelivr.net/npm/sweetalert2@9"></script>
    <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
    <script src="${pageContext.request.contextPath}/vista/js/jquery.min.js"></script>
    <script src="${pageContext.request.contextPath}/vista/js/pagination.min.js"></script>
    <script type="text/javascript" src="https://cdn.datatables.net/v/dt/dt-1.10.21/datatables.min.js"></script>
    <script src="${pageContext.request.contextPath}/vista/js/menu.js"></script>
    <script src="${pageContext.request.contextPath}/vista/js/ajaxregistro.js"></script>
    </body>
</html>