package ma.province.chichaouaproject.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Service {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long idService ;
    String nomServiceAR;
    String nomServiceFR ;
    long codeService ;

    public long getIdService() {
        return idService;
    }

    public void setIdService(long idService) {
        this.idService = idService;
    }

    public String getNomServiceAR() {
        return nomServiceAR;
    }

    public void setNomServiceAR(String nomServiceAR) {
        this.nomServiceAR = nomServiceAR;
    }

    public String getNomServiceFR() {
        return nomServiceFR;
    }

    public void setNomServiceFR(String nomServiceFR) {
        this.nomServiceFR = nomServiceFR;
    }

    public long getCodeService() {
        return codeService;
    }

    public void setCodeService(long codeService) {
        this.codeService = codeService;
    }
}
