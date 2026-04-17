package starwars;

import java.awt.Color;

public class Jedi extends Personnage {
    private Sabre sabre;

    public Jedi(String nom, int x, int y, Color couleurSabre, int force) {
        super(nom, 100, x, y, 5, force);
        this.sabre = new Sabre(couleurSabre);
    }

    public void allumerSabre() {
        sabre.allumer();
        System.out.println(parler() + " - J'allume mon sabre !");
    }

    public void eteindreSabre() {
        sabre.eteindre();
    }

    @Override
    public String parler() {
        return "Jedi " + getNom() + " - Que la force soit avec vous";
    }

    @Override
    public void attaquer(Personnage cible) {
        if (sabre.isAllume()) {
            System.out.println(parler() + " - Je donne un coup de sabre !");
            cible.estBlesse(sabre, this);
        } else {
            System.out.println(parler() + " - Mon sabre est éteint, je ne peux pas attaquer !");
        }
    }
}