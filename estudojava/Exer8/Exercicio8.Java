import java.util.Scanner;

interface MostraDados {
     void mostra(int l);
     void mostra(float f);
}

class Mostra implements MostraDados {
    
    public void mostra(int l){
        System.out.println("inteiro:" + l);
    }
    
    public void mostra(float f){
        System.out.println("Float: " + f);
    }
}

public class Exercicio8{
    static int valor = 123;
    static float x = 4.56f;

    static void mostraValores(MostraDados db) {
        db.mostra(x);
        db.mostra(valor);
        }

    public static void main(String []s) {
        Mostra mostra = new Mostra();
        mostraValores(mostra);
        }
}
