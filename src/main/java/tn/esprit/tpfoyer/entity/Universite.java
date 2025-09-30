package tn.esprit.tpfoyer.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Universite {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUniversite;

    private String nomUniversite;
    private String adresse;


    @OneToOne(mappedBy = "universite", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @ToString.Exclude
    private Foyer foyer;
}