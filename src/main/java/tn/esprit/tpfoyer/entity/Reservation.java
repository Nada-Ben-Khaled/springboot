package tn.esprit.tpfoyer.entity;

import jakarta.persistence.*;
import lombok.*;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Reservation {

    @Id
    private String idReservation;

    private Date anneeUniversitaire;
    private boolean estValide;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_etudiant")
    @ToString.Exclude
    private Etudiant etudiant;

    // Association ManyToOne avec Chambre
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_chambre")
    @ToString.Exclude
    private Chambre chambre;
}