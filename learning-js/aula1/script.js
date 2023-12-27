function redirecionar() {
    // Obter o valor do input
    var numero = document.getElementById('numeroInput').value;

    // Verificar se o valor é 1 ou 2 e redirecionar para os URLs correspondentes
    if (numero === '1') {
        let li = 'https://www.youtube.com/@equacionamatematica/playlists';
        window.location.href = li;
    } else if (numero === '2') {
        window.location.href = 'https://pt.stackoverflow.com/questions/241203/como-alterar-o-href-de-um-link-de-forma-din%C3%A2mica';
    } else {
        alert('Por favor, digite apenas 1 ou 2.');
    }
}
