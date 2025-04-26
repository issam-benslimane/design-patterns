package ma.enset;

public class Cercle implements Figure {
    private Point centre;
    private double rayon;
    private int epaisseur;
    private int couleurContour;
    private int couleurRemplissage;

    public Cercle(Point centre, double rayon) {
        this.centre = centre;
        this.rayon = rayon;
    }

    public double calculerPerimetre() {
        return 2 * Math.PI * rayon;
    }

    public double calculerSurface() {
        return Math.PI * rayon * rayon;
    }

    public void dessiner() {
        System.out.println("Cercle: centre(" + centre.getX() + "," + centre.getY() + "), rayon=" + rayon);
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