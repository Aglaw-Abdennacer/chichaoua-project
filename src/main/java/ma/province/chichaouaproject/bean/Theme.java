package ma.province.chichaouaproject.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Theme {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long idTheme ;
    String nomThemeAR ;
    String nomThemeFR ;
    long codeTheme ;

    public long getIdTheme() {
        return idTheme;
    }

    public void setIdTheme(long idTheme) {
        this.idTheme = idTheme;
    }

    public String getNomThemeAR() {
        return nomThemeAR;
    }

    public void setNomThemeAR(String nomThemeAR) {
        this.nomThemeAR = nomThemeAR;
    }

    public String getNomThemeFR() {
        return nomThemeFR;
    }

    public void setNomThemeFR(String nomThemeFR) {
        this.nomThemeFR = nomThemeFR;
    }

    public long getCodeTheme() {
        return codeTheme;
    }

    public void setCodeTheme(long codeTheme) {
        this.codeTheme = codeTheme;
    }


}
