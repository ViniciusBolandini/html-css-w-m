function abrirmenu(){
    let divmenu = document.getElementById('menu');
    divmenu.style.display = 'inline-block';
    let asidemenu = document.getElementById('asidemenu');
    asidemenu.style.display = 'inline-block';
}

function escondemenu(){
    let publicador = document.getElementById('publi');

    if(publicador.style.display == "inline-block"){
        console.log(1);
    }
    else{
        let divmenu = document.getElementById('menu');
        divmenu.style.display = 'none';
        let asidemenu = document.getElementById('asidemenu');
        asidemenu.style.display = 'none'; 
    }   
}

function abrepublicador(){
    let publicador = document.getElementById('publi');
    publicador.style.display = 'inline-block';
    let divmenu = document.getElementById('menu');
    divmenu.style.display = 'none';

    let inptitulo = document.getElementById('inptitulo');
    let inpnoticia = document.getElementById('inpnoticia');
    inptitulo.value = '';
    inpnoticia.value = '';

}

function fechapublicador(){
    let publicador = document.getElementById('publi');
    publicador.style.display = 'none';
    let asidemenu = document.getElementById('asidemenu');
    asidemenu.style.display = 'none';
}

function verificasefecha(){
    let inptitulo = document.getElementById('inptitulo');
    let inpnoticia = document.getElementById('inpnoticia');
    let resp = confirm('você abandonará essa publicação');
    if(resp == true){
        fechapublicador();
    }
}

function publicar(){
    let inptitulo = document.getElementById('inptitulo');
    let inpnoticia = document.getElementById('inpnoticia');
    let mainnot = document.getElementById('mainnot');
    var h3n = document.createElement('h3');
    h3n.innerText = inptitulo.value;
    mainnot.appendChild(h3n);
    let divconteudo = document.createElement('div');
    divconteudo.innerText = inpnoticia.value;
    divconteudo.classList = 'conteudo'
    mainnot.appendChild(divconteudo);

    fechapublicador();
}