package ma.province.chichaouaproject.bean;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Demande {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idDemande;
    private long numOrdre;
    private String objet;
    private String description;
    private Date dateVisite;
    private long heurVisite;
    private long heurEntrer;
    private long heurSortie;
    private long nbrVisiteur;
    private int infoDivision;
    private String actionDivision;
    private String respDivision;
    private Date dateMaj;
    private String remarque;
    private String ServiceSuppl;
    private Date dateLimite;
    private Date dateEvenement;
    @ManyToOne
    private Visiteur visiteur;
    @ManyToOne
    private Dossier dossier;
    @ManyToOne
    private Theme theme;
    @ManyToOne
    private Statut statut;
    @ManyToOne
    private Division division;
    @ManyToOne
    private CommuneLocale communeLocale;
    @ManyToOne
    private ServiceExt serviceExt;
    @ManyToOne
    private TypeDemande typeDemande;




    public TypeDemande getTypeDemande() {
        return typeDemande;
    }

    public void setTypeDemande(TypeDemande typeDemande) {
        this.typeDemande = typeDemande;
    }

    public CommuneLocale getCommuneLocale() {
        return communeLocale;
    }

    public void setCommuneLocale(CommuneLocale communeLocale) {
        this.communeLocale = communeLocale;
    }


    public ServiceExt getServiceExt() {
        return serviceExt;
    }

    public void setServiceExt(ServiceExt serviceExt) {
        this.serviceExt = serviceExt;
    }

    public Division getDivision() {
        return division;
    }

    public void setDivision(Division division) {
        this.division = division;
    }

    public Statut getStatut() {
        return statut;
    }

    public void setStatut(Statut statut) {
        this.statut = statut;
    }

    public Theme getTheme() {
        return theme;
    }

    public void setTheme(Theme theme) {
        this.theme = theme;
    }

    public Dossier getDossier() {
        return dossier;
    }

    public void setDossier(Dossier dossier) {
        this.dossier = dossier;
    }

    public long getIdDemande() {
        return idDemande;
    }

    public void setIdDemande(long idDemande) {
        this.idDemande = idDemande;
    }

    public long getNumOrdre() {
        return numOrdre;
    }

    public void setNumOrdre(long numOrdre) {
        this.numOrdre = numOrdre;
    }

    public String getObjet() {
        return objet;
    }

    public void setObjet(String objet) {
        this.objet = objet;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDateVisite() {
        return dateVisite;
    }

    public void setDateVisite(Date dateVisite) {
        this.dateVisite = dateVisite;
    }

    public long getHeurVisite() {
        return heurVisite;
    }

    public void setHeurVisite(long heurVisite) {
        this.heurVisite = heurVisite;
    }

    public long getHeurEntrer() {
        return heurEntrer;
    }

    public void setHeurEntrer(long heurEntrer) {
        this.heurEntrer = heurEntrer;
    }

    public long getHeurSortie() {
        return heurSortie;
    }

    public void setHeurSortie(long heurSortie) {
        this.heurSortie = heurSortie;
    }

    public long getNbrVisiteur() {
        return nbrVisiteur;
    }

    public void setNbrVisiteur(long nbrVisiteur) {
        this.nbrVisiteur = nbrVisiteur;
    }

    public int getInfoDivision() {
        return infoDivision;
    }

    public void setInfoDivision(int infoDivision) {
        this.infoDivision = infoDivision;
    }

    public String getActionDivision() {
        return actionDivision;
    }

    public void setActionDivision(String actionDivision) {
        this.actionDivision = actionDivision;
    }

    public String getRespDivision() {
        return respDivision;
    }

    public void setRespDivision(String respDivision) {
        this.respDivision = respDivision;
    }

    public Date getDateMaj() {
        return dateMaj;
    }

    public void setDateMaj(Date dateMaj) {
        this.dateMaj = dateMaj;
    }

    public String getRemarque() {
        return remarque;
    }

    public void setRemarque(String remarque) {
        this.remarque = remarque;
    }

    public String getServiceSuppl() {
        return ServiceSuppl;
    }

    public void setServiceSuppl(String serviceSuppl) {
        ServiceSuppl = serviceSuppl;
    }


    public Date getDateLimite() {
        return dateLimite;
    }

    public void setDateLimite(Date dateLimite) {
        this.dateLimite = dateLimite;
    }

    public Date getDateEvenement() {
        return dateEvenement;
    }

    public void setDateEvenement(Date dateEvenement) {
        this.dateEvenement = dateEvenement;
    }

    public Visiteur getVisiteur() {
        return visiteur;
    }

    public void setVisiteur(Visiteur visiteur) {
        this.visiteur = visiteur;
    }
}
