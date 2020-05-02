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
		console.log("Hola soy un click");
		$.ajax({
			url: "/HolaChido/vista/includes/admin/contenidomenu/perfil-edit.html",
			dataType: "html",
			success: function (response) {
				$("#contenedor-de-opciones").html(response);
				console.log("Ok: "+response);
			},
			error: function(e){
				console.log("Error"+e);
			}
		});
	});
	//Pestaña para opcion de las compras
	$("#opcion-compras").click(function (event) {
		event.preventDefault();
		console.log("Hola soy un click");
			$.ajax({
				url: "/HolaChido/vista/includes/admin/contenidomenu/compra-admin.html",
				dataType: "html",
				success: function (response) {
					$("#contenedor-de-opciones").html(response);
					console.log("Ok: "+response);
				},
				error: function(e){
					console.log("Error"+e);
				}
			});
	});
	//Pestaña para la opcion de ventas
	$("#opcion-ventas").click(function (event) {
		event.preventDefault();
		console.log("Hola soy un click");
			$.ajax({
				url: "/HolaChido/vista/includes/admin/contenidomenu/venta-admin.html",
				dataType: "html",
				success: function (response) {
					$("#contenedor-de-opciones").html(response);
					console.log("Ok: "+response);
				},
				error: function(e){
					console.log("Error"+e);
				}
			});
	});
	//Pestaña para la opcion de administracion de cuentas
	$("#opcion-admin-cuentas").click(function (event) {
		event.preventDefault();
		console.log("Hola soy un click");
			$.ajax({
				url: "/HolaChido/vista/includes/admin/contenidomenu/usuarios-administracion.html",
				dataType: "html",
				success: function (response) {
					$("#contenedor-de-opciones").html(response);
					console.log("Ok: "+response);
				},
				error: function(e){
					console.log("Error"+e);
				}
			});
	});
	//Pestaña para la opcion de cambiar contraseña
	$("#opcion-cambiar-contrasenia").click(function (event) {
		event.preventDefault();
		console.log("Hola soy un click");
			$.ajax({
				url: "/HolaChido/vista/includes/admin/contenidomenu/cambio-contrasenia.html",
				dataType: "html",
				success: function (response) {
					$("#contenedor-de-opciones").html(response);
					console.log("Ok: "+response);
				},
				error: function(e){
					console.log("Error"+e);
				}
			});
	});
	//Pestaña para la opcion de eliminar cuenta
	$("#opcion-eliminar-cuenta").click(function (event) {
		event.preventDefault();
		console.log("Hola soy un click");
			$.ajax({
				url: "/HolaChido/vista/includes/admin/contenidomenu/eliminar-cuenta.html",
				dataType: "html",
				success: function (response) {
					$("#contenedor-de-opciones").html(response);
					console.log("Ok: "+response);
				},
				error: function(e){
					console.log("Error"+e);
				}
			});
	});
});
/*
opcion-perfil" href="#">Pe
" href="#">C
" href="#">Ve
" href

" hr
*/