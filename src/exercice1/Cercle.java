public class Cercle implements Figure {
    private double rayon;

    public Cercle(double rayon) {
        this.rayon = rayon;
    }

    public void dessiner() {
    }

    public double calculerSurface() {
        return Math.PI * rayon * rayon;
    }
} 