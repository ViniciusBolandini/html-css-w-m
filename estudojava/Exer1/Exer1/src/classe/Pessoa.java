package classe;
import java.util.Scanner;
public class Pessoa {
        private String nome;
        private String endereco;
        private int telefone;

        public void Pessoa(){

            System.out.println("digite o Nome: ");
            Scanner scanner = new Scanner(System.in);
            nome = scanner.nextLine();
            
            System.out.println("digite o endereço: ");
            endereco = scanner.nextLine();
            
            System.out.println("digite o telefone: ");
            telefone = scanner.nextInt();

            scanner.close();
        }

        public void identificaPessoa(){

            System.out.println("-----------------PESSOA----------------");
            System.out.println("Nome: " + nome);
            System.out.println("Endereço: " + endereco);
            System.out.println("Telefone: " + telefone);
        }

        public void mudarNome(String nomeNovo){
            nome = nomeNovo;
        }

        public void mudarEndereco(String enderecoNovo){
            nome = enderecoNovo;
        }

        public void mudarTelefone(String telefoneNovo){
            nome = telefoneNovo;
        }


}
