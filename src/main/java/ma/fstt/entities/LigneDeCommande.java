package ma.fstt.entities;


import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.JoinColumnOrFormula;

@Entity
@Table(name="lignedecommande")
@Data
public class LigneDeCommande {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private int quantite;

    @ManyToOne
    @JoinColumn(name="produit_id", nullable = false)
    private Produit produit;

    @ManyToOne
    @JoinColumn(name = "commande_id", nullable = false)
    private Commande commande;

}
