package tp5;

import java.awt.Color;

public class CoteObscur extends Jedi {

    public CoteObscur(String nom, int x, int y, int force) {
        super(nom, x, y, Color.RED, force);
    }

    @Override
    public String parler() {
        return "CoteObscur - " + getNom();
    }

    // Tue la cible si sa force est strictement inférieure ET qu'on a plus de 10 pv
    @Override
    public void attaquer(Personnage cible) {
        if (this.getVie() > 10 && cible.getForce() < this.getForce()) {
            cible.setVie(0);
            System.out.println(cible.parler() + " Je suis mort (vie = 0)");
        } else {
            super.attaquer(cible);
        }
    }
}