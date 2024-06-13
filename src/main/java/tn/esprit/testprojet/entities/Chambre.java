package tn.esprit.testprojet.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Chambre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idChambre;
    private Long numeroChambre;
    private TypeChambre typeC;
    @ManyToOne(cascade = CascadeType.ALL)
    private Bloc bloc;
    @OneToMany(cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Reservation> reservations;
}