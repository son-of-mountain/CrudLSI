package ma.fstt.entities;

import jakarta.persistence.*;
import jakarta.persistence.List;
import lombok.Data;


@Entity
@Table(name="client")
@Data
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, length = 100)
    private String nom;

    @Column(nullable = false, unique=true, length = 100)
    private String email;

    @Column(length = 200)
    private String adresse;

    @OneToMany(mappedBy="client", cascade = CascadeType.ALL, orphanRemoval = true)
    private Liste<Commande> commandes;


}
