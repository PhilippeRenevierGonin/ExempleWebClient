package jeu;


import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.ArrayList;

@Component
public class Appariement {

    /// appariement ne fait plus de requete... plus besoin de webclient ni de builder (en tout cas en l'état)

    private ArrayList<String> parties = new ArrayList<>();
    private ArrayList<String> joueurs = new ArrayList<>();

    public Appariement() {
    }

    public String addJoueur(String urlJ) {
        joueurs.add(urlJ);
        if (parties.size() > 0) return parties.get(0); // ici gestion des parties à améliorer
        else return "";
    }


    public String[] addPartie(String partieUrl) {
        parties.add(partieUrl);
        if (joueurs.size() > 0) return joueurs.toArray(new String[joueurs.size()]); // ici gestion des joueurs à améliorer
        else return null;
    }
}
