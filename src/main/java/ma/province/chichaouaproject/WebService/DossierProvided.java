package ma.province.chichaouaproject.WebService;

import ma.province.chichaouaproject.bean.Dossier;
import ma.province.chichaouaproject.dao.DossierDao;
import ma.province.chichaouaproject.service.DossierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/chichaouaProject/Dossier")
public class DossierProvided {
    @GetMapping("/numDossier/{numDossier}")
    public Dossier findByNumDossier(@PathVariable long numDossier) {
        return dossierService.findByNumDossier(numDossier);
    }

    @Transactional
    @DeleteMapping("/numDossier/{numDossier}")
    public int deleteByNumDossier(@PathVariable long numDossier) {
        return dossierService.deleteByNumDossier(numDossier);
    }

    @GetMapping("/nomDossier/{nomDossier}")
    public Dossier findByNomDossier( @PathVariable String nomDossier) {
        return dossierService.findByNomDossier(nomDossier);
    }

    @Transactional
    @DeleteMapping("/nomDossier/{nomDossier}")
    public int deleteByNomDossier(@PathVariable String nomDossier) {
        return dossierService.deleteByNomDossier(nomDossier);
    }

    @GetMapping("/")
    public List<Dossier> findAll() {
        return dossierService.findAll();
    }

    @PostMapping("/")
    public int saveDossier(@RequestBody Dossier dossier) {
        return dossierService.saveDossier(dossier);
    }

    @Autowired
    public DossierService dossierService;
}
