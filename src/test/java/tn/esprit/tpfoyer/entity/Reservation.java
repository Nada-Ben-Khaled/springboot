package tn.esprit.tpfoyer.entity;

import jakarta.persistence.*;
import lombok.*;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Reservation {

    @Id
    private String idReservation; // On suppose que c'est une chaine

    private Date anneeUniversitaire;
    private boolean estValide;
}