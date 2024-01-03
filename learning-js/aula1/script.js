var pegadata = new Date();
var hora = pegadata.getHours();
var minutos = pegadata.getMinutes();

var texto_hora = document.getElementById('texto');
texto_hora.innerText = `${hora}:${minutos}`;



if(hora < 12 && hora >6){
    let muda_foto = document.getElementById('imagem');
    muda_foto.src = "imagens/manha.jpg";
    let fundo = document.body;
    fundo.style.background = '#6EAFC5';
}
if(hora > 12 && hora <= 18){
    let muda_foto = document.getElementById('imagem');
    muda_foto.src = "imagens/tarde.jpg";
    let fundo = document.body;
    fundo.style.background = '#F2A663';
}
if(hora > 18 && hora <23){
    let muda_foto = document.getElementById('imagem');
    muda_foto.src = "imagens/noite.jpg";
    let fundo = document.body;
    fundo.style.background = '#324252';
}