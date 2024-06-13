package tn.esprit.testprojet.RestController;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.testprojet.entities.Reservation;
import tn.esprit.testprojet.services.IReservationService;

@RestController("/reservation")
@AllArgsConstructor
public class ReservationRestController {
    IReservationService iReservationService;

    @PostMapping("/add/{idChambre}/{cinEtudiant}")
    public Reservation ajouterReservation(@PathVariable Long idChambre,@PathVariable Long cinEtudiant){
        return iReservationService.ajouterReservation(idChambre,cinEtudiant);
    }
}
