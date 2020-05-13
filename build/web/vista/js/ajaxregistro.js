$(function(){
   $.ajax({
        url : "datavivienda",
        
        //dataType : 'json',
        error : function(e) {
            console.log("Error Occured" + e);
        },
        success : function(data) {
            let estados = data["estados"];
            let calles = data["calles"];
            let municipios = data["municipios"];
            //nombreestado
            
            console.log(estados);
            console.log(calles);
            console.log(municipios);
            
            $.each(estados, function( index, value ) {
                $("#selectestados").append(`<option value="${value["idestado"]}">${value["nombreestado"]}</option>`);
                //console.log( index + ": " + value["idestado"] );
            });//for each para estados
            $.each(municipios, function( index, value ) {
                $("#selectmunicipios").append(`<option value="${value["idmunicipio"]}">${value["nombremunicipio"]}</option>`);
                //console.log( index + ": " + value["idestado"] );
            });//for each para municipio
            $.each(calles, function( index, value ) {
                $("#selectcalles").append(`<option value="${value["idcalle"]}">${value["nombrecalle"]}</option>`);
                
            });//for each para calle
            
        }
    }); 
});


