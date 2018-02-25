package royal_gym;

// método principal

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ClasePrincipal {
    public static void main(String[] args) {
    GUI_Principal ventana = new GUI_Principal();
    ventana.setVisible(true);
    ventana.setLocationRelativeTo(null);
    ventana.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }   
}