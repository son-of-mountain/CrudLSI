package ma.fstt.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import ma.fstt.entities.LigneDeCommande;
import ma.fstt.service.LigneDeCommandeRepository;

import java.util.List;

public class LigneDeCommandeDAO implements LigneDeCommandeRepository {
    // il faut d'abord ajouter l'uzine des entites

    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("gestionCommandesPU");
    private EntityManager em = emf.createEntityManager();

    @Override
    public void ajouterLigneDeCommande(LigneDeCommande ligneDeCommande) {
        em.getTransaction().begin();
        em.persist(ligneDeCommande);
        em.getTransaction().commit();
    }

    @Override
    public LigneDeCommande trouverLigneDeCommande(int id) {
        return em.find(LigneDeCommande.class, id);
    }

    @Override
    public List<LigneDeCommande> listerLigneDeCommandes() {
        return em.createQuery("select lc from LigneDeCommande lc",LigneDeCommande.class).getResultList();
    }


    @Override
    public void supprimerLigneDeCommande(int id) {
        em.getTransaction().begin();
        LigneDeCommande ligneDeCommande = em.find(LigneDeCommande.class, id);
        if(ligneDeCommande != null){
            em.remove(ligneDeCommande);
        }
        em.getTransaction().commit();

    }

}
