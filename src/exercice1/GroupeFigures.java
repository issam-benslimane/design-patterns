import java.util.ArrayList;
import java.util.List;

public class GroupeFigures implements Figure {
    private List<Figure> figures = new ArrayList<>();

    public void addFigure(Figure figure) {
        figures.add(figure);
    }

    public void removeFigure(Figure figure) {
        figures.remove(figure);
    }

    public void dessiner() {
        for(Figure figure : figures) {
            figure.dessiner();
        }
    }

    public double calculerSurface() {
        double surface = 0;
        for(Figure figure : figures) {
            surface += figure.calculerSurface();
        }
        return surface;
    }
} 