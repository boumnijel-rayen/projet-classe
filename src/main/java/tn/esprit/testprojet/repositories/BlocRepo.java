package tn.esprit.testprojet.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.testprojet.entities.Bloc;
@Repository
public interface BlocRepo extends JpaRepository<Bloc, Long> {
}
