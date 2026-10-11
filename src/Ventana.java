import javax.swing.*;
import java.awt.*;

public class Ventana {

    //Objeto para llamar la lógica de los botones
    Logica logica = new Logica();

    //Creamos un constructor para inicializar en MAIN
    public Ventana() {
        //Ventana con título Calculadora
        JFrame frame = new JFrame("Calculadora");

        //Configuración de la ventana
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // ===============================
        // VISOR
        // ===============================
        JLabel visor = new JLabel("0", JLabel.RIGHT);
        //visor con fondo gris oscuro, texto blanco y margen interno (Padding)
        visor.setBackground(new Color(33,33,33));
        visor.setForeground(Color.WHITE);
        visor.setOpaque(true);          // sera util para el color de fondo
        visor.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(new Color(50,50,50), 1),
                BorderFactory.createEmptyBorder(15, 20,15,20)
        ));  // Combino un borde de línea gris con un borde vacío de 15 píxeles arriba/abajo y 20 a los lados
        visor.setFont(new Font("Arial", Font.BOLD, 30));

        // =============================
        // BOTONES
        // =============================
        JPanel panelBotones = new JPanel(new GridLayout(5, 4, 10, 10));
        Font fuenteBotones = new Font("Arial", Font.BOLD, 30);

        String[] textos = {"7", "8", "9", "+",
                            "4", "5", "6","-",
                            "1", "2", "3","*",
                            "C", "0", ".","/",
                            "=", "","",""};



        for (String texto : textos) {
            JButton boton = new JButton(texto);
            boton.setFocusable(false);
            boton.setBorder(BorderFactory.createLineBorder(new Color(60,60,60)));
            boton.setFont(fuenteBotones);

            //Diferenciar colores(Números vs Operadores)
            if("+-*/=".contains(texto)) {
                boton.setBackground(new Color(255, 149, 0));
                boton.setForeground(Color.WHITE);
            } else if(texto.equals("C")) {
                boton.setBackground(new Color(165,165,165)); //Gris claro para borrar
                boton.setForeground(Color.BLACK);
            } else {
                boton.setBackground(new Color(50,50,50)); //Gris oscuro para números
                boton.setForeground(Color.WHITE);
            }
            //Acción para que el boton escuche el clic
            boton.addActionListener(e -> {
                if(texto.equals("+") || texto.equals("-") ||texto.equals("*") || texto.equals("/")) {
                    visor.setText(logica.pulsarOperador(texto));
                } else if(texto.equals("C")) {
                    visor.setText(logica.limpiar());
                } else if(texto.equals("=")) {
                    //Aqui ira el metodo calcular más adelante
                    visor.setText(logica.calcular());
                } else {
                    visor.setText(logica.pulsarNumero(texto));
                }
            });
            panelBotones.add(boton);
        }

        // Añadimos al frame: visor arriba, botones al centro
        frame.add(visor, BorderLayout.NORTH);
        frame.add(panelBotones, BorderLayout.CENTER);

        frame.setVisible(true);
    }


}
