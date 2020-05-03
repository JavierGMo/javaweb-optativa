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
$(function(){
        
        //AJAX para porder obtener y mostrar un contenido al usuario al entrar a su pagina
        $.ajax({
            url: "/HolaChido/vista/includes/admin/contenidomenu/perfil-edit.html",
            dataType: "html",
            success: function (response) {
                    $("#contenedor-de-opciones").html(response);
            },
            error: function(e){
                console.log(typeof e);
                $("#contenedor-de-opciones").html('<p class="error-pagina">Algo salio mal (Emoji)</p>');
            }
        });
        
	//id del contenedor: contenedor-de-opciones
	//Pestaña para perfil
	$("#opcion-perfil").click(function (event) {
		event.preventDefault();
		$.ajax({
			url: "/HolaChido/vista/includes/admin/contenidomenu/perfil-edit.html",
			dataType: "html",
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
				url: "/HolaChido/vista/includes/admin/contenidomenu/compra-admin.html",
				dataType: "html",
				success: function (response) {
					$("#contenedor-de-opciones").html(response);
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
				url: "/HolaChido/vista/includes/admin/contenidomenu/venta-admin.html",
				dataType: "html",
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
				url: "/HolaChido/vista/includes/admin/contenidomenu/usuarios-administracion.html",
				dataType: "html",
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
				url: "/HolaChido/vista/includes/admin/contenidomenu/cambio-contrasenia.html",
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
                    url: "/HolaChido/vista/includes/admin/contenidomenu/eliminar-cuenta.html",
                    dataType: "html",
                    success: function (response) {
                            $("#contenedor-de-opciones").html(response);
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