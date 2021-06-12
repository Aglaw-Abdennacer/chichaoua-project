package ma.province.chichaouaproject.bean;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Visiteur {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long idVisiteur;
    long numCin;
    String nomAR ;
    String prenoAR ;
    String nomFR ;
    String prenomFR ;
    long telephone ;
    String email ;
    String adresse ;
    Date  dateNaissance ;
    @ManyToOne
    private Sexe sexe;
    @ManyToOne
    private Commune commune;
    @ManyToOne
    private Classe classe;


    public Classe getClasse() {
        return classe;
    }

    public void setClasse(Classe classe) {
        this.classe = classe;
    }

    public long getIdVisiteur() {
        return idVisiteur;
    }

    public void setIdVisiteur(long idVisiteur) {
        this.idVisiteur = idVisiteur;
    }

    public long getNumCin() {
        return numCin;
    }

    public void setNumCin(long numCin) {
        this.numCin = numCin;
    }

    public String getNomAR() {
        return nomAR;
    }

    public void setNomAR(String nomAR) {
        this.nomAR = nomAR;
    }

    public String getPrenoAR() {
        return prenoAR;
    }

    public void setPrenoAR(String prenoAR) {
        this.prenoAR = prenoAR;
    }

    public String getNomFR() {
        return nomFR;
    }

    public void setNomFR(String nomFR) {
        this.nomFR = nomFR;
    }

    public String getPrenomFR() {
        return prenomFR;
    }

    public void setPrenomFR(String prenomFR) {
        this.prenomFR = prenomFR;
    }

    public long getTelephone() {
        return telephone;
    }

    public void setTelephone(long telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public Sexe getSexe() {
        return sexe;
    }

    public void setSexe(Sexe sexe) {
        this.sexe = sexe;
    }

    public Commune getCommune() {
        return commune;
    }

    public void setCommune(Commune commune) {
        this.commune = commune;
    }
}
