package tn.esprit.testprojet.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import tn.esprit.testprojet.entities.Foyer;
@Repository
public interface FoyerRepo extends JpaRepository<Foyer,Long> {
    Foyer findByNomFoyerAndBlocsIdBloc(String nomFoyer, long idBloc);
//    @Query("select foyer from Foyer f where f.id=:id")
//    Foyer chercherFoyerParId(@Param("id") long id);
    @Query("select f from Foyer f join f.blocs b where f.nomFoyer=:nomFoyer and b.idBloc=:idBloc")
    Foyer chercherFoyerParNomIdBloc(@Param("nomFoyer") String nomFoyer, @Param("idBloc") long idBloc);
}
