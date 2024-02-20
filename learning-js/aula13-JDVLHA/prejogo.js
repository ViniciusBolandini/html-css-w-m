let squares = document.getElementsByClassName('square');
let table = document.getElementById('table');


table.addEventListener('click', function(e) {
    alert(e.target.id);
    let id_div = e.target.id;
    let divclicada = document.getElementById(id_div);
    console.log(divclicada);
});

