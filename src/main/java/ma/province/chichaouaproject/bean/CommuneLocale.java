package ma.province.chichaouaproject.bean;

import javax.persistence.*;

@Entity
public class CommuneLocale {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idCommuneLocale;
    private String nomCommuneLocaleAR ;
    private  String nomCommuneLocaleFR ;
    private String naturCommuneLocale ;
    private  long codeCommuneLocale ;
    @ManyToOne
    private Commandement commandement;

    public long getIdCommuneLocale() {
        return idCommuneLocale;
    }

    public void setIdCommuneLocale(long idCommuneLocale) {
        this.idCommuneLocale = idCommuneLocale;
    }


    public String getNomCommuneLocaleAR() {
        return nomCommuneLocaleAR;
    }

    public void setNomCommuneLocaleAR(String nomCommuneLocaleAR) {
        this.nomCommuneLocaleAR = nomCommuneLocaleAR;
    }

    public String getNomCommuneLocaleFR() {
        return nomCommuneLocaleFR;
    }

    public void setNomCommuneLocaleFR(String nomCommuneLocaleFR) {
        this.nomCommuneLocaleFR = nomCommuneLocaleFR;
    }

    public String getNaturCommuneLocale() {
        return naturCommuneLocale;
    }

    public void setNaturCommuneLocale(String naturCommuneLocale) {
        this.naturCommuneLocale = naturCommuneLocale;
    }

    public long getCodeCommuneLocale() {
        return codeCommuneLocale;
    }

    public void setCodeCommuneLocale(long codeCommuneLocale) {
        this.codeCommuneLocale = codeCommuneLocale;
    }

    public Commandement getCommandement() {
        return commandement;
    }

    public void setCommandement(Commandement commandement) {
        this.commandement = commandement;
    }
}
