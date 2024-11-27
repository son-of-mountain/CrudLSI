package ma.fstt.service;

import ma.fstt.entities.LigneDeCommande;

import java.util.List;

public interface LigneDeCommandeRepository {
    void ajouterLigneDeCommande(LigneDeCommande ligneDeCommande);
    LigneDeCommande trouverLigneDeCommande(int id);
    List<LigneDeCommande> listerLigneDeCommandes();
    void supprimerLigneDeCommande(int id);

}
