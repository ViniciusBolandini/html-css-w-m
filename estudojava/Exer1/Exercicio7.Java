import java.util.Scanner;
public class Exercicio7{
    public static void main(String[] args){
        Aluno aluno = new Aluno();
        aluno.apresentaAluno();
        aluno.trocaTelefone();
        aluno.apresentaAluno();
    }
}

class Pessoa{
    private String nome;
    private String endereço;
    private String telefone;

    public Pessoa(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        nome = scan.nextLine();

        System.out.print("Digite seu telefone: ");
        telefone = scan.nextLine();

        System.out.print("Digite seu endereço: ");
        endereço = scan.nextLine();
    }

    public void apresentaPessoa(){
        System.out.println("Nome: " + nome);
        System.out.println("telefone: " + telefone);
        System.out.println("endereço: " + endereço);
    }

    public void trocaNome(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite novo nome: ");
        nome = scan.nextLine();
    }

    public void trocaEndereco(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite novo endereço: ");
        endereço = scan.nextLine();
    }

    public void trocaTelefone(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite novo Telefone: ");
        telefone = scan.nextLine();
    }
}

class Aluno extends Pessoa {
    private String ra;
    public Aluno(){
        super();
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite seu RA: ");
        ra = scan.nextLine();
    }

    public void apresentaAluno(){
        super.apresentaPessoa();
        System.out.println("RA: " + ra);
    }

    public void trocaRaAluno(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite novo Ra: ");
        ra = scan.nextLine();
    }
}