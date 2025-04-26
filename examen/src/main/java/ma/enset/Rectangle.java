package ma.enset;

public class Rectangle implements Figure {
    private Point coinSuperieurGauche;
    private double largeur;
    private double hauteur;
    private int epaisseur;
    private int couleurContour;
    private int couleurRemplissage;

    public Rectangle(Point coinSuperieurGauche, double largeur, double hauteur) {
        this.coinSuperieurGauche = coinSuperieurGauche;
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    public double calculerPerimetre() {
        return 2 * (largeur + hauteur);
    }

    public double calculerSurface() {
        return largeur * hauteur;
    }

    public void dessiner() {
        System.out.println("Rectangle: point(" + coinSuperieurGauche.getX() + "," + coinSuperieurGauche.getY() + "), largeur=" + largeur + ", hauteur=" + hauteur);
    }

    public void setEpaisseur(int epaisseur) {
        this.epaisseur = epaisseur;
    }

    public void setCouleurContour(int couleur) {
        this.couleurContour = couleur;
    }

    public void setCouleurRemplissage(int couleur) {
        this.couleurRemplissage = couleur;
    }
} 