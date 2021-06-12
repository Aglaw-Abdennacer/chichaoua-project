package ma.province.chichaouaproject.dao;

import ma.province.chichaouaproject.bean.Theme;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ThemeDao extends JpaRepository <Theme, Long >  {
    Theme findByCodeTheme(long codeTheme);
    Theme findByNomThemeFR(String nomThemeFR);
}
