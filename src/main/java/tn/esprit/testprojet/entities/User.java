package tn.esprit.testprojet.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idUser;
    @Column(length = 8,name = "Identifiant")
    String cin;
    @Transient //Ce champs ne sera pas créé
    String firstName;
    String lastName;
    LocalDate dateBirth;
    @Enumerated(EnumType.STRING)
    Role role;
}

