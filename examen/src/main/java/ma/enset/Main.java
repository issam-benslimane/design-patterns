package ma.enset;

import ma.enset.aspects.SecurityAspect;

public class Main {
    public static void main(String[] args) throws Exception {
        SecurityAspect.login("user", "1234");

        Dessin dessin = new Dessin();
        Parametrage parametrage = new Parametrage();

        Figure cercle = new Cercle(new Point(100, 100), 50);
        Figure rectangle = new Rectangle(new Point(200, 200), 80, 40);
        
        GroupeFigures groupe = new GroupeFigures();
        groupe.addFigure(cercle);
        groupe.addFigure(rectangle);

        dessin.addFigure(groupe);
        parametrage.addFigure(cercle);
        parametrage.addFigure(rectangle);

        parametrage.setEpaisseur(2);
        parametrage.setCouleurContour(1);
        parametrage.setCouleurRemplissage(3);

        dessin.afficher();
        dessin.serialiser("dessin.ser");

        SecurityAspect.logout();
    }
} 