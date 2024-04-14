package EditordeTexto;
import java.awt.*;
import javax.swing.*;

public class EditorTexto extends JFrame{
    JPanel p = new JPanel();
    JButton a = new JButton("Abrir");
    JButton s = new JButton("Salvar");
    JButton sc = new JButton("Salvar como");
    JButton f = new JButton("Fechar");
    JTextArea textArea = new JTextArea(5, 20);
    
    EditorTexto(){
        p.setLayout(new GridLayout(4, 1));
        p.add(a);
        p.add(s);
        p.add(sc);
        p.add(f);

        add(p,BorderLayout.WEST);
        add(textArea, BorderLayout.EAST);

        pack();
        setVisible(true);
    }

    static public void main(String[] args){
        new EditorTexto();
    }
}
