function somar(){
    var n1;
    var n2;
    var res;
    var resposta;
    n1 = document.getElementById('n1').value;
    n2 = document.getElementById('n2').value;
    res = parseInt(n1) + parseInt(n2);
    
    
    resposta = document.getElementById('resp');
    resposta.innerText = res;

}