package starwars;

import java.awt.Color;

public class TestTP5b {
    public static void main(String[] args) {
        // Reprise du scénario TestTP4b1
        Jedi yoda = new Jedi("Maitre Yoda", 0, 0, Color.GREEN, 120);
        System.out.println(yoda);
        yoda.allumerSabre();
        yoda.seDeplacer(3, 4, 2);
        System.out.println("Jedi Maitre Yoda - Que la force soit avec vous - Je me suis déplacé de (3; 4) pendant 2");
        System.out.println(yoda);

        Soldat ryan = new Soldat("Ryan", 20, 32);
        System.out.println(ryan);
        ryan.allumerBlaster();
        ryan.attaquer(yoda);
        System.out.println(ryan);

        // d) Dark Vador - côté obscur, force 43
        CoteObscur vador = new CoteObscur("Dark Vador", 0, 0, 43);
        System.out.println(vador);

        // e) Luc Skywalker - côté lumineux, force 31
        CoteLumineux luc = new CoteLumineux("Luc Skywalker", 0, 0, Color.BLUE, 31);
        System.out.println(luc);

        // f) Vador tue Luc (force 43 > 31, Luc est de force inférieure)
        vador.allumerSabre();
        vador.attaquer(luc);

        System.out.println(vador);
        System.out.println(luc);
    }
}
