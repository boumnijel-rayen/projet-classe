package tn.esprit.testprojet.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.testprojet.entities.Reservation;
@Repository
public interface ReservationRepo extends JpaRepository<Reservation,Long> {
}
