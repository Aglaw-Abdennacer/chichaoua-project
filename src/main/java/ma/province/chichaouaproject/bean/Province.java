package ma.province.chichaouaproject.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Province {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long idprovince;
    long idRegion;
    String nomProvinceAR ;
    String nomProvinceFR ;
    long codeProvince ;


    public long getIdprovince() {
        return idprovince;
    }

    public void setIdprovince(long idprovince) {
        this.idprovince = idprovince;
    }

    public long getIdRegion() {
        return idRegion;
    }

    public void setIdRegion(long idRegion) {
        this.idRegion = idRegion;
    }

    public String getNomProvinceAR() {
        return nomProvinceAR;
    }

    public void setNomProvinceAR(String nomProvinceAR) {
        this.nomProvinceAR = nomProvinceAR;
    }

    public String getNomProvinceFR() {
        return nomProvinceFR;
    }

    public void setNomProvinceFR(String nomProvinceFR) {
        this.nomProvinceFR = nomProvinceFR;
    }

    public long getCodeProvince() {
        return codeProvince;
    }

    public void setCodeProvince(long codeProvince) {
        this.codeProvince = codeProvince;
    }

}
