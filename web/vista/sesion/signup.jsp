<%-- 
    Document   : login
    Created on : 17/04/2020, 02:09:41 PM
    Author     : Javier GMO
--%>

<!--
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>${titulo}</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
        <link href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
        <link rel="stylesheet" href="../css/style.css">
    </head>
    <body>-->
        <%@include file="../includes/nav.jsp" %><!--Include del navbar-->
        <div class="d-flex justify-content-center m-5">
            <form method="post" action="${pageContext.request.contextPath}/registro" class="mb-5" enctype="multipart/form-data">
                <div class="form-group">
                    <label for="imagenperfil-registro">Imagen de perfil</label>
                    <input type="file" class="form-control-file" id="imagenperfil-registro" name="imagenperfil-registro">
                </div>
                <div class="form-group">
                  <label for="nombre-registro">Nombre completo</label>
                  <input type="text" class="form-control" id="nombre-registro" name="nombre-registro" placeholder="Nombre completo">
                </div><!--nombre-->
                <div class="form-group">
                  <label for="apellido-registro">Apellido(s)</label>
                  <input type="text" class="form-control" id="apellido-registro" name="apellido-registro" placeholder="Apellido(s)">
                </div><!--apellido-->
                <div class="form-group">
                  <label for="nombreusuario-registro">Nombre de usuario</label>
                  <input type="text" class="form-control" id="nombreusuario-registro" name="nombreusuario-registro" placeholder="Nombre de usuario">
                </div><!--nombre de usuario-->
                <div class="form-group">
                  <label for="correo-registronuevo">Correo</label>
                  <input type="email" class="form-control" id="correo-registronuevo" name="correo-registronuevo" aria-describedby="emailHelp" placeholder="Correo">
                </div><!--correo-->
                <div class="form-group">
                    <p><span>�Que es?</span></p>
                    <div class="form-check form-check-inline">
                      <input class="form-check-input" type="radio" name="tipousuario-registro" id="compradorradio" value="c">
                      <label class="form-check-label" for="inlineRadio1">Comprador</label>
                    </div>
                    <div class="form-check form-check-inline">
                      <input class="form-check-input" type="radio" name="tipousuario-registro" id="vendedorradio" value="v">
                      <label class="form-check-label" for="inlineRadio2">Vendedor</label>
                    </div>
                </div><!--tipo de usuario-->
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
                <div class="form-group">
                  <label for="password-registronuevo">Contrase�a</label>
                  <input type="password" class="form-control" id="password-registronuevo" name="password-registronuevo" placeholder="Contrase�a">
                </div><!--contrase�a-->
                <div class="form-group">
                  <label for="passwordconfirmar-registronuevo">Contrase�a</label>
                  <input type="password" class="form-control" id="passwordconfirmar-registronuevo" name="passwordconfirmar-registronuevo" placeholder="Contrase�a">
                </div><!--confirmar contrase�a contrase�a-->
                <button type="submit" class="btn btn-primary form-control">Crear cuenta</button>
            </form>
        </div>
        <!--Scripts-->
        <%@include file="../includes/footer.jsp" %><!--Include del footer-->
        <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
        <script src="${pageContext.request.contextPath}/vista/js/jquery.min.js"></script>
        <script src="${pageContext.request.contextPath}/vista/js/ajaxregistro.js"></script>
    </body>
</html>