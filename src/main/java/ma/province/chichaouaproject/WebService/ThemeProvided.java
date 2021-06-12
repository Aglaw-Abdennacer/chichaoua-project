package ma.province.chichaouaproject.WebService;

import ma.province.chichaouaproject.bean.Theme;
import ma.province.chichaouaproject.service.ThemeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/chichaouaProject/Theme")
public class ThemeProvided {


    @GetMapping("/codeTheme/{codeTheme}")
    public Theme findByCodeTheme(@PathVariable long codeTheme) {
        return themeService.findByCodeTheme(codeTheme);
    }

    @GetMapping("/nomThemeFR/{nomThemeFR}")
    public Theme findByNomThemeFR(@PathVariable String nomThemeFR) {
        return themeService.findByNomThemeFR(nomThemeFR);
    }
    @GetMapping("/")
    public List<Theme> findAll() {
        return themeService.findAll();
    }

    @PostMapping("/")
    public int saveTheme(@RequestBody Theme theme) {
        return themeService.saveTheme(theme);
    }

    @Autowired
    private ThemeService themeService ;
}
