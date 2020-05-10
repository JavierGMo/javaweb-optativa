<!--
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>{Nombre del producto}</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
        <link href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
        <link rel="stylesheet" href="../css/style.css">
    </head>
    <body>-->
        <%@include file="../includes/nav.jsp" %><!--Include del navbar-->
        <div class="d-flex flex-column mt-3">
            <div class="d-flex flex-row ml-5">
                <div class="w-75">
                    <div class="text-center mt-3">
                        <img src="../images/ticket.png" id="imagendelproducto-compra" class="img-fluid w-50 h-50">
                        <div class="text-justify mt-5 w-75">
                            <p><span class="text-justify">Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam ac eleifend neque. Pellentesque a libero in leo tincidunt dignissim. Praesent egestas purus eu sem volutpat, pulvinar varius tortor tristique. Pellentesque iaculis ex vitae metus commodo molestie sit amet ac tortor. Phasellus lacinia semper ipsum, sit amet porta diam dapibus ac. Curabitur fermentum tempus eros non ornare. Donec nulla lacus, aliquam dictum dui vitae, rhoncus viverra nibh. Integer eu leo blandit, posuere massa ac, malesuada tortor. Mauris sed elit rhoncus, lobortis risus rutrum, euismod elit. Mauris lobortis finibus lobortis. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Integer gravida id metus vel congue. Sed eget erat non nulla rhoncus laoreet vitae a massa.                            Aliquam maximus condimentum tellus, at suscipit neque feugiat eget. Vestibulum velit dolor, vulputate at auctor et, laoreet vitae turpis. Pellentesque et massa aliquam, porttitor quam eu, mollis ipsum. Nam eu diam blandit, finibus magna vitae, ornare ex. Praesent feugiat sapien augue, ut tincidunt metus mattis id. Suspendisse lectus turpis, rhoncus id aliquam eleifend, viverra quis sapien. Quisque sed lorem pulvinar, laoreet ligula et, finibus diam. Etiam iaculis ex bibendum blandit gravida. Sed tincidunt, turpis at consequat pellentesque, nunc ante scelerisque elit, vitae placerat urna sapien quis turpis. Nam semper arcu libero, id tincidunt ligula molestie ut. Nullam varius justo eget ligula dignissim dictum.</span></p>
                        </div>
                    </div><!--Imagen del producto y descripcion-->
                </div><!--Imagen y descripcion-->
                <div class="">
                    <div>
                        <p>Nombre del producto</p>
                    </div><!--nombre del producto-->
                    <div>
                        <p>$1k</p>
                    </div><!--Precio del producto-->
                    <a class="btn btn-primary pt-2 pb-2 pl-5 pr-5 btn-personal">Comprar</a>
                </div><!--Contenedor de unidades disponibles y compra de unidades-->
            </div><!--Contenedor de la descripcion-->
            <div class="w-75 ml-5">
                <div class="caja-separadora rounded mt-3 mb-4 p-4">
                    <p><span class="">Opiniones del producto</span></p>
                    <div>
                        <p><span>Excelente</span></p>
                        <p><span>Producto de calidad</span></p>
                    </div>
                </div><!--Opiniones-->
                <div class="caja-separadora rounded mt-3 mb-4 p-4">
                    <div class="">
                        <p><span>Pregutnas y respuestas</span></p>
                        <form class="form-inline">
                            <div class="form-group mx-sm-3 mb-2">
                              <label for="preguntaalvendedor" class="sr-only">Pregunta</label>
                              <input type="text" class="form-control" id="preguntaalvendedor" placeholder="Pregunta al vendedor">
                            </div>
                            <button type="submit" class="btn btn-primary mb-2">Preguntar</button>
                      </form>
                    </div><!--Form de la pregunta-->
                    <div>
                        <p><span class="" id="">¿Es nuevo?</span></p>
                        <p><span class="" >Si, es nuevo</span></p>
                    </div><!--Las preguntas y sus respuestas-->
                </div><!--Preguntas y respuestas-->
            </div><!--Preguntas y comentarios-->
        </div><!--Contenedor principal-->
        <%@include file="../includes/footer.jsp" %><!--Include del footer-->
        <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
    </body>
</html>
