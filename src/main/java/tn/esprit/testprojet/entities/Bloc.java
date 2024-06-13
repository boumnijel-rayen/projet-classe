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
//@EqualsAndHashCode
public class Bloc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBloc;
    private String nomBloc;
    private Long capaciteBloc;
    @ManyToOne
    @JsonIgnore
    private Foyer foyer;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "bloc")
    private Set<Chambre> chambres;
}
