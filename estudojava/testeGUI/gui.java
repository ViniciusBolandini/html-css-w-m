package testeGUI;
import java.awt.*;
import javax.swing.*;

import javax.swing.WindowConstants;

public class gui extends Frame{
        Button b1 = new Button("botao 1 ");
        Button b2 = new Button("botao 2 ");

        gui(){
                super("dois botoes");
                setLayout(new GridLayout(1,2));
                add(b1);
                add(b2);
                pack();
                setVisible(true);
                setSize(400, 400);
        }
    static public void main(String[] args) {
        new gui();
        }
}
