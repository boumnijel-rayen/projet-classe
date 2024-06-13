package tn.esprit.testprojet.services;

import tn.esprit.testprojet.entities.Universite;

import java.util.List;

public interface IUniversityService {
    public Universite ajouterUniversite(Universite universite);
    public void supprimerUniversite(Long id);
    public List<Universite> getUniversites();
    public Universite getUniversite(Long id);
    public Universite modifierUniversite(Universite universite);
}
