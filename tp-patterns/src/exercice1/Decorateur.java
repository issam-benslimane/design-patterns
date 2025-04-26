public abstract class Decorateur implements Composant {
    protected Composant composant;

    public Decorateur(Composant composant) {
        this.composant = composant;
    }

    public void traitement() {
        composant.traitement();
    }
} 