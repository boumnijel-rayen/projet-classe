package tn.esprit.testprojet.services;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.testprojet.entities.Bloc;
import tn.esprit.testprojet.entities.Chambre;
import tn.esprit.testprojet.repositories.BlocRepo;
import tn.esprit.testprojet.repositories.ChambreRepo;

import java.util.List;

@AllArgsConstructor
@Service
public class BlocServiceImpl implements IBlocService{
    BlocRepo blocRepo;
    ChambreRepo chambreRepo;

    @Override
    public Bloc ajouterBloc(Bloc bloc) {
        return blocRepo.save(bloc);
    }

    @Override
    public void supprimerBloc(Long id) {
        blocRepo.deleteById(id);
    }

    @Override
    public List<Bloc> getBlocs() {
        return blocRepo.findAll();
    }

    @Override
    public Bloc getBloc(Long id) {
        return blocRepo.findById(id).orElse(null);
    }

    @Override
    public Bloc modifierBloc(Bloc bloc) {
        return blocRepo.save(bloc);
    }

    @Override
    public Bloc affecterChambresABloc(List<Long> numChambre, Long idBloc){
        Bloc bloc = blocRepo.findById(idBloc).orElse(null);
        for (Long num : numChambre){
            Chambre chambre = chambreRepo.findById(num).orElse(null);
            chambre.setBloc(bloc);
            chambreRepo.save(chambre);
        }
        return bloc;
    }

    @Override
    public Bloc ajouterBlocEnCascade(Bloc bloc) {
        return blocRepo.save(bloc);
    }
}
