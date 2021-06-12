package ma.province.chichaouaproject.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Sexe {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long idSexe ;
    String sexeAR ;
    String sexeFR ;
    long codeSexe ;

    public long getIdSexe() {
        return idSexe;
    }

    public void setIdSexe(long idSexe) {
        this.idSexe = idSexe;
    }

    public String getSexeAR() {
        return sexeAR;
    }

    public void setSexeAR(String sexeAR) {
        this.sexeAR = sexeAR;
    }

    public String getSexeFR() {
        return sexeFR;
    }

    public void setSexeFR(String sexeFR) {
        this.sexeFR = sexeFR;
    }

    public long getCodeSexe() {
        return codeSexe;
    }

    public void setCodeSexe(long codeSexe) {
        this.codeSexe = codeSexe;
    }
}
