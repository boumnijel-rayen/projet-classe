package tn.esprit.testprojet.services;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import tn.esprit.testprojet.entities.Bloc;
import tn.esprit.testprojet.entities.Foyer;
import tn.esprit.testprojet.entities.Universite;
import tn.esprit.testprojet.repositories.BlocRepo;
import tn.esprit.testprojet.repositories.FoyerRepo;
import tn.esprit.testprojet.repositories.UniversiteRepo;

import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
public class FoyerServiceImpl implements IFoyerService{
    FoyerRepo foyerRepo;
    UniversiteRepo universiteRepo;
    BlocRepo blocRepo;

    @Override
    public Foyer ajouterFoyer(Foyer foyer) {
        for (Bloc bloc : foyer.getBlocs()){
            bloc.setFoyer(foyer);
        }
        return foyerRepo.save(foyer);
    }

    @Override
    public void supprimerFoyer(Long id) {
         foyerRepo.deleteById(id);
    }

    @Override
    public List<Foyer> getFoyers() {
        return foyerRepo.findAll();
    }

    @Override
    public Foyer getFoyer(Long id) {
        return foyerRepo.findById(id).orElse(null);
    }

    @Override
    public Foyer modifierFoyer(Foyer foyer) {
        return foyerRepo.save(foyer);
    }

    @Override
    public Universite affecterFoyerUniversite(Long idFoyer, String nomUniversite){
        Foyer foyer = foyerRepo.findById(idFoyer).orElse(null);
        Universite universite = universiteRepo.findByNomUniversite(nomUniversite);
        if(foyer != null && universite != null){
            universite.setFoyer(foyer);
            universiteRepo.save(universite);
            return universite;
        }
        return null;
    }

    @Override
    public Universite desaffecterFoyerAUniversite(Long idUniversite) {
        Universite universite = universiteRepo.findById(idUniversite).orElse(null);
        if(universite != null){
            universite.setFoyer(null);
            universiteRepo.save(universite);
            return universite;
        }
        return null;
    }

    @Override
    public Foyer ajouterFoyerEtAffecterAUniversite(Foyer foyer, Long idUniversite) {
        Universite universite = universiteRepo.findById(idUniversite).orElse(null);
        if(universite != null){


            for(Bloc bloc : foyer.getBlocs()){
                bloc.setFoyer(foyer);
            }

            universite.setFoyer(foyer);
            //universiteRepo.save(universite);
            //foyer.setUniversite(universite);
            foyerRepo.save(foyer);
            return foyer;
        }
        return null;
    }

    //@Scheduled(fixedRate = 60000) // toute les 60 secondes
    @Scheduled(fixedDelay = 60000) // 60 secondes apres la fin de la derniere execution
    @Scheduled(cron = "5 * * * * *") // tous les jours a minuit
    void recette(){
        log.info("scheduler ALINFO 3");
    }

}
