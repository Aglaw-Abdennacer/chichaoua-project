package ma.province.chichaouaproject.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Classe {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long idClasse ;
    String nomClasseAR;
    String nomClasseFR ;
    long codeClasse ;

    public long getIdClasse() {
        return idClasse;
    }

    public void setIdClasse(long idClasse) {
        this.idClasse = idClasse;
    }

    public String getNomClasseAR() {
        return nomClasseAR;
    }

    public void setNomClasseAR(String nomClasseAR) {
        this.nomClasseAR = nomClasseAR;
    }

    public String getNomClasseFR() {
        return nomClasseFR;
    }

    public void setNomClasseFR(String nomClasseFR) {
        this.nomClasseFR = nomClasseFR;
    }

    public long getCodeClasse() {
        return codeClasse;
    }

    public void setCodeClasse(long codeClasse) {
        this.codeClasse = codeClasse;
    }
}
