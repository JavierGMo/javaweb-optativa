$(function(){
   $.ajax({
        url : "compraproducto",
        type: 'POST' ,
        //dataType : 'json',
        error : function(e) {
            console.log("Error Occured" + e);
        },
        success : function(data) {
            console.log(data);
        }
    }); 
});