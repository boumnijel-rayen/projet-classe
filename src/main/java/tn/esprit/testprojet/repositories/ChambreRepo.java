package tn.esprit.testprojet.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.testprojet.entities.Chambre;
@Repository
public interface ChambreRepo extends JpaRepository<Chambre,Long> {
}
