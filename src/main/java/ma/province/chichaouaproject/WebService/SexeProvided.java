package ma.province.chichaouaproject.WebService;

import ma.province.chichaouaproject.bean.Sexe;
import ma.province.chichaouaproject.service.SexeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/chichaouaProject/Sexe")
public class SexeProvided {

    @GetMapping("/codeSexe/{codeSexe}")
    public Sexe findByCodeSexe(long codeSexe) {
        return sexeService.findByCodeSexe(codeSexe);
    }

    @GetMapping("/")
    public List<Sexe> findAll() {
        return sexeService.findAll();
    }

    @Autowired
    public SexeService sexeService;
}
