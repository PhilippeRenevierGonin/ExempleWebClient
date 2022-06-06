package jeu.joueur;

import jeu.donnees.Coup;
import jeu.donnees.EtatDuJeu;

import java.security.SecureRandom;
import java.util.Random;

public class JoueurConcret extends jeu.donnees.Joueur {
    Random rand = new SecureRandom();


    public JoueurConcret(String name) {
        super();
        setName(name);
    }

    public Coup jouer(EtatDuJeu etat) {
        int val = rand.nextInt(100);
        System.out.println(getName()+"> je joue "+val);
        return new Coup("valeur aléatoire "+val, this);
    }


}
