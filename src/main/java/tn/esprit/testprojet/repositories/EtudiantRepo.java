package tn.esprit.testprojet.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.testprojet.entities.Etudiant;

@Repository
public interface EtudiantRepo extends JpaRepository<Etudiant,Long> {
    Etudiant findByCin(Long cin);
}
