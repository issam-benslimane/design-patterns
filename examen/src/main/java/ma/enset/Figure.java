package ma.enset;

public interface Figure {
    double calculerPerimetre();
    double calculerSurface();
    void dessiner();
    void setEpaisseur(int epaisseur);
    void setCouleurContour(int couleur);
    void setCouleurRemplissage(int couleur);
} 