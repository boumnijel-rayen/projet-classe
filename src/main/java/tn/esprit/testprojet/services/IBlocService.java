package tn.esprit.testprojet.services;

import tn.esprit.testprojet.entities.Bloc;

import java.util.List;

public interface IBlocService {
    public Bloc ajouterBloc(Bloc bloc);
    public void supprimerBloc(Long id);
    public List<Bloc> getBlocs();
    public Bloc getBloc(Long id);
    public Bloc modifierBloc(Bloc bloc);
    public Bloc affecterChambresABloc(List<Long> numChambre, Long idBloc);
    public Bloc ajouterBlocEnCascade(Bloc bloc);
}
