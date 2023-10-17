package tn.esprit.tpfoyer.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.Set;

@Entity
@Table (name = "reservation")

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String idReservation;

    private Date anneeUniversitaire;

    private Boolean estValide;

    // many to many Bidirectionnel avec etudiant
    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Etudiant> etudiants;

}
