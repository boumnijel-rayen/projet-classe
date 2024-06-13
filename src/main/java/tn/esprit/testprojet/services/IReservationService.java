package tn.esprit.testprojet.services;

import tn.esprit.testprojet.entities.Reservation;

import java.util.List;

public interface IReservationService {
    public Reservation ajouterReservation(Reservation reservation);
    public void supprimerReservation(Long id);
    public List<Reservation> getReservations();
    public Reservation getReservation(Long id);
    public Reservation modifierReservation(Reservation reservation);
    public Reservation ajouterReservation (long idChambre, long cinEtudiant);
}
