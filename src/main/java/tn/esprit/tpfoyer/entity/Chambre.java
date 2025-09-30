package tn.esprit.tpfoyer.entity;

import jakarta.persistence.*;
import lombok.*;
import java.util.Set;

@Entity
@Getter
@Setter
@Builder
@ToString(includeFieldNames = false)
@EqualsAndHashCode(exclude = {"idChambre", "reservations"}) // Exclure les collections pour éviter les problèmes
@NoArgsConstructor
@AllArgsConstructor
public class Chambre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    @ToString.Exclude
    private Long idChambre;

    private Long numeroChambre;

    @Enumerated(EnumType.STRING)
    private TypeChambre typeC;

    // ✅ Ajout du champ 'bloc' pour établir la relation ManyToOne
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_bloc") // Colonne de jointure dans la table Chambre
    @ToString.Exclude
    private Bloc bloc;

    // Association OneToMany avec Reservation (Optionnel, mais souvent utile)
    @OneToMany(mappedBy = "chambre", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @ToString.Exclude
    private Set<Reservation> reservations;

    public Chambre(Long numeroChambre, TypeChambre typec) {
        this.numeroChambre = numeroChambre;
        this.typeC = typec;
    }

    @Override
    public String toString() {
        return numeroChambre + ", " + typeC;
    }
}