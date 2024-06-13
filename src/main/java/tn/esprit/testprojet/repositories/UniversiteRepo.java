package tn.esprit.testprojet.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.testprojet.entities.Universite;

@Repository
public interface UniversiteRepo extends JpaRepository<Universite,Long> {
    Universite findByNomUniversite(String nomUniversite);
}
