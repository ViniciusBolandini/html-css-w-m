import classe.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        Pessoa pessoa = new Pessoa();
        pessoa.Pessoa();
        pessoa.identificaPessoa();

        pessoa.mudarNome("Vinicius");

        pessoa.identificaPessoa();
    }
}
