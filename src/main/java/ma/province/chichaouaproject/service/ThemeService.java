package ma.province.chichaouaproject.service;

import ma.province.chichaouaproject.bean.Theme;
import ma.province.chichaouaproject.dao.ThemeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ThemeService {
    public Theme findByCodeTheme(long codeTheme) {
        return themeDao.findByCodeTheme(codeTheme);
    }

    public Theme findByNomThemeFR(String nomThemeFR) {
        return themeDao.findByNomThemeFR(nomThemeFR);
    }

    public List<Theme> findAll() {
        return themeDao.findAll();
    }

    public int saveTheme(Theme theme){
        if(findByCodeTheme(theme.getCodeTheme()) != null){
            return -1;
        }else {
            themeDao.save(theme);
            return 1;
        }
    }

    @Autowired
    private ThemeDao themeDao;
}
