function abrirmenu(){
    let divmenu = document.getElementById('menu');
    divmenu.style.display = 'inline-block';
    let asidemenu = document.getElementById('asidemenu');
    asidemenu.style.display = 'inline-block';
}

function escondemenu(){
    let publicador = document.getElementById('publi');

    if(publicador.style.display == 'none'){
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
}