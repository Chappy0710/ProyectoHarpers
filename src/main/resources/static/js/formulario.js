function valida_Datos(){
    //valida el nombre
    if (document.fvalida.nombre.value.length ==0) {
        alert("Tiene que escribir un nombre");
        //pára que la caja quede seleccionada
        document.fvalida.nombre.focus();
        //para decirle que la funcion termino y lo inicie de 0
        return 0;
    }
    //valida la edad, tiene que ser mayor a 18 (haciendolo con variables)
    var edad = document.fvalida.edad.value;
    if (edad == "") {
        alert("Tiene que escribir una edad");
        document.fvalida.edad.focus();
        return 0;
    }
    //valida usuario
    if (document.fvalida.usuario.value.length==0) {
        alert("Tiene que escribir un usuario");
        document.fvalida.usuario.focus();
        return 0;
    }
    //valida el comentario
    if (document.fvalida.comentario.value.length<10 || document.fvalida.comentario.value.length>200) {
        alert("El comentario debe tener entre 10 y 200 caracteres");
        document.fvalida.comentario.focus();
        return 0;
    }
    //el formulario se envia
    alert("Muchas gracias por enviar el formulario")
}
