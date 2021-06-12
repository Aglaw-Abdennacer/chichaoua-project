package ma.province.chichaouaproject.WebService;

import ma.province.chichaouaproject.bean.Statut;
import ma.province.chichaouaproject.service.StatutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/chichaouaProject/Statut")
public class StatutProvided {

    @GetMapping("/codeStatut/{codeStatut}")
    public Statut findByCodeStatut(@PathVariable long codeStatut) {
        return statutService.findByCodeStatut(codeStatut);
    }

    @GetMapping("/nomStatutFR/{nomStatutFR}")
    public Statut findByNomStatutFR(@PathVariable String nomStatutFR) {
        return statutService.findByNomStatutFR(nomStatutFR);
    }

    @GetMapping("/")
    public List<Statut> findAll() {
        return statutService.findAll();
    }

    @PostMapping("/")
    public int saveStatut(@RequestBody Statut statut) {
        return statutService.saveStatut(statut);
    }

    @Autowired
    private StatutService statutService;
}
