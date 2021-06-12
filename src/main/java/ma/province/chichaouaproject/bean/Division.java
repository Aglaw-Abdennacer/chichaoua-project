package ma.province.chichaouaproject.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Division {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long idDivision;
    String nomDivisionAR;
    String nomDivisionFR ;
    long codeDivision ;

    public long getIdDivision() {
        return idDivision;
    }

    public void setIdDivision(long idDivision) {
        this.idDivision = idDivision;
    }

    public String getNomDivisionAR() {
        return nomDivisionAR;
    }

    public void setNomDivisionAR(String nomDivisionAR) {
        this.nomDivisionAR = nomDivisionAR;
    }

    public String getNomDivisionFR() {
        return nomDivisionFR;
    }

    public void setNomDivisionFR(String nomDivisionFR) {
        this.nomDivisionFR = nomDivisionFR;
    }

    public long getCodeDivision() {
        return codeDivision;
    }

    public void setCodeDivision(long codeDivision) {
        this.codeDivision = codeDivision;
    }
}
