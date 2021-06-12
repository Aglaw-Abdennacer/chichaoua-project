package ma.province.chichaouaproject.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Statut {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long idStatut ;
    String nomStatutAR;
    String nomStatutFR;
    long codeStatut ;

    public long getIdStatut() {
        return idStatut;
    }

    public void setIdStatut(long idStatut) {
        this.idStatut = idStatut;
    }

    public String getNomStatutAR() {
        return nomStatutAR;
    }

    public void setNomStatutAR(String nomStatutAR) {
        this.nomStatutAR = nomStatutAR;
    }

    public String getNomStatutFR() {
        return nomStatutFR;
    }

    public void setNomStatutFR(String nomStatutFR) {
        this.nomStatutFR = nomStatutFR;
    }

    public long getCodeStatut() {
        return codeStatut;
    }

    public void setCodeStatut(long codeStatut) {
        this.codeStatut = codeStatut;
    }
}
