package ma.fstt.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import ma.fstt.entities.Client;
import ma.fstt.service.ClientRepository;

import java.util.List;

public class ClientDAO implements ClientRepository {

    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("gestionCommandesPU");
    private EntityManager em = emf.createEntityManager();

    @Override
    public void ajouterClient(Client client){
        em.getTransaction().begin();
        em.persist(client);
        em.getTransaction().commit();
    }

    @Override
    public Client trouverClient(int id){
        return em.find(Client.class, id);
    }

    @Override
    public List<Client> listerClients(){
        return em.createQuery("select c from Client c",Client.class).getResultList();
    }

    @Override
    public void supprimerClient(int id){
        em.getTransaction().begin();
        Client client = em.find(Client.class, id);
        if(client != null ){
            em.remove(client);
        }
        em.getTransaction().commit();
    }


}
