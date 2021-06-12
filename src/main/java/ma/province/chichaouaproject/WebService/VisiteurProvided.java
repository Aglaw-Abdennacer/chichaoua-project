package ma.province.chichaouaproject.WebService;

import ma.province.chichaouaproject.bean.Visiteur;
import ma.province.chichaouaproject.service.VisiteurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/chichaouaProject/Visiteur")
public class VisiteurProvided {

    @GetMapping("/numCin/{numCin}")
    public Visiteur findByNumCin(@PathVariable long numCin) {
        return visiteurService.findByNumCin(numCin);
    }

    @Transactional
    @DeleteMapping("/numCin/{numCin}")
    public int deleteByNumCin(@PathVariable long numCin) {
        return visiteurService.deleteByNumCin(numCin);
    }

    @GetMapping("/")
    public List<Visiteur> findAll() {
        return visiteurService.findAll();
    }

    @PostMapping("/")
    public int saveVisiteur(Visiteur visiteur) {
        return visiteurService.saveVisiteur(visiteur);
    }

    @GetMapping("/cin/{cin}")
    public int verifyCin(@PathVariable long cin) {
        return visiteurService.verifyCin(cin);
    }

    @Autowired
    public VisiteurService visiteurService;

}
