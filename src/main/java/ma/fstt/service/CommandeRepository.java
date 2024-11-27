package ma.fstt.service;

import ma.fstt.entities.Commande;

import java.util.List;

public interface CommandeRepository {
    void ajouterCommande(Commande commande) ;
    void supprimerCommande(int id) ;
    Commande trouverCommande(int id);
    List<Commande> listerCommandes() ;
}
