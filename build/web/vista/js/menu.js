function confirmar(){
    console.log("Click");
    console.log($("#despues-de-btn-eliminar"));
            try{
                $("#despues-de-btn-eliminar").removeClass("ocultar");
                $("#despues-de-btn-eliminar").addClass("mostrar");
            }catch(e){
                console.log("Error type: " + e);
            }
}
function dataproductos(id,opcion){
    let respuesta = "hola, no pude comunicarme con el servlet";
    
    $.ajax({
        url: "controldeproductos",
        data:{
            idusuario:id,
            opciondeproductos:opcion
        },
        async: false,
        success: function (response) {
            console.log("antes de asignar la variable: "+response);
            respuesta = response;
            console.log("despues de asginar la variable: "+respuesta);
        },
        error: function(e){
            console.log(e);
            respuesta = null;
        }
    });
    console.log("antes del return: "+respuesta);
    return respuesta;
}
$(function(){
        //AJAX para porder obtener y mostrar un contenido al usuario al entrar a su pagina
        $.ajax({
                url: "vista/includes/admin/contenidomenu/perfiledit.jsp",
                success: function (response) {
                        $("#contenedor-de-opciones").html(response);

                },
                error: function(e){
                        console.log("Error"+e);
                }
            });
        
	//id del contenedor: contenedor-de-opciones
	//Pestaña para perfil
	$("#opcion-perfil").click(function (event) {
		event.preventDefault();
                console.log("Hola, has hecho click");
		$.ajax({
			url: "vista/includes/admin/contenidomenu/perfiledit.jsp",
			success: function (response) {
				$("#contenedor-de-opciones").html(response);
                                
			},
			error: function(e){
				console.log("Error"+e);
			}
		});
	});
	//Pestaña para opcion de las compras
	$("#opcion-compras").click(function (event) {
		event.preventDefault();
                $.ajax({
                        url: "vista/includes/admin/contenidomenu/compraadmin.jsp",
                        success: function (response) {
                                $("#contenedor-de-opciones").html(response);
                                //Despues de cargar el jsp para poder traer los id para mostrar las compras realizadas
                                let dataapaginar = dataproductos($("#idusuarioparacompra").val(),"comprados");
                                let contenidotabla = [];
                                $.each(dataapaginar, function(index, item){
                                    contenidotabla.push({
                                        'id':item["idproducto"],
                                        'nombre':item["nombreproducto"],
                                        'precio': "$"+item["precio"]
                                    });
                                });
                                console.log("anidados en el ajax: "+ dataapaginar);
                                $('#tablachida').dataTable({
                                                data: contenidotabla,
                                                columns: [
                                                    { data: 'id' },
                                                    { data: 'nombre' },
                                                    { data: 'precio' }
                                                ]
                                            });
                                /*
                                $('#cajadepaginacioncompras')
                                    .pagination({
                                        dataSource: dataapaginar,
                                        callback: function(res, pagination){
                                            let listaul = '<ul>';
                                            $.each(res, function(index, item){
                                                listaul += '<li>' + item["nombreproducto"] + '</li>';
                                                console.log("Item: " + item["nombreproducto"]);
                                            });
                                            listaul += '</ul>';
                                            $('#cajadepaginacioncompras').prev().html(listaul);
                                        }
                                
                                    });*/
                                //.html('<ul><li>Hola con ajax perras</li></ul>');
                                //console.log(document.getElementById('cajadepaginacioncompras'));
                        },
                        error: function(e){
                                console.log("Error"+e);
                        }
                });
                
	});
	//Pestaña para la opcion de ventas
	$("#opcion-ventas").click(function (event) {
		event.preventDefault();
                $.ajax({
                        url: "vista/includes/admin/contenidomenu/ventaadmin.jsp",
                        success: function (response) {
                                $("#contenedor-de-opciones").html(response);
                        },
                        error: function(e){
                                console.log("Error"+e);
                        }
                });
	});
	//Pestaña para la opcion de administracion de cuentas
	$("#opcion-admin-cuentas").click(function (event) {
		event.preventDefault();
                $.ajax({
                        url: "vista/includes/admin/contenidomenu/usuarioadministracion.jsp",
                        success: function (response) {
                                $("#contenedor-de-opciones").html(response);
                        },
                        error: function(e){
                                console.log("Error"+e);
                        }
                });
	});
	//Pestaña para la opcion de cambiar contraseña
	$("#opcion-cambiar-contrasenia").click(function (event) {
		event.preventDefault();
                $.ajax({
                        url: "vista/includes/admin/contenidomenu/cambiocontrasenia.jsp",
                        dataType: "html",
                        success: function (response) {
                                $("#contenedor-de-opciones").html(response);
                        },
                        error: function(e){
                                console.log("Error"+e);
                        }
                });
	});
	//Pestaña para la opcion de eliminar cuenta
	$("#opcion-eliminar-cuenta").click(function (event) {
            event.preventDefault();
            $.ajax({
                    url: "vista/includes/admin/contenidomenu/eliminarcuenta.jsp",
                    success: function (response) {
                            $("#contenedor-de-opciones").html(response);
                            //Despues de cargar el jsp donde esta el id de eliminar cuentta
                            
                            document.getElementById("btn-eliminar-cuenta").onclick = function(){confirmar()};
                    },
                    error: function(e){
                            console.log("Error"+e);
                    }
            });
	});
        
        //Boton despues de querer eliminar la cuenta
        console.log($("#btn-eliminar-cuenta"));
        
        
        
});