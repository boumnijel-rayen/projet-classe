package tn.esprit.testprojet.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.testprojet.entities.Chambre;
import tn.esprit.testprojet.entities.Etudiant;
import tn.esprit.testprojet.entities.Reservation;
import tn.esprit.testprojet.repositories.ChambreRepo;
import tn.esprit.testprojet.repositories.EtudiantRepo;
import tn.esprit.testprojet.repositories.ReservationRepo;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@AllArgsConstructor
@Service
public class ReservationServiceImpl implements IReservationService{
    ReservationRepo reservationRepo;
    EtudiantRepo etudiantRepo;
    ChambreRepo chambreRepo;

    @Override
    public Reservation ajouterReservation(Reservation reservation) {
        return reservationRepo.save(reservation);
    }

    @Override
    public void supprimerReservation(Long id) {
        reservationRepo.deleteById(id);
    }

    @Override
    public List<Reservation> getReservations() {
        return reservationRepo.findAll();
    }

    @Override
    public Reservation getReservation(Long id) {
        return reservationRepo.findById(id).orElse(null);
    }

    @Override
    public Reservation modifierReservation(Reservation reservation) {
        return reservationRepo.save(reservation);
    }

    @Override
    public Reservation ajouterReservation(long idChambre, long cinEtudiant) {
        Reservation reservation = new Reservation();
        reservation.setIdReservation(idChambre + "" + cinEtudiant + new Date().getYear());
        reservation.setEstValide(true);
        reservation.setAnneeUniversitaire(new Date());
        Etudiant etudiant = etudiantRepo.findByCin(cinEtudiant);
        Chambre chambre = chambreRepo.findById(idChambre).orElse(null);
        if(etudiant != null && chambre != null){
            reservation.getEtudiants().add(etudiant);
            reservationRepo.save(reservation);
            chambre.getReservations().add(reservation);
            chambreRepo.save(chambre);
            return reservationRepo.save(reservation);
        }
        return null;
    }
}
