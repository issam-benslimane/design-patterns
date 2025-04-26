public class Rectangle implements Figure {
    private double largeur;
    private double hauteur;

    public Rectangle(double largeur, double hauteur) {
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    public void dessiner() {
    }

    public double calculerSurface() {
        return largeur * hauteur;
    }
} 