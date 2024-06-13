package tn.esprit.testprojet.services;

import tn.esprit.testprojet.entities.Chambre;

import java.util.List;

public interface IChambreService {
    public Chambre ajouterChambre(Chambre chambre);
    public void supprimerChambre(Long id);
    public List<Chambre> getChambres();
    public Chambre getChambre(Long id);
    public Chambre modifierChambre(Chambre chambre);
}
