package com.fivepoints;

public class Main {
    public static void main(String[] args) {
        Point a ; // déclaration d'un variable de type Point

        a = new Point(); // crée d’un objet de type Point et place sa référence dans a

        a.initialise (3, 5) ;  // appelle la méthode initialise() du type Point
                                        // en l’appliquant à l’objet de référence a, et
                                        // en lui transmettant les arguments 3 et 5

        // affichage du Point a à travers la méthode affiche
        a.affiche() ;
    }
}
