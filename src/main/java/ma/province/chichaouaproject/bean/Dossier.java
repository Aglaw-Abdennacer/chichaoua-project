package ma.province.chichaouaproject.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Dossier {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long idDossier;
    long numDossier;
    String nomDossier ;

    public long getIdDossier() {
        return idDossier;
    }

    public void setIdDossier(long idDossier) {
        this.idDossier = idDossier;
    }

    public String getNomDossier() {
        return nomDossier;
    }

    public long getNumDossier() {
        return numDossier;
    }

    public void setNumDossier(long numDossier) {
        this.numDossier = numDossier;
    }

    public void setNomDossier(String nomDossier) {
        this.nomDossier = nomDossier;
    }
}
