<%-- 
    Document   : index
    Created on : 15/04/2020, 08:24:35 PM
    Author     : Javier GMO
--%>

<%@page import="org.json.JSONObject"%>
<%@page import="org.json.JSONArray"%>
<%@page import="modelo.Producto"%>
<%@page import="java.io.File"%>
<!--
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>${titulo}</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
        <link href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
        <link rel="stylesheet" href="vista/css/style.css">
    </head>
    <body>-->
        <%@include file="vista/includes/nav.jsp" %><!--Include del navbar-->
        <div class="d-flex flex-column">
            <div class="text-center mt-3">
                <img src="vista/images/ticket.png" class="img-fluid w-75 h-75">
            </div>
        </div><!--Anuncios de productos-->
        <div class="mt-5 mb-5">
            <%
                Producto productos = new Producto();
                JSONArray arrayProductos = productos.leerProductosRandom();
                //out.print(ruta.getAbsolutePath());
                //out.print(((JSONObject)arrayProductos.get(0)).getString("precio"));
                //out.print(carpetaDestino.getAbsolutePath());
                //out.print(carpetaDestino.getCanonicalPath());
            %>
            <div id="productos-del-index" class="d-flex justify-content-around">
                <%
                    for(int i = 0; i<arrayProductos.length(); i++){
                %>
                <div class="d-flex flex-column estilo-productos">
                    <p><span class="titulo-productos"><%out.print(((JSONObject)arrayProductos.get(i)).getString("nombreproducto"));%></span></p>
                    
                    <img src="<%out.print(((JSONObject)arrayProductos.get(i)).getString("refimagen"));%>" class="size-prod" alt="prod">
                    <p><span class="texto-descripcion text-wrap w-g"><%out.print(((JSONObject)arrayProductos.get(i)).getString("descripcionproducto"));%></span></p>
                    <p><span class="remarcado-precio mb-5">$<%out.print(((JSONObject)arrayProductos.get(i)).getString("precio"));%></span></p>
                    <div class="mt-5">
                        <a class="btn btn-primary btn-padd" href="${pageContext.request.contextPath}/compraproducto?idp=<%out.print(((JSONObject)arrayProductos.get(i)).getString("idproducto") +"&nombrep="+((JSONObject)arrayProductos.get(i)).getString("nombreproducto"));%>">Ver</a>
                    </div>
                </div>
                <%}%>
            </div>
        </div><!--Produtos de una misma categoria-->
        <div class="mt-5">
            <div class="text-center"><p>Categorias</p></div>
            <div class="d-flex justify-content-center">
                <div class="espacio-categoria anima-categoria">
                    <i class="fa fa-mobile"></i>
                    <p>Telefonia</p>
                </div>
                <div class="espacio-categoria anima-categoria">
                    <i class="fa fa-gamepad"></i>
                    <p>Videojuegos</p>
                </div>
                <div class="espacio-categoria anima-categoria">
                    <i class="fa fa-laptop"></i>
                    <p>Computo</p>
                </div>
                <div class="espacio-categoria anima-categoria">
                    <i class="fa fa-laptop"></i>
                    <p>Computo</p>
                </div>
                <div class="espacio-categoria anima-categoria">
                    <i class="fa fa-laptop"></i>
                    <p>Computo</p>
                </div>
            </div>
        </div><!--Todas las categorias-->
        <%@include file="vista/includes/footer.jsp" %><!--Include del footer-->
        <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
    </body>
</html>
