package ma.fstt.service;

import ma.fstt.entities.Client;

import java.util.List;

public interface ClientRepository {
    void ajouterClient(Client client);
    Client trouverClient(int id);
    List<Client> listerClients();
    void supprimerClient(int id);
}
