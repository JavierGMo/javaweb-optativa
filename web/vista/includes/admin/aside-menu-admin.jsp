<%@page import="java.util.Map"%>
<div class="w-20">
    <div>
        <ul class="list-group">
            <li class="list-group-item"><a href="#" id="opcion-perfil" >Perfil</a></li>
            <li class="list-group-item"><a href="#" id="opcion-compras" >Compra</a></li>
            <li class="list-group-item"><a href="#" id="opcion-ventas" >Venta</a></li>
            <% 
                Map<String, String> dataUsuario = (Map<String, String>) session.getAttribute("usuario");
                String rolUsuario = dataUsuario.get("tipo");
                if(rolUsuario.equals("admin")){
            %>
                <li class="list-group-item"><a href="#" id="opcion-admin-cuentas" >Administracion de usuarios</a></li>
            <% } %>
            <li class="list-group-item"><a href="#" id="opcion-cambiar-contrasenia" >Cambiar contraseña</a></li>
            <li class="list-group-item"><a href="#" id="opcion-eliminar-cuenta" class="text-danger" >Eliminar cuenta</a></li>
        </ul>
    </div>
</div>