package ma.fstt.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import ma.fstt.entities.Commande;
import ma.fstt.service.CommandeRepository;

import java.util.List;

public class CommandeDAO implements CommandeRepository {

    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("gestionCommandesPU");
    private EntityManager em = emf.createEntityManager();

    @Override
    public void ajouterCommande(Commande commande){
        em.getTransaction().begin();
        em.persist(commande);
        em.getTransaction().commit();
    }

    @Override
    public Commande trouverCommande(int id){
        return em.find(Commande.class, id);
    }

    @Override
    public List<Commande> listerCommandes(){
        return em.createQuery("select cm from Commande cm", Commande.class).getResultList();
    }

    @Override
    public void supprimerCommande(int id) {
        em.getTransaction().begin();
        Commande commande = em.find(Commande.class, id);
        if(commande != null){
            em.remove(commande);
        }
        em.getTransaction().commit();
    }
}
