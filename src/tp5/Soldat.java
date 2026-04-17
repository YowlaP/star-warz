package tp5;

public class Soldat extends Personnage {
    private Blaster blaster;

    public Soldat(String nom, int x, int y) {
        super(nom, 100, x, y, 4, 2);
        this.blaster = new Blaster();
    }

    public void allumerBlaster() { blaster.allumer(); }
    public void eteindreBlaster() { blaster.eteindre(); }

    @Override
    public String parler() {
        return "Soldat - " + getNom();
    }

    @Override
    public void attaquer(Personnage cible) {
        if (blaster.isAllume()) {
            System.out.println(parler() + " - Je donne un coup de blaster!!!");
            cible.estBlesse(blaster, this);
        } else {
            System.out.println(parler() + " - Mon blaster est éteint !");
        }
    }
}
