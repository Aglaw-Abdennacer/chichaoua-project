package ma.province.chichaouaproject.WebService;

import ma.province.chichaouaproject.bean.Classe;
import ma.province.chichaouaproject.service.ClasseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/chichaouaProject/Classe")
public class ClasseProvided {

    @GetMapping("/codeClasse/{codeClasse}")
    public Classe findByCodeClasse(long codeClasse) {
        return classeService.findByCodeClasse(codeClasse);
    }

    @GetMapping("/")
    public List<Classe> findAll() {
        return classeService.findAll();
    }

    @Autowired
    public ClasseService classeService;
}
