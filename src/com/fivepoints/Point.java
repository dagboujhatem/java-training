package com.fivepoints;

public class Point {
    // Définition des champs
    private int x ; // abscisse
    private int y ; // ordonnee

    // Définition des méthodes
    public void initialise (int abs, int ord)
    {
        x = abs ;
        y = ord ;
    }
    public void deplace (int dx, int dy)
    { x += dx ;
        y += dy ;
    }
    public void affiche ()
    { System.out.println ("Je suis un point de coordonnees " + x + " " + y) ;
    }
}
