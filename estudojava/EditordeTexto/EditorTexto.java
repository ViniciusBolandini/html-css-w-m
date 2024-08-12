package EditordeTexto;
import java.awt.*;
import java.awt.event.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.*;

public class EditorTexto extends JFrame{
    String nomeArq;
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

         sc.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Ação a ser executada quando o botão for clicado
                 nomeArq = JOptionPane.showInputDialog(null, "Digite o nome do arquivo:");
                if(nomeArq != null){
                    String txt = textArea.getText();
                    try{
                        FileOutputStream out = new FileOutputStream(nomeArq);
                        out.write(txt.getBytes());
                        out.close();
                    }
                    catch(IOException ex){
                        JOptionPane.showMessageDialog(null, "Erro ao salvar o arquivo: " + ex.getMessage());
                    }
                }
            }
        });

        a.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Ação a ser executada quando o botão for clicado
                 nomeArq = JOptionPane.showInputDialog(null, "Digite o nome do arquivo:");
                if(nomeArq != null){
                    StringBuffer txt = new StringBuffer();
                    try{
                        FileInputStream in = new FileInputStream(nomeArq);
                        Scanner sin = new Scanner(in);
                        while (sin.hasNextLine()) {
                        txt.append(sin.nextLine());
                        txt.append("\n");
                        }
                        String txtstring = txt.toString();
                        textArea.setText(txtstring);
                        in.close();
                        sin.close();
                    }
                    catch(IOException ex){
                        JOptionPane.showMessageDialog(null, "Erro ao salvar o arquivo: " + ex.getMessage());
                    }
                }
            }
        });

        f.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                System.exit(0);
            }
        });


        add(p,BorderLayout.WEST);
        add(textArea, BorderLayout.EAST);

        pack();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    static public void main(String[] args){
        new EditorTexto();
    }
}
