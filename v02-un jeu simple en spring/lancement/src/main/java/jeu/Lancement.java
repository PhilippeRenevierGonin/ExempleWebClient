package jeu;

import jeu.joueur.JoueurConcret;
import jeu.moteur.Partie;
import org.springframework.stereotype.Component;

@Component
public class Lancement {

    public void demarrer() {
        Partie p = new Partie();
        JoueurConcret j1 = new JoueurConcret("Mic");
        JoueurConcret j2 = new JoueurConcret("Hel");
        p.addJoueur(j1);
        p.addJoueur(j2);
        p.demarrer();

    }
}
