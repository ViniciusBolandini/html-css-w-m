package Calculadora;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.*;
public class Calc extends JFrame{
    JPanel p1 = new JPanel();
    JPanel p2 = new JPanel(new GridLayout(4,1));
    JPanel p3 = new JPanel();
    JPanel p4 = new JPanel();
    

    JButton btn = new JButton("Calcular");

    JComboBox<String> b = new JComboBox<>();

    JTextField t1 = new JTextField();
    JTextField t2 = new JTextField();
    

    JLabel lb1 = new JLabel("    0");

    Calc(){
        b.addItem("soma");
        b.addItem("subtrai");
        b.addItem("multiplica");
        b.addItem("divide");

        p1.add(t1);
        p2.add(b);
        p3.add(t2);
        p3.add(lb1);

        t1.setColumns(20);
        t2.setColumns(20);

        p4.setLayout(new BorderLayout());
        p4.add(p1,BorderLayout.WEST);
        p4.add(p2,BorderLayout.CENTER);
        p4.add(p3,BorderLayout.EAST);

        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String opcaoSelecionada = (String) b.getSelectedItem();
                System.out.println("Opção selecionada: " + opcaoSelecionada);

                float valor1;
                float valor2;
                float resultado;

                switch (opcaoSelecionada) {
                    case "soma":
                    valor1 = Float.parseFloat(t1.getText());
                    valor2 = Float.parseFloat(t2.getText());
                    resultado = valor1 + valor2;
                    lb1.setText(Float.toString(resultado));
                        break;
                    case "subtrai":
                        valor1 = Float.parseFloat(t1.getText());
                        valor2 = Float.parseFloat(t2.getText());
                        resultado = valor1 - valor2;
                        lb1.setText(Float.toString(resultado));
                        break;
                    case "multiplica":
                        valor1 = Float.parseFloat(t1.getText());
                        valor2 = Float.parseFloat(t2.getText());
                        resultado = valor1 * valor2;
                        lb1.setText(Float.toString(resultado));
                        break;
                    case "divide":
                        valor1 = Float.parseFloat(t1.getText());
                        valor2 = Float.parseFloat(t2.getText());
                        if(valor2 != 0){
                        resultado = valor1 / valor2;
                        lb1.setText(Float.toString(resultado));
                        break;
                        }
                        
                        lb1.setText("Divisão por 0");
                        break;
                
                    default:
                        break;
                }
            }
        });

        setLayout(new GridLayout(2,1));
        add(p4);
        add(btn);
        pack();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    static public void main(String[] args){
        new Calc();
    }
}
