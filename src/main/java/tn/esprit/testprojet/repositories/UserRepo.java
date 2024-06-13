package tn.esprit.testprojet.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.testprojet.entities.User;
@Repository
public interface UserRepo extends JpaRepository<User,Long> {
}
