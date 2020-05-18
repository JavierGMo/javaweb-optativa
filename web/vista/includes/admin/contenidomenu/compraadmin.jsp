<%@page import="java.util.Map"%>
<%
    Map<String, String> dataUsuario = (Map<String, String>)session.getAttribute("usuario");
%>
<input type="text" id="idusuarioparacompra" class="ocultar" value="<%out.print(dataUsuario.get("idusuario"));%>"/>
<div class="m-4"><p class="h3">Productos comprados</p></div>
<div class="bg-light">
    <div><p class="h3">Informacion de tus compras</p></div>
    <div id="cajadecompras">
        <table id="tablachida">
            <thead>
                <tr>
                  <th width="20%">ID Producto</th>
                  <th width="25%">Nombre del producto</th>
                  <th width="25%">Precio del producto</th>
                </tr>
            </thead>
        </table>
    </div>
</div><!-- Contenedor de los productos -->

