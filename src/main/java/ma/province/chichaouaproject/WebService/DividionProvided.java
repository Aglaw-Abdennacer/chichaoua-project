package ma.province.chichaouaproject.WebService;

import ma.province.chichaouaproject.bean.Division;
import ma.province.chichaouaproject.service.DivisionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/chichaouaProject/Division")
public class DividionProvided {

    @GetMapping("/codeDivision/{codeDivision]")
    public Division findByCodeDivision(@PathVariable long codeDivision) {
        return divisionService.findByCodeDivision(codeDivision);
    }

    @GetMapping("/")
    public List<Division> findAll() {
        return divisionService.findAll();
    }

    @PostMapping("/")
    public int saveDivision(@RequestBody Division division) {
        return divisionService.saveDivision(division);
    }

    @Autowired
    private DivisionService divisionService;
}
