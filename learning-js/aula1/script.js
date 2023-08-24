var nota1;
var nota2;
var media;

nota1=parseInt(prompt("qual a nota1?"));
nota2=parseInt(prompt("qual a nota2?"));



media = (nota1+nota2)/2;

if(media > 7){
    alert("voce passou, sua media e:" + media);
}
else alert("voce nao passou, sua media e:" + media);