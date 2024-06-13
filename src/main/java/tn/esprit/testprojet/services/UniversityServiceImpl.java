package tn.esprit.testprojet.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.testprojet.entities.Universite;
import tn.esprit.testprojet.repositories.UniversiteRepo;

import java.util.List;

@Service
@AllArgsConstructor
public class UniversityServiceImpl implements IUniversityService{
    UniversiteRepo universiteRepo;

    @Override
    public Universite ajouterUniversite(Universite universite) {
        return universiteRepo.save(universite);
    }

    @Override
    public void supprimerUniversite(Long id) {
        universiteRepo.deleteById(id);
    }

    @Override
    public List<Universite> getUniversites() {
        return universiteRepo.findAll();
    }

    @Override
    public Universite getUniversite(Long id) {
        return universiteRepo.findById(id).orElse(null);
    }

    @Override
    public Universite modifierUniversite(Universite universite) {
        return universiteRepo.save(universite);
    }
}
