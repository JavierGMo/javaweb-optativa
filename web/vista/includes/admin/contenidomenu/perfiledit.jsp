<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<div class="">
    <div class="text-center mt-3 mb-4">
        <% 
            Map<String, String> dataUsuario = (Map<String, String>) session.getAttribute("usuario");
            /*out.print(((Object)session.getAttribute("usuario")).getClass().getSimpleName());
            out.print(dataUsuario);*/
        %>
        <img src="${pageContext.request.contextPath}/vista/images/users/<% dataUsuario.get("refimagenperfil"); %>" alt="imagen user" class="perfil-imagen-panel rounded-circle"/>
        <div class="mt-5">
            
            <p><span id="nombre-usuario">Nombre completo: <% out.print(dataUsuario.get("nombre")); %></span></p>
            <p><span id="apellidos-usuario">Apellido: <% out.print(dataUsuario.get("apellido")); %></span></p>
            <p><span id="calle-usuario">Nombre de usuario: <% out.print(dataUsuario.get("nombreusuario")); %></span></p>
        </div><!--Descripcion del usuario-->
    </div><!--Informacion del usuario-->
    <div class="text-center mt-5">
        <form>
            <div class="form-group row">
              <label for="calle-edit-perfil" class="col-sm-2 col-form-label">Calle</label>
              <div class="col-sm-5">
                <input type="text" class="form-control" id="calle-edit-perfil" placeholder="Nueva calle">
              </div>
            </div>
            <div class="form-group row">
              <label for="codigo-postal-edit-perfil" class="col-sm-2 col-form-label">Codigo postal</label>
              <div class="col-sm-5">
                <input type="text" class="form-control" id="codigo-postal-edit-perfil" placeholder="Codigo postal">
              </div>
            </div>
            <div class="mt-4 w-75"><button type="submit" class="btn btn-primary mb-2 w-100">Actualizar</button></div>
        </form>
    </div><!--Form para cambio de datos no sensibles-->
</div><!--Contenedor principal-->