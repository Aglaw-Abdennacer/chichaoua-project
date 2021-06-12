package ma.province.chichaouaproject.WebService;

import ma.province.chichaouaproject.bean.CommuneLocale;
import ma.province.chichaouaproject.service.CommuneLocaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/chichaouaProject/CommuneL")
public class CommuneLocaleWs {
    @GetMapping("/codeCommuneLocale/{codeCommuneLocale}")
    public CommuneLocale findByCodeCommuneLocale(@PathVariable long codeCommuneLocale) {
        return communeLocaleService.findByCodeCommuneLocale(codeCommuneLocale);
    }

    @GetMapping("/nomCommuneLocaleFR/{nomCommuneLocaleFR}")
    public CommuneLocale findByNomCommuneLocaleFR(@PathVariable String nomCommuneLocaleFR) {
        return communeLocaleService.findByNomCommuneLocaleFR(nomCommuneLocaleFR);
    }

    @GetMapping("/")
    public List<CommuneLocale> findAll() {
        return communeLocaleService.findAll();
    }

    @PostMapping("/")
    public int saveCommuneLocal(@RequestBody CommuneLocale communeLocale) {
        return communeLocaleService.saveCommuneLocal(communeLocale);
    }

    @Autowired
    private CommuneLocaleService communeLocaleService;
}
