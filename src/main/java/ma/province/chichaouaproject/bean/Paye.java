package ma.province.chichaouaproject.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Paye {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long idPaye;
    String nomPayeAR;
    String nomPayeFR ;

    public long getIdPaye() {
        return idPaye;
    }

    public void setIdPaye(long idPaye) {
        this.idPaye = idPaye;
    }

    public String getNomPayeAR() {
        return nomPayeAR;
    }

    public void setNomPayeAR(String nomPayeAR) {
        this.nomPayeAR = nomPayeAR;
    }

    public String getNomPayeFR() {
        return nomPayeFR;
    }

    public void setNomPayeFR(String nomPayeFR) {
        this.nomPayeFR = nomPayeFR;
    }
}
