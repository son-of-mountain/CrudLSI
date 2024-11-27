package ma.fstt.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import ma.fstt.entities.Produit;
import ma.fstt.service.ProduitRepository;

import java.util.List;

public class ProduitDAO implements ProduitRepository {

    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("gestionCommandesPU");
    private EntityManager em = emf.createEntityManager();

    @Override
    public void ajouterProduit(Produit produit){
        em.getTransaction().begin();
        em.persist(produit);
        em.getTransaction().commit();
    }

    @Override
    public Produit trouverProduit(int id){
        return em.find(Produit.class, id);
    }

    @Override
    public List<Produit> listerProduits(){
        return em.createQuery("select p from Produit p",Produit.class).getResultList();
    }

    @Override
    public void supprimerProduit(int id){
        em.getTransaction().begin();
        Produit produit = em.find(Produit.class, id);
        if(produit != null){
            em.remove(produit);
        }
        em.getTransaction().commit();
    }
}