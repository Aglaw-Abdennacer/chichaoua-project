package ma.province.chichaouaproject.WebService;

import ma.province.chichaouaproject.bean.Commune;
import ma.province.chichaouaproject.service.CommuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/chichaouaProject/Commune")
public class CommuneProvided {

    @GetMapping("/codeCommune/{codeCommune}")
    public Commune findByCodeCommune(long codeCommune) {
        return communeService.findByCodeCommune(codeCommune);
    }

    @GetMapping("/")
    public List<Commune> findAll() {
        return communeService.findAll();
    }

    @Autowired
    public CommuneService communeService;
}
