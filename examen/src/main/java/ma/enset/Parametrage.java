package ma.enset;

import java.util.ArrayList;
import java.util.List;

public class Parametrage {
    private int epaisseur;
    private int couleurContour;
    private int couleurRemplissage;
    private List<Figure> figures = new ArrayList<>();

    public void addFigure(Figure figure) {
        figures.add(figure);
    }

    public void setEpaisseur(int epaisseur) {
        this.epaisseur = epaisseur;
        notifyFigures();
    }

    public void setCouleurContour(int couleur) {
        this.couleurContour = couleur;
        notifyFigures();
    }

    public void setCouleurRemplissage(int couleur) {
        this.couleurRemplissage = couleur;
        notifyFigures();
    }

    private void notifyFigures() {
        for(Figure figure : figures) {
            figure.setEpaisseur(epaisseur);
            figure.setCouleurContour(couleurContour);
            figure.setCouleurRemplissage(couleurRemplissage);
        }
    }
} 