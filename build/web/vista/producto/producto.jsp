<%@page import="java.util.Map"%>
<%@page import="org.json.JSONObject"%>
<%@page import="modelo.Producto"%>

        <%@include file="../includes/nav.jsp" %><!--Include del navbar-->
        <%
            Producto producto = new Producto();
            String idProducto = pageContext.getRequest().getParameter("idp");
            String idUsuario = session.getAttribute("usuario")!= null?((Map<String, String>)session.getAttribute("usuario")).get("idusuario"):"0";
            JSONObject productoEspecificoJSON = producto.productoEspecifico(idProducto);
            /*
            Hacer que en el json verifique el id del cliente, si es 0 decirle que debe iniciar sesion xd
            */
            /*JSONObject productoEspecificoJSON = producto.productoEspecifico(pageContext.getRequest().getParameter("idp"));*/
            /*out.print(productoEspecificoJSON);*/
        %>
        <div class="d-flex flex-column mt-3">
            <div class="d-flex flex-row ml-5">
                <div class="w-75">
                    <div class="text-center mt-3">
                        <img src="<%out.print(productoEspecificoJSON.getString("refimagen"));%>" id="imagendelproducto-compra" class="img-fluid w-50 h-50" alt="<%out.print(productoEspecificoJSON.getString("nombreproducto"));%>">
                        <div class="text-justify mt-5 w-75">
                            <p class="h4">Descripcion:</p>
                            <p><span class="h3 text-justify"><%out.print(productoEspecificoJSON.getString("descripcionproducto"));%></span></p>
                        </div>
                    </div><!--Imagen del producto y descripcion-->
                </div><!--Imagen y descripcion-->
                <div class="">
                    <div>
                        <p class="h3">Producto:</p>
                        <p class="h5"><%out.print(productoEspecificoJSON.getString("nombreproducto"));%></p>
                    </div><!--nombre del producto-->
                    <div>
                        <p class="h4">Precio:</p>
                        <p>$<%out.print(productoEspecificoJSON.getString("precio"));%></p>
                    </div><!--Precio del producto-->
                    <div>
                        <form>
                            <div class="form-group">
                                <%
                                    if(Integer.parseInt(productoEspecificoJSON.getString("numerodepiezas"))==0){
                                %>
                                        <label class="disabledTextInput">Piezas disponibles: </label>
                                        <input type="number" name="cantidaddepiezas" id="cantidaddepiezas" class="form-control" readonly value="<%out.print(productoEspecificoJSON.getString("numerodepiezas"));%>"/>
                                    </div>
                                <%
                                    }else{
                                    
                                %>
                                        <label class="disabledTextInput">Piezas disponibles: <%out.print(productoEspecificoJSON.getString("numerodepiezas"));%></label>
                                        <input type="number" name="piezascompradas" id="piezascompradas" class="form-control" min="1" max="<%out.print(productoEspecificoJSON.getString("numerodepiezas"));%>"/>
                                        <!--.ocultar-->
                                        <input type="text" name="idusuariocompra" id="idusuariocompra" class="ocultar" value="<%out.print(idUsuario);%>"/><!--idproducto-->
                                        <input type="text" name="idproductocompra" id="idproductocompra" class="ocultar" value="<%out.print(idProducto);%>"/><!--idproducto-->
                                        <input type="text" name="totalpiezas" id="totalpiezas" class="ocultar" value="<%out.print(productoEspecificoJSON.getString("numerodepiezas"));%>"/><!--total de piezas-->
                                    </div>
                                    <button type="submit" id="boton-comprar" class="btn btn-primary pt-2 pb-2 pl-5 pr-5 btn-personal">Comprar</button>
                            <%}%>
                            
                        </form>
                    </div>
                    
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
        <script src="https://cdn.jsdelivr.net/npm/sweetalert2@9"></script>
        <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
        <script src="${pageContext.request.contextPath}/vista/js/jquery.min.js"></script>
        <script src="${pageContext.request.contextPath}/vista/js/compraproducto.js"></script>
    </body>
</html>
