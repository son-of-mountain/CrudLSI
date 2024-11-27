package ma.fstt.service;

import ma.fstt.entities.Produit;

import java.util.List;

public interface ProduitRepository {
    void ajouterProduit(Produit produit);
    Produit trouverProduit(int id);
    List<Produit> listerProduits();
    void supprimerProduit(int id);
}
