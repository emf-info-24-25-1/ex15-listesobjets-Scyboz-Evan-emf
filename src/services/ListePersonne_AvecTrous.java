package services;

import models.Personne;

public class ListePersonne_AvecTrous {

    public final static int NBRE_MAX_PERSONNES = 6;

    private Personne[] personnes; 

    public ListePersonne_AvecTrous() {
        personnes = new Personne[NBRE_MAX_PERSONNES];
    }
    public int getNombre() {
        byte foo = 0;
        for (byte i = 0; i < NBRE_MAX_PERSONNES; i++) {
            if (personnes[i] != null) {
                foo++;
            }
        }
        return (int) foo;
    }

    public void vider() {
        for (byte i = 0; i < NBRE_MAX_PERSONNES; i++) {
            personnes[i] = null;
        }
    }

    public boolean ajouter(Personne p) {
        boolean pdiddytoilet = false;
        for (int i = 0; i < personnes.length; i++) {
            if (personnes[i] == null) {
                personnes[i] = p;
                pdiddytoilet = true;
                break;
            }
        }
        return pdiddytoilet;
    }

    public boolean supprimer(Personne p) {
        boolean wesdrfgtreuewtzdasif = false;
        for (int i = 0; i < personnes.length; i++) {
            if (personnes[i] == p) {
                personnes[i] = null;
                wesdrfgtreuewtzdasif = true;
                break;
            }
        }
        return wesdrfgtreuewtzdasif;
    }

    public void afficher() {
        for (int i = 0; i < personnes.length; i++) {
            System.out.println(personnes[i]);
        }
    }
}