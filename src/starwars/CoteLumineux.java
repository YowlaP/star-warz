package starwars;

import java.awt.Color;

public class CoteLumineux extends Jedi {

    public CoteLumineux(String nom, int x, int y, Color couleurSabre, int force) {
        super(nom, x, y, couleurSabre, force);
    }

    @Override
    public String parler() {
        return "CoteLumineux - " + getNom();
    }

    // Ne tue que si la cible est du côté obscur ET de force strictement inférieure
    // ET qu'on a plus de 10 pv
    @Override
    public void attaquer(Personnage cible) {
        if (this.getVie() > 10 && cible instanceof CoteObscur && cible.getForce() < this.getForce()) {
            cible.setVie(0);
            System.out.println(cible.parler() + " Je suis mort (vie = 0)");
        } else {
            super.attaquer(cible);
        }
    }
}
