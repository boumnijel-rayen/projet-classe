package tn.esprit.testprojet.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.testprojet.entities.Chambre;
import tn.esprit.testprojet.repositories.ChambreRepo;

import java.util.List;

@AllArgsConstructor
@Service
public class ChambreServiceImpl implements IChambreService{
    ChambreRepo chambreRepo;

    @Override
    public Chambre ajouterChambre(Chambre chambre) {
        return chambreRepo.save(chambre);
    }

    @Override
    public void supprimerChambre(Long id) {
        chambreRepo.deleteById(id);
    }

    @Override
    public List<Chambre> getChambres() {
        return chambreRepo.findAll();
    }

    @Override
    public Chambre getChambre(Long id) {
        return chambreRepo.findById(id).orElse(null);
    }

    @Override
    public Chambre modifierChambre(Chambre chambre) {
        return chambreRepo.save(chambre);
    }
}
