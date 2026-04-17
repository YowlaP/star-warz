package tp5;

public abstract class Personnage {
    private String nom;
    private int vie;
    private int x;
    private int y;
    private int vitesse;
    private int force;

    public Personnage(String nom, int vie, int x, int y, int vitesse, int force) {
        this.nom = nom;
        this.vie = vie;
        this.x = x;
        this.y = y;
        this.vitesse = vitesse;
        this.force = force;
    }

    // Déplacement fourni dans le sujet
    public void seDeplacer(int dx, int dy, int dt) {
        double norme = Math.sqrt(dx * dx + dy * dy);
        if (norme != 0) {
            this.x += dx * vitesse * dt / norme;
            this.y += dy * vitesse * dt / norme;
        }
    }

    // Blessure : points de vie diminués de (puissance_arme * force_attaquant)
    public void estBlesse(Arme a, Personnage p) {
        int degats = a.getPuissance() * p.getForce();
        this.vie -= degats;
        if (this.vie < 0) this.vie = 0;
        System.out.println(this.parler() + " - Je suis blessé (vie = " + this.vie + ")");
    }

    // Méthodes abstraites
    public abstract String parler();
    public abstract void attaquer(Personnage cible);

    // Getters
    public String getNom() { return nom; }
    public int getVie() { return vie; }
    public void setVie(int vie) { this.vie = vie; }
    public int getX() { return x; }
    public int getY() { return y; }
    public int getVitesse() { return vitesse; }
    public int getForce() { return force; }

    @Override
    public String toString() {
        return parler() + " - [vie=" + vie + ", x=" + x + ", y=" + y +
               ", vitesse=" + vitesse + ", force=" + force + "]";
    }
}