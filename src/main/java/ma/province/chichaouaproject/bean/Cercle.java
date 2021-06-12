package ma.province.chichaouaproject.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cercle {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long idCercle;
    long idProvince;
    String nomCercleAR ;
    String nomCercleFR ;

    public long getIdCercle() {
        return idCercle;
    }

    public void setIdCercle(long idCercle) {
        this.idCercle = idCercle;
    }

    public long getIdProvince() {
        return idProvince;
    }

    public void setIdProvince(long idProvince) {
        this.idProvince = idProvince;
    }

    public String getNomCercleAR() {
        return nomCercleAR;
    }

    public void setNomCercleAR(String nomCercleAR) {
        this.nomCercleAR = nomCercleAR;
    }

    public String getNomCercleFR() {
        return nomCercleFR;
    }

    public void setNomCercleFR(String nomCercleFR) {
        this.nomCercleFR = nomCercleFR;
    }
}
