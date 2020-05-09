<div class="">
    <div class="text-center mt-3 mb-4">
        <img src="/HolaChido/vista/images/users/notuser.png" alt="imagen user" class="perfil-imagen-panel rounded-circle"/>
        <div class="mt-5">
            <p><span id="nombre-usuario"><% out.print("Hola"); %></span></p>
            <p><span id="apellidos-usuario">Apellido usuario</span></p>
            <p><span id="calle-usuario">Calle del usuario usuario</span></p>
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