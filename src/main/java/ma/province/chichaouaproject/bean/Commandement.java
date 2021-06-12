package ma.province.chichaouaproject.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Commandement {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long idCommandement;
    long idCercle;
    String nomCommandementAR ;
    String nomCommandementFR ;

    public long getIdCommandement() {
        return idCommandement;
    }

    public void setIdCommandement(long idCommandement) {
        this.idCommandement = idCommandement;
    }

    public long getIdCercle() {
        return idCercle;
    }

    public void setIdCercle(long idCercle) {
        this.idCercle = idCercle;
    }

    public String getNomCommandementAR() {
        return nomCommandementAR;
    }

    public void setNomCommandementAR(String nomCommandementAR) {
        this.nomCommandementAR = nomCommandementAR;
    }

    public String getNomCommandementFR() {
        return nomCommandementFR;
    }

    public void setNomCommandementFR(String nomCommandementFR) {
        this.nomCommandementFR = nomCommandementFR;
    }
}
