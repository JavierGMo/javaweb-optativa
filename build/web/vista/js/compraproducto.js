$(function(){


    $("#boton-comprar").click(function(event){
        event.preventDefault();
        Swal.fire({
            title: 'Compra',
            text: "Estas por realizar una compra",
            icon: 'warning',
            showCancelButton: true,
            confirmButtonColor: '#3085d6',
            cancelButtonColor: '#d33',
            confirmButtonText: 'Comprar',
            cancelButtonText: 'Cancelar',
          }).then((result) => {
            if (result.value) {
                let totaldepiezasstock = parseInt($("#totalpiezas").val()) - parseInt($("#piezascompradas").val());
                $.ajax({
                    url : "compraproductojs",
                    type:'POST',
                    data: {
                        idusuario:$("#idusuariocompra").val(),
                        idproducto:$("#idproductocompra").val(),
                        cantidadtotaldeproductos:totaldepiezasstock,
                        piezascompradas:$("#piezascompradas").val()
                    },
                    error : function(e) {
                        Swal.fire(
                            'Lo sentimos',
                            'Algo salio mal :( .',
                            'danger'
                        );
                    },
                    success : function(data) {
                        let encabezado = 'Lo sentimos.';
                        let cuerpores = 'Tu compra no se proceso, intentalo de nuevo :( .';
                        let icon = 'error';
                        
                        console.log(typeof data);
                        data = JSON.parse(data);
                        console.log("data: " + data["ok"]);
                        if(data["ok"] == 1){
                            console.log(data["ok"]);
                            encabezado = '!Exito!';
                            cuerpores = 'Tu compra se ha realizado con exito.';
                            icon = 'success';
                        }
                        Swal.fire(
                            encabezado,
                            cuerpores,
                            icon
                        );
                        console.log(data);
                    }
                });//Fin del ajax
            }//Fin del if
        });//Fin de la alerta
    });
});