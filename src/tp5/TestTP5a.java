package tp5;

import java.awt.Color;

public class TestTP5a {
    public static void main(String[] args) {
        // a) Créer Maître Yoda
        Jedi yoda = new Jedi("Maitre Yoda", 43, 52, Color.GREEN, 120);
        System.out.println(yoda);

        // b) Yoda parle et allume son sabre
        yoda.allumerSabre();

        // Déplacement
        yoda.seDeplacer(3, 4, 2);
        System.out.println(parlerDeplacementMsg(yoda, 3, 4, 2));
        System.out.println(yoda);

        // c) Créer Jango Fett et le faire tirer sur Yoda
        Soldat jango = new Soldat("Jango Fett", 20, 32);
        System.out.println(jango);
        jango.allumerBlaster();
        jango.attaquer(yoda);
        System.out.println(jango);
    }

    // Affiche le message de déplacement selon la trace attendue
    static String parlerDeplacementMsg(Personnage p, int dx, int dy, int dt) {
        return p.parler() + " - Je me suis déplacé de (" + dx + "; " + dy + ") pendant " + dt;
    }
}