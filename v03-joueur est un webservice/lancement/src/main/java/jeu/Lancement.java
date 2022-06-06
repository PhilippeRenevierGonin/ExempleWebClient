package jeu;

import jeu.donnees.Joueur;
import jeu.moteur.Partie;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

@Component
public class Lancement {


    private final WebClient.Builder webClientBuilder;

    public Lancement(WebClient.Builder builder) {
        this.webClientBuilder = builder;
    }

    Partie p ;
    public void preparerDemarrage() {
        p = new Partie();

    }

    public void rechercherJoueur(String url) {
        Joueur j = new JoueurProxy(url, webClientBuilder.baseUrl(url).build());
        p.addJoueur(j);
    }

    public void demarrer() {
        p.demarrer();
    }
}
