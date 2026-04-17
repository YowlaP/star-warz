package starwars;

import java.awt.Color;

public class Sabre extends Arme {
    private Color couleur;

    public Sabre(Color couleur) {
        super(10);
        this.couleur = couleur;
    }

    public Color getCouleur() { return couleur; }
}