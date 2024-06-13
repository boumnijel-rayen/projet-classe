package tn.esprit.testprojet.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Reservation {
    @Id
    private String idReservation;
    private Date anneeUniversitaire;
    private boolean estValide;
    @ManyToMany (cascade = CascadeType.ALL)
    private Set<Etudiant> etudiants;
}