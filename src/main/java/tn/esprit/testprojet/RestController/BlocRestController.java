package tn.esprit.testprojet.RestController;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.web.bind.annotation.*;
import tn.esprit.testprojet.entities.Bloc;
import tn.esprit.testprojet.services.BlocServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/bloc")
@AllArgsConstructor
public class BlocRestController {
    BlocServiceImpl blocService;

    @PutMapping("/{idBloc}")
    public Bloc affecterChambresABloc(@RequestBody ListChambres chambres,@PathVariable Long idBloc){
        return blocService.affecterChambresABloc(chambres.getChambres(), idBloc);
    }

    @PostMapping("/")
    public Bloc ajouterBloc(@RequestBody Bloc bloc){
        return blocService.ajouterBloc(bloc);
    }
}

@Data
class ListChambres{
    private List<Long> chambres;
}
