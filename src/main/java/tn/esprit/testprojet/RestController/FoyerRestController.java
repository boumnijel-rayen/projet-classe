package tn.esprit.testprojet.RestController;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.testprojet.entities.Foyer;
import tn.esprit.testprojet.services.FoyerServiceImpl;
import tn.esprit.testprojet.services.IFoyerService;

import java.util.List;

@RestController("/api")
@AllArgsConstructor
public class FoyerRestController {
    FoyerServiceImpl foyerService;
    IFoyerService iFoyerService;

    @PostMapping("/foyer")
    public Foyer ajouterFoyer(@RequestBody Foyer foyer){
        return foyerService.ajouterFoyer(foyer);
    }

    @DeleteMapping("/foyer/{id}")
    public void supprimerFoyer(@PathVariable Long id){
        foyerService.supprimerFoyer(id);
    }

    @GetMapping("/foyers")
    public List<Foyer> getFoyers(){
        return foyerService.getFoyers();
    }

    @GetMapping("/foyer/{id}")
    public Foyer getFoyer(@PathVariable Long id){
        return foyerService.getFoyer(id);
    }

    @PutMapping("/foyer")
    public Foyer modifierFoyer(@RequestBody Foyer foyer){
        return foyerService.modifierFoyer(foyer);
    }

    @PutMapping("/foyer/{idFoyer}/{nomUniversite}")
    public void affecterFoyerUniversite(@PathVariable Long idFoyer, @PathVariable String nomUniversite){
        foyerService.affecterFoyerUniversite(idFoyer, nomUniversite);
    }

    @PutMapping("/foyer/{idUniversite}")
    public void desaffecterFoyerAUniversite(@PathVariable Long idUniversite){
        foyerService.desaffecterFoyerAUniversite(idUniversite);
    }

    @PostMapping("/foyer/{idUniversite}")
    public Foyer ajouterFoyerEtAffecterAUniversite(@RequestBody Foyer foyer,@PathVariable Long idUniversite){
        return iFoyerService.ajouterFoyerEtAffecterAUniversite(foyer, idUniversite);
    }
}
