package tn.esprit.testprojet.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.testprojet.entities.Etudiant;
import tn.esprit.testprojet.repositories.EtudiantRepo;

import java.util.List;

@AllArgsConstructor
@Service
public class EtudiantServiceImpl implements IEtudiantService{
    EtudiantRepo etudiantRepo;

    @Override
    public Etudiant ajouterEtudiant(Etudiant etudiant) {
        return etudiantRepo.save(etudiant);
    }

    @Override
    public void supprimerEtudiant(Long id) {
        etudiantRepo.deleteById(id);
    }

    @Override
    public List<Etudiant> getEtudiants() {
        return etudiantRepo.findAll();
    }

    @Override
    public Etudiant getEtudiant(Long id) {
        return etudiantRepo.findById(id).orElse(null);
    }

    @Override
    public Etudiant modifierEtudiant(Etudiant etudiant) {
        return etudiantRepo.save(etudiant);
    }
}
