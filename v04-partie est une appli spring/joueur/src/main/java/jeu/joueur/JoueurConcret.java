package jeu.joueur;

import jeu.donnees.Coup;
import jeu.donnees.EtatDuJeu;
import org.springframework.stereotype.Component;

import java.security.SecureRandom;
import java.util.Random;

@Component
public class JoueurConcret extends jeu.donnees.Joueur {
    Random rand = new SecureRandom();

    public JoueurConcret() {
        setName("sans nom");
    }


    public Coup jouer(EtatDuJeu etat) {
        int val = rand.nextInt(100);
        System.out.println(getName()+"> je joue "+val);
        return new Coup("valeur aléatoire "+val, this);
    }


}
