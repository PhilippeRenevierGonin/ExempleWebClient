package jeu.moteur;

import jeu.donnees.Coup;
import jeu.donnees.EtatDuJeu;
import jeu.donnees.Joueur;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

public class JoueurProxy extends Joueur {


    private WebClient webClient;

    public JoueurProxy(String url, WebClient webClient) {
        setWebClient(webClient);
        String name = webClient.get().uri("/nom")
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToMono(String.class)
                .block();
        setName(name);
    }

    public Coup jouer(EtatDuJeu etat) {
        return webClient.post().uri("/jouer")
                .accept(MediaType.APPLICATION_JSON)
                .body(Mono.just(etat), EtatDuJeu.class)
                .retrieve()
                .bodyToMono(Coup.class)
                .block();
    }

    public void setWebClient(WebClient webClient) {
        this.webClient = webClient;
    }

    public WebClient getWebClient() {
        return webClient;
    }
}
