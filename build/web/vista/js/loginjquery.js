/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
$(function(){
    $.ajax({
        type: "POST",
        url:"login",
        dataType:"text",
        success: function (response) {
                console.log("Hola");
            },
        error: function(e){
            console.log(typeof e);
            
        }
    });
});

