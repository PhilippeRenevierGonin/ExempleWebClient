package jeu.joueur;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JoueurApplication {

    public static void main(String[] args) {
        // les traces sont là juste pour montrer le déroulement et le lancement
        SpringApplication.run(JoueurApplication.class, args);
    }

    @Bean
    public CommandLineRunner scriptLancement(JoueurConcret joueur) {
        return args -> {
            String name = "nom par defaut";
            if (args.length > 0) name = args[0];
            joueur.setName(name);
            // pas de fin car il n'y a un webserveur de lancer
        };
    }

}
