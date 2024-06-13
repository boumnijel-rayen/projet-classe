package tn.esprit.testprojet.services;

import tn.esprit.testprojet.entities.Etudiant;

import java.util.List;

public interface IEtudiantService {
    public Etudiant ajouterEtudiant(Etudiant etudiant);
    public void supprimerEtudiant(Long id);
    public List<Etudiant> getEtudiants();
    public Etudiant getEtudiant(Long id);
    public Etudiant modifierEtudiant(Etudiant etudiant);
}
