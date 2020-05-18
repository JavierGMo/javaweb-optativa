<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<div class="">
    <div class="text-center mt-3 mb-4">
        <% 
            Map<String, String> dataUsuario = (Map<String, String>) session.getAttribute("usuario");
            /*refimagenperfil*/
            /*out.print(((Object)session.getAttribute("usuario")).getClass().getSimpleName());
            out.print(dataUsuario);*/
        %>
        <img src="<%out.print(dataUsuario.get("refimagenperfil"));%>" alt="imagen user" class="perfil-imagen-panel rounded-circle"/>
        <div class="mt-5">           
            <p><span id="nombre-usuario">Nombre completo: <% out.print(dataUsuario.get("nombre")); %></span></p>
            <p><span id="apellidos-usuario">Apellido: <% out.print(dataUsuario.get("apellido")); %></span></p>
            <p><span id="calle-usuario">Nombre de usuario: <% out.print(dataUsuario.get("nombreusuario")); %></span></p>
        </div><!--Descripcion del usuario-->
    </div><!--Informacion del usuario-->
    <div class="text-center mt-5">
        <p class="h3">Actualizar datos de datos</p>
        <form>
            <div class="form-group">
                <label for="inputState">Estado</label>
                <select name="estadovivir-registro" id="selectestados" class="form-control">
                    <option value="0" selected>...</option>
                </select>
            </div><!--Estado select-->
            <div class="form-group">
                <label for="inputState">Municipio</label>
                <select name="municipio-registro" id="selectmunicipios" class="form-control">
                    <option value="0" selected>...</option>
                </select>
            </div><!--Municipio select-->
            <div class="form-group">
                <label name="calle-registro" for="inputState">Calle</label>
                <select id="selectcalles" class="form-control">
                    <option value="0" selected>...</option>
                </select>
            </div><!--Calle select-->
            <div class="mt-4 w-75"><button type="submit" class="btn btn-primary mb-2 w-100">Actualizar</button></div>
        </form>
    </div><!--Form para cambio de datos no sensibles-->
</div><!--Contenedor principal-->