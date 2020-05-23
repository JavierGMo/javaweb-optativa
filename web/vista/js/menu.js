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
let verificarcampo = (aconfirmar)=>{
    let ok = false;
    if(aconfirmar!==null && aconfirmar!==undefined){
        if(aconfirmar.val().trim()!==""){
            ok = true;
        }
    }
    return ok;
};
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
                                $("#confirmar-cambio").click(function(event){
                                    event.preventDefault();
                                    let pass = $("#password");
                                    let passconfirm = $("#passwordconfirm");
                                    if(verificarcampo(pass) && verificarcampo(passconfirm)){
                                        if(pass.val().trim().length===passconfirm.val().trim().length && pass.val().trim()===passconfirm.val().trim()){
                                            pass.removeClass("is-invalid");
                                            passconfirm.removeClass("is-invalid");
                                            $.ajax({
                                                type:'POST',
                                                url: 'cambiopass',
                                                data:{
                                                    nuevacontrasenia: pass.val().trim()
                                                },
                                                success: function (response) {
                                                    if(response["ok"]!==0){
                                                        Swal.fire(
                                                            'Exito',
                                                            'Tu contraseña se ha actualizado',
                                                            'success'
                                                        );
                                                    }else{
                                                        Swal.fire(
                                                            'Oops...',
                                                            'Vaya, algo salio mal :/',
                                                            'error'
                                                        );
                                                    }
                                                },
                                                error: function(e){
                                                    Swal.fire(
                                                        'Oops...',
                                                        'Vaya, algo salio mal :/',
                                                        'error'
                                                    );
                                                }
                                            });
                                        }else{
                                            pass.addClass("is-invalid");
                                            passconfirm.addClass("is-invalid");
                                        }
                                    }else{
                                        //is-invalid
                                        pass.addClass("is-invalid");
                                        passconfirm.addClass("is-invalid");
                                    }
                                    pass.val("");
                                    passconfirm.val("");
                                });
                                
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
                            $("#btn-confirmar-eliminacion").click(function(event){
                                event.preventDefault();
                                let pass = $("#confirmar-eliminarcuenta-pass");
                                if(verificarcampo(pass)){
                                    if(pass.val().trim()!==""){
                                        pass.removeClass("is-valid");
                                        $.ajax({
                                           type:'POST',
                                           url:'eliminarcuenta',
                                           data:{
                                               password:$("#confirmar-eliminarcuenta-pass").val().trim()
                                           },
                                           success: function (response) {
                                               if(response["ok"]===0){
                                                   Swal.fire(
                                                        'Vaya',
                                                        'Algo salio mal :/',
                                                        'error'
                                                    );
                                               }
                                            },
                                            error: function(e){
                                                console.log("Error"+e);
                                                Swal.fire(
                                                    'Vaya',
                                                    'Algo salio mal :/',
                                                    'error'
                                                );
                                            }
                                           
                                        });
                                    }else{
                                        pass.addClass("is-invalid");
                                    }
                                }else{
                                    pass.addClass("is-invalid");
                                }
                            });
                    },
                    error: function(e){
                            console.log("Error"+e);
                    }
            });
	});
                
        
        
        
});