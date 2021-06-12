package ma.province.chichaouaproject.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ServiceExt {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long idServiceExt ;
    String nomServiceExtAR ;
    String nomServiceExtFR ;
    long codeServiceExt ;

    public long getIdServiceExt() {
        return idServiceExt;
    }

    public void setIdServiceExt(long idServiceExt) {
        this.idServiceExt = idServiceExt;
    }

    public String getNomServiceExtAR() {
        return nomServiceExtAR;
    }

    public void setNomServiceExtAR(String nomServiceExtAR) {
        this.nomServiceExtAR = nomServiceExtAR;
    }

    public String getNomServiceExtFR() {
        return nomServiceExtFR;
    }

    public void setNomServiceExtFR(String nomServiceExtFR) {
        this.nomServiceExtFR = nomServiceExtFR;
    }

    public long getCodeServiceExt() {
        return codeServiceExt;
    }

    public void setServiceExt(long codeserviceExt) {
        codeServiceExt = codeserviceExt;
    }
}
