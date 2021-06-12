package ma.province.chichaouaproject.WebService;

import ma.province.chichaouaproject.bean.Demande;
import ma.province.chichaouaproject.service.DemandeService;
import ma.province.chichaouaproject.vo.DemandeVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/chichaouaProject/Demande")
public class DemandeProvided {

    @GetMapping("/numOrdre/{numOrdre}")
    public Demande findBynumOrdre(@PathVariable long numOrdre) {
        return demandeService.findBynumOrdre(numOrdre);
    }

    @Transactional
    @DeleteMapping("/numOrdre/{numOrdre}")
    public int deleteBynumOrdre(@PathVariable long numOrdre) {
        return demandeService.deleteBynumOrdre(numOrdre);
    }

    @GetMapping("/")
    public List<Demande> findAll() {
        return demandeService.findAll();
    }

    @GetMapping("/theme/nomThemeFR/{nomThemeFR}")
    public List<Demande> findByThemeNomThemeFR(String nomThemeFR) {
        return demandeService.findByThemeNomThemeFR(nomThemeFR);
    }

    @GetMapping("/statut/nomStatutFR/{nomStatutFR}")
    public List<Demande> findByStatutNomStatutFR(String nomStatutFR) {
        return demandeService.findByStatutNomStatutFR(nomStatutFR);
    }

    @GetMapping("/division/nomDivisionFR{nomDivisionFR}")
    public List<Demande> findByDivisionNomDivisionFR(String nomDivisionFR) {
        return demandeService.findByDivisionNomDivisionFR(nomDivisionFR);
    }


    @GetMapping("/typeDemande/nomTypeDemandeFR/{nomTypeDemandeFR}")
    public List<Demande> findByTypeDemandeNomTypeDemandeFR(String nomTypeDemandeFR) {
        return demandeService.findByTypeDemandeNomTypeDemandeFR(nomTypeDemandeFR);
    }

    @PostMapping("/critere")
    public List<Demande> findByCritere(DemandeVo demandeVo) {
        return demandeService.findByCritere(demandeVo);
    }

    @PostMapping("/")
    public int saveDemande(@RequestBody Demande demande) {
        return demandeService.saveDemande(demande);
    }

  /*  @PostMapping("/save/")
    public int saveDemandeAvecVisiteur(Demande demande) {
        return demandeService.saveDemandeAvecVisiteur(demande);
    }*/


    @Autowired
    public DemandeService demandeService;

}
