var n = "vinicius";
var s = "1235";

function loga(){
    let nome = document.getElementById("nome").value;
    let senha = document.getElementById("senha").value;

    if(nome == n && senha == s){
        let para = document.getElementById("res");
        para.innerText = "login success"
    }
    else{
        let para = document.getElementById("res");
        para.innerText = "login fail"
    }
}