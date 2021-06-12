package ma.province.chichaouaproject.WebService;

import ma.province.chichaouaproject.bean.Commandement;
import ma.province.chichaouaproject.service.CommandementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/chichaouaProject/Commandement")
public class CommandementProvided {
    @GetMapping("/nomCommandementFR/{nomCommandementFR}")
    public Commandement findByNomCommandementFR(@PathVariable String nomCommandementFR) {
        return commandementService.findByNomCommandementFR(nomCommandementFR);
    }

    @GetMapping("/")
    public List<Commandement> findAll() {
        return commandementService.findAll();
    }

    @PostMapping("/")
    public int saveCommandement(@RequestBody Commandement commandement) {
        return commandementService.saveCommandement(commandement);
    }

    @Autowired
    private CommandementService commandementService;
}
