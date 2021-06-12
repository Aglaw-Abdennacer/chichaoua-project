package ma.province.chichaouaproject.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Commune {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long idCommune;
    long idProvince;
    String nomCommuneAR ;
    String nomCommuneFR ;
    String natureCommune ;
    long codeCommune ;



    public long getIdCommune() {
        return idCommune;
    }

    public void setIdCommune(long idCommune) {
        this.idCommune = idCommune;
    }

    public long getIdProvince() {
        return idProvince;
    }

    public void setIdProvince(long idProvince) {
        this.idProvince = idProvince;
    }

    public String getNomCommuneAR() {
        return nomCommuneAR;
    }

    public void setNomCommuneAR(String nomCommuneAR) {
        this.nomCommuneAR = nomCommuneAR;
    }

    public String getNomCommuneFR() {
        return nomCommuneFR;
    }

    public void setNomCommuneFR(String nomCommuneFR) {
        this.nomCommuneFR = nomCommuneFR;
    }

    public String getNatureCommune() {
        return natureCommune;
    }

    public void setNatureCommune(String natureCommune) {
        this.natureCommune = natureCommune;
    }

    public long getCodeCommune() {
        return codeCommune;
    }

    public void setCodeCommune(long codeCommune) {
        this.codeCommune = codeCommune;
    }



}
