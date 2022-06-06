package jeu.donnees;

public class Coup {

    String unAttributPourQueLeJSONNeSoitPasVide = "";
    Joueur joueur;

    public Coup() {
        this("vide", null);
    }

    public Coup(String s, Joueur j) {
        setUnAttributPourQueLeJSONNeSoitPasVide(s);
        setJoueur(j);
    }

    public String getUnAttributPourQueLeJSONNeSoitPasVide() {
        return unAttributPourQueLeJSONNeSoitPasVide;
    }

    public void setUnAttributPourQueLeJSONNeSoitPasVide(String unAttributPourQueLeJSONNeSoitPasVide) {
        this.unAttributPourQueLeJSONNeSoitPasVide = unAttributPourQueLeJSONNeSoitPasVide;
    }

    public String toString() {
        return "["+ joueur.getName()+" joue : "+getUnAttributPourQueLeJSONNeSoitPasVide()+"]";
    }

    public void setJoueur(Joueur joueur) {
        this.joueur = joueur;
    }

    public Joueur getJoueur() {
        return joueur;
    }
}
