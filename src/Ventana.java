import javax.swing.*;
import java.awt.*;

public class Ventana {

    //Creamos un constructor para inicializar en MAIN
    public Ventana() {
        //Ventana con título Calculadora
        JFrame frame = new JFrame("Calculadora");

        //Configuración del frame
        frame.setSize(500, 500);
        frame.setLayout(new FlowLayout());

        //Declaramos botones
        JButton button1 = new JButton("1");
        JButton button2 = new JButton("2");
        JButton button3 = new JButton("3");
        JButton button4 = new JButton("4");
        JButton button5 = new JButton("5");
        JButton button6 = new JButton("6");
        JButton button7 = new JButton("7");
        JButton button8 = new JButton("8");
        JButton button9 = new JButton("9");
        JButton button0 = new JButton("0");

        //Añadimos su tamaño de boton y fuente
        button1.setFont(new Font("Arial", Font.BOLD, 30));
        button2.setFont(new Font("Arial", Font.BOLD, 30));
        button3.setFont(new Font("Arial", Font.BOLD, 30));
        button4.setFont(new Font("Arial", Font.BOLD, 30));
        button5.setFont(new Font("Arial", Font.BOLD, 30));
        button6.setFont(new Font("Arial", Font.BOLD, 30));
        button7.setFont(new Font("Arial", Font.BOLD, 30));
        button8.setFont(new Font("Arial", Font.BOLD, 30));
        button9.setFont(new Font("Arial", Font.BOLD, 30));
        button0.setFont(new Font("Arial", Font.BOLD, 30));


        //Añadimos los botones con frame
        frame.add(button1); frame.add(button2); frame.add(button3);
        frame.add(button4); frame.add(button5); frame.add(button6);
        frame.add(button7); frame.add(button8); frame.add(button9);
        frame.add(button0);


        //Establecemeos GriLayout por defecto por el momento
        frame.setLayout(new GridLayout(4, 3, 10,5));


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }


}
