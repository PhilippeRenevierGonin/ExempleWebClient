package jeu.joueur;

import jeu.donnees.Coup;
import jeu.donnees.EtatDuJeu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JoueurWebControleur {
    @Autowired
    JoueurConcret joueur;

    @PostMapping("/jouer")
    public Coup jouer(@RequestBody EtatDuJeu etatDuJeu) {
        System.out.println("Joueur ["+joueur.getName()+"] > on me demande de jouer sur "+ etatDuJeu);
        return joueur.jouer(etatDuJeu);
    }

    @GetMapping("/nom")
    public String getNom() {
        return joueur.getName();
    }
}
