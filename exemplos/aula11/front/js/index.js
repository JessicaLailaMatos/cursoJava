function validarLogin(event){
event.preventDefault(); // evita o comportamento padrão, enviar o formulario com os dados 

let txtUser = document.getElementById("inputUser").value;
let txtSenha = document.getElementById("inputPassword").value;
//console.log(txtUser+":" +txtSenha); // utilizado para ver se aparece dados no console do Google

let loginMsg = {
    email: txrUser,
    senha: txtSenha
}

let msg = {
    method: 'POST',
    body: JSON.stringify(loginMsg),
    headers: {
        'contenct-type':'application/json'
    }
}

fetch("http://localhost:8080/user/email", msg)
    .then(res => tratarRetorno(res))

}


function tratarRetorno(retorno){
    if (retorno.status == 200){
        document.getElementById("msgRetorno").innerHTML = "Login com sucesso";
        retorno.json().then(res => fazerLogin(res));

    }else{
        document.getElementById("msgRetorno").innerHTML = "Falha no login";
    }

}

function fazerLogin(user){
    document.getElementById("divUser").innerHTML = `<b> ${user.nome} </b> (${user.email})´;   
    window.location = "interna.html"
}