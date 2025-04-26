import java.util.ArrayList;
import java.util.List;

public class Joueur {
    private int score;
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void setScore(int score) {
        this.score = score;
        notifyObservers();
    }

    private void notifyObservers() {
        for(Observer observer : observers) {
            observer.update(score);
        }
    }
} 