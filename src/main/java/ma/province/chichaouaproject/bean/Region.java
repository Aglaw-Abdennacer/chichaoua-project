package ma.province.chichaouaproject.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Region {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long idRegion;
    String nomRegionAR;
    String nomRegionFR ;
    long idPaye ;

    public long getIdRegion() {
        return idRegion;
    }

    public void setIdRegion(long idRegion) {
        this.idRegion = idRegion;
    }

    public String getNomRegionAR() {
        return nomRegionAR;
    }

    public void setNomRegionAR(String nomRegionAR) {
        this.nomRegionAR = nomRegionAR;
    }

    public String getNomRegionFR() {
        return nomRegionFR;
    }

    public void setNomRegionFR(String nomRegionFR) {
        this.nomRegionFR = nomRegionFR;
    }

    public long getIdPaye() {
        return idPaye;
    }

    public void setIdPaye(long idPaye) {
        this.idPaye = idPaye;
    }
}
