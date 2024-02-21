
var table = document.getElementById('table');

var div1 = document.getElementById('square1');
var div2 = document.getElementById('square2');
var div3 = document.getElementById('square3');

var div4 = document.getElementById('square4');
var div5 = document.getElementById('square5');
var div6 = document.getElementById('square6');

var div7 = document.getElementById('square7');
var div8 = document.getElementById('square8');
var div9 = document.getElementById('square9');

var butreset = document.getElementById('reset');

var jogada = 0;
var flag = 0;

function reload(){
    window.location.reload(true);
}

function reset(){
    butreset.style.display = 'block';
}

function fimdejogo(){
    if(flag == 1){
        alert('fim de jogo');
        reset();
    }else
        if(flag == 0){
            alert('deu velha');
            reset();
        }
}

function verificaJogo(){
    if(div1.lang === div2.lang && div1.lang === div3.lang && div1.lang !=''){
        setTimeout(fimdejogo,350);
        flag = 1;
    }else 
        if(div4.lang === div5.lang && div4.lang === div6.lang && div4.lang !=''){
            setTimeout(fimdejogo,350);
            flag = 1;
        }else 
            if(div7.lang === div8.lang && div7.lang === div9.lang && div7.lang !=''){
                setTimeout(fimdejogo,350);
                flag = 1;
            }else
                if(div1.lang === div4.lang && div1.lang === div7.lang && div1.lang !=''){
                    setTimeout(fimdejogo,350);
                    flag = 1;
                }else
                    if(div2.lang === div5.lang && div2.lang === div8.lang && div2.lang !=''){
                        setTimeout(fimdejogo,350);
                        flag = 1;
                    }else
                        if(div3.lang === div6.lang && div3.lang === div9.lang && div3.lang !=''){
                            setTimeout(fimdejogo,350);
                            flag = 1;
                        }else
                            if(div1.lang === div5.lang && div1.lang === div9.lang && div1.lang !=''){
                                setTimeout(fimdejogo,350);
                                flag = 1;
                            }else
                                if(div3.lang === div5.lang && div3.lang === div7.lang && div3.lang !=''){
                                    setTimeout(fimdejogo,350);
                                    flag = 1;
                                }else
                                    if(jogada == 9 && flag == 0){
                                        setTimeout(fimdejogo,350);
                                    }

}

table.addEventListener('click', function(e) {
    let id_div = e.target.id;
    let divclicada = document.getElementById(id_div);
    if(jogada%2==0){
        divclicada.lang = 'x';
        let fotoicone = divclicada.children[0];
        fotoicone.src = 'letra-x.png';
    }
    if(jogada%2!=0){
        divclicada.lang = 'o';
        let fotoicone = divclicada.children[0];
        fotoicone.src = 'letra-o.png';
    }
    jogada++;
    verificaJogo();
    console.log(jogada);
});
