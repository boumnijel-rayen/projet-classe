package tn.esprit.testprojet.services;

import tn.esprit.testprojet.entities.Foyer;
import tn.esprit.testprojet.entities.Universite;

import java.util.List;

public interface IFoyerService {
    public Foyer ajouterFoyer(Foyer foyer);
    public void supprimerFoyer(Long id);
    public List<Foyer> getFoyers();
    public Foyer getFoyer(Long id);
    public Foyer modifierFoyer(Foyer foyer);
    public Universite affecterFoyerUniversite(Long idFoyer, String nomUniversite);
    public Universite desaffecterFoyerAUniversite(Long idUniversite);
    public Foyer ajouterFoyerEtAffecterAUniversite(Foyer foyer, Long idUniversite);
}
