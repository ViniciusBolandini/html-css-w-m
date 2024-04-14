package AulaEventListener;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;



public class Botao extends JFrame {
    JButton b = new JButton("ok");
    JPanel p = new JPanel(new FlowLayout());
    JTextField tf = new JTextField(20);
    JLabel lb = new JLabel();
    Font fonte = new Font("Arial", Font.PLAIN, 20);
    Botao(){
        super("listeners");
        lb.setFont(fonte);
        b.setBackground(Color.RED);
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                System.out.println("clicou");
                p.setBackground(Color.LIGHT_GRAY);
                 String t = tf.getText();
                 lb.setText(t);
            }
        });
        
        p.add(b);
        p.add(tf);
        p.add(lb);
        add(p);
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(400,400);
    }

    static public void main(String[] args){
        new Botao();
    }
}
