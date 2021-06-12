package ma.province.chichaouaproject.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TypeDemande {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long idTypeDemande ;
    String nomTypeDemandeAR ;
    String nomTypeDemandeFR ;
    long codeTypeDemande;

    public long getIdTypeDemande() {
        return idTypeDemande;
    }

    public void setIdTypeDemande(long idTypeDemande) {
        this.idTypeDemande = idTypeDemande;
    }

    public String getNomTypeDemandeAR() {
        return nomTypeDemandeAR;
    }

    public void setNomTypeDemandeAR(String nomTypeDemandeAR) {
        this.nomTypeDemandeAR = nomTypeDemandeAR;
    }

    public String getNomTypeDemandeFR() {
        return nomTypeDemandeFR;
    }

    public void setNomTypeDemandeFR(String nomTypeDemandeFR) {
        this.nomTypeDemandeFR = nomTypeDemandeFR;
    }

    public long getCodeTypeDemande() {
        return codeTypeDemande;
    }

    public void setCodeTypeDemande(long codeTypeDemande) {
        this.codeTypeDemande = codeTypeDemande;
    }
}
