<div class="">
    <div class="text-center">
        <p><span>Al eliminar la cuenta no podra recuperarla nunca mas.</span></p>
        <button id="btn-eliminar-cuenta" class="btn btn-danger" >Eliminar</button>
    </div>
    <div id="despues-de-btn-eliminar" class="ocultar">
        <form method="post" action="servlet-cambio-contrasenia" class="">
            <div class="form-group row ">
              <div class="col-sm-5">
                  <label for="confirmar-eliminarcuenta-pass" class="col-sm-2 col-form-label">Contrase�a</label>
                  <input type="password" class="form-control" id="confirmar-eliminarcuenta-pass" placeholder="Contrase�a">
              </div>
            </div>
            <button type="submit" class="btn btn-primary mb-2">Confirmar</button>
        </form>
    </div>
</div>