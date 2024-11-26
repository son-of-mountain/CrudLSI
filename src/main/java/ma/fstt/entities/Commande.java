package ma.fstt.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.*;

@Entity
@Table(name="commande")
@Data
public class Commande {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Temporal(TemporalType.DATE)
    private Date dateCommande;

    @ManyToOne
    @JoinColumn(name="client_id",nullable = false)
    private Client client;

    @OneToMany(mappedBy = "commande", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<LigneDeCommande> lignesDeCommande;

}
