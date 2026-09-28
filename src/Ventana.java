import javax.swing.*;
import java.awt.*;

public class Ventana {

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
        visor.setBackground(Color.white);
        visor.setOpaque(true);          // sera util para el color de fondo
        visor.setBorder(BorderFactory.createLineBorder(Color.BLACK));  // Agregar bordes al visor
        visor.setFont(new Font("Arial", Font.BOLD, 30));

        // =============================
        // BOTONES
        // =============================
        JPanel panelBotones = new JPanel(new GridLayout(4, 3, 10, 10));
        Font fuenteBotones = new Font("Arial", Font.BOLD, 30);

        String[] textos = {"7", "8", "9",
                "4", "5", "6",
                "1", "2", "3",
                "C", "0", "="};

        for (String texto : textos) {
            JButton boton = new JButton(texto);
            boton.setFont(fuenteBotones);
            panelBotones.add(boton);
        }

        // Añadimos al frame: visor arriba, botones al centro
        frame.add(visor, BorderLayout.NORTH);
        frame.add(panelBotones, BorderLayout.CENTER);

        frame.setVisible(true);
    }


}
