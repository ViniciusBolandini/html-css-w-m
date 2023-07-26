var idade;
var pedido;
idade= parseInt(prompt("qual a sua idade?"));

if(idade>=18){
    pedido= prompt("qual o seu pedido?");
    alert("o pedido de: " + pedido + " foi feito");
}
else {
    alert("a venda e proibida para menores de idade");
}