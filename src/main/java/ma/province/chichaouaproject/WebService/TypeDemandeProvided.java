package ma.province.chichaouaproject.WebService;

import ma.province.chichaouaproject.bean.TypeDemande;
import ma.province.chichaouaproject.service.TypeDemandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/chichaouaProject/TypeDemande")
public class TypeDemandeProvided {

    @GetMapping("/codeTypeDemande/{codeTypeDemande}")
    public TypeDemande findByCodeTypeDemande(@PathVariable long codeTypeDemande) {
        return typeDemandeService.findByCodeTypeDemande(codeTypeDemande);
    }

    @Transactional
    @DeleteMapping("/codeTypeDemande/{codeTypeDemande}")
    public int deleteByCodeTypeDemande(@PathVariable long codeTypeDemande) {
        return typeDemandeService.deleteByCodeTypeDemande(codeTypeDemande);
    }

    @GetMapping("/")
    public List<TypeDemande> findAll() {
        return typeDemandeService.findAll();
    }

    @PostMapping("/")
    public int saveTypeDemande(@RequestBody TypeDemande typeDemande) {
        return typeDemandeService.saveTypeDemande(typeDemande);
    }

    @Autowired
    private TypeDemandeService typeDemandeService;
}
