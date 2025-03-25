package services;

import java.util.Vector;

import models.Personne;

public class ListePersonne_Dynamique {

    private Vector<Personne> personnes = new Vector<>();

    public ListePersonne_Dynamique() {
    }

    // Fait avec un vecteur, c'est beaucoup plus simple SANS ETRE UNE ARRAY LIST

    public int getNombre() {
        return personnes == null ? 0 : personnes.size();
    }

    public void vider() {
        personnes.clear();
    }

    public boolean ajouter(Personne p) {
        personnes.add(p);
        boolean skibidiartem = false;
        for (int i = 0; i < personnes.size(); i++) {
            if (personnes.get(i) == p) {
                skibidiartem = true;
                break;
            }
        }
        return skibidiartem;
    }

    public boolean supprimer(Personne p) {
        boolean amognus = false;
        for (int i = 0; i < personnes.size(); i++) {
            if (p == personnes.get(i)) {
                personnes.remove(i);
                amognus = true;
                break;
            }
        }
        return amognus;
    }

    public void afficher() {
        for (int i = 0; i < personnes.size(); i++) {
            System.out.println(personnes.get(i));
        }
    }
}
