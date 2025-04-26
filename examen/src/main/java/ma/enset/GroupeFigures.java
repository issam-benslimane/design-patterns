package ma.enset;

import java.util.ArrayList;
import java.util.List;

public class GroupeFigures implements Figure {
    private List<Figure> figures = new ArrayList<>();
    private int epaisseur;
    private int couleurContour;
    private int couleurRemplissage;

    public void addFigure(Figure figure) {
        figures.add(figure);
    }

    public void removeFigure(Figure figure) {
        figures.remove(figure);
    }

    public double calculerPerimetre() {
        double perimetre = 0;
        for(Figure figure : figures) {
            perimetre += figure.calculerPerimetre();
        }
        return perimetre;
    }

    public double calculerSurface() {
        double surface = 0;
        for(Figure figure : figures) {
            surface += figure.calculerSurface();
        }
        return surface;
    }

    public void dessiner() {
        for(Figure figure : figures) {
            figure.dessiner();
        }
    }

    public void setEpaisseur(int epaisseur) {
        this.epaisseur = epaisseur;
        for(Figure figure : figures) {
            figure.setEpaisseur(epaisseur);
        }
    }

    public void setCouleurContour(int couleur) {
        this.couleurContour = couleur;
        for(Figure figure : figures) {
            figure.setCouleurContour(couleur);
        }
    }

    public void setCouleurRemplissage(int couleur) {
        this.couleurRemplissage = couleur;
        for(Figure figure : figures) {
            figure.setCouleurRemplissage(couleur);
        }
    }
} 