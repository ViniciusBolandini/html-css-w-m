var nomes = ["vinicus","igor","roberta"];
var notasA = [7.0, 8.6, 9.5];
var notasB = [8.4 , 9.2, 5.1];


function media (nA,nB){
var media = (nA+nB)/2;
    return media;
}

for(var i=0;i<nomes.length;i++){
    console.log(nomes[i]+" notaA :" + notasA[i]+ " notaB :"+notasB[i]+ " media: "+ media(notasA[i],notasB[i]));
}