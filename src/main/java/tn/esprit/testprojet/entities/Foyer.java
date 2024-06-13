package tn.esprit.testprojet.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Foyer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFoyer;
    private String nomFoyer;
    private long capaciteFoyer;
    @OneToOne (mappedBy = "foyer")
    private Universite universite;
    @OneToMany (cascade = CascadeType.ALL, mappedBy = "foyer")
    private Set<Bloc> blocs=new HashSet<Bloc>();
}