package ma.enset;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Dessin implements Serializable {
    private List<Figure> figures = new ArrayList<>();
    private TraitementStrategy traitementStrategy;

    public void addFigure(Figure figure) {
        figures.add(figure);
    }

    public void removeFigure(Figure figure) {
        figures.remove(figure);
    }

    public void afficher() {
        for(Figure figure : figures) {
            figure.dessiner();
        }
    }

    public void setTraitementStrategy(TraitementStrategy strategy) {
        this.traitementStrategy = strategy;
    }

    public void traiter() {
        if(traitementStrategy != null) {
            traitementStrategy.traiter(this);
        }
    }

    public void serialiser(String fileName) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName));
        oos.writeObject(this);
        oos.close();
    }

    public List<Figure> getFigures() {
        return figures;
    }
} 