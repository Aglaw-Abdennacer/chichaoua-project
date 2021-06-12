package ma.province.chichaouaproject.service;

import ma.province.chichaouaproject.bean.*;
import ma.province.chichaouaproject.dao.DemandeDao;
import ma.province.chichaouaproject.vo.DemandeVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import javax.persistence.EntityManager;

import java.lang.reflect.Type;
import java.util.List;

@Service
public class DemandeService {

    public Demande findBynumOrdre(long numOrdre) {
        return demandeDao.findBynumOrdre(numOrdre);
    }
    @Transactional
    public int deleteBynumOrdre(long numOrdre) {
        return demandeDao.deleteBynumOrdre(numOrdre);
    }

    public List<Demande> findByThemeNomThemeFR(String nomThemeFR) {
        return demandeDao.findByThemeNomThemeFR(nomThemeFR);
    }

    public List<Demande> findByStatutNomStatutFR(String nomStatutFR) {
        return demandeDao.findByStatutNomStatutFR(nomStatutFR);
    }

    public List<Demande> findByDivisionNomDivisionFR(String nomDivisionFR) {
        return demandeDao.findByDivisionNomDivisionFR(nomDivisionFR);
    }

    public List<Demande> findByTypeDemandeNomTypeDemandeFR(String nomTypeDemandeFR) {
        return demandeDao.findByTypeDemandeNomTypeDemandeFR(nomTypeDemandeFR);
    }

    public List<Demande> findAll() {
        return demandeDao.findAll();
    }

    public int saveDemande(Demande demande) {
        Visiteur visiteur = visiteurService.findByNumCin(demande.getVisiteur().getNumCin())  ;
        Dossier dossier = dossierService.findByNumDossier(demande.getDossier().getNumDossier());
        Theme theme = themeService.findByCodeTheme(demande.getTheme().getCodeTheme());
        Statut statut = statutService.findByCodeStatut(demande.getStatut().getCodeStatut());
        Division division = divisionService.findByCodeDivision(demande.getDivision().getCodeDivision());
        CommuneLocale communeLocale = communeLocaleService.findByCodeCommuneLocale(demande.getCommuneLocale().getCodeCommuneLocale());
        TypeDemande typeDemande = typeDemandeService.findByCodeTypeDemande(demande.getTypeDemande().getCodeTypeDemande());
        ServiceExt serviceExt = serviceExtService.findByCodeServiceExt(demande.getServiceExt().getCodeServiceExt());
        demande.setTypeDemande(typeDemande);
        demande.setServiceExt(serviceExt);
        demande.setDivision(division);
        demande.setTheme(theme);
        demande.setStatut(statut);
        demande.setCommuneLocale(communeLocale);
        if (findBynumOrdre(demande.getNumOrdre()) != null) {
            return -2;
        }else if (visiteur == null){
            return -3;
        }else if(division == null  || theme == null || statut == null || communeLocale == null  || typeDemande == null || typeDemande == null){
            return -4 ;
        }
        else if(dossier != null){
            demande.setVisiteur(visiteur);
            demande.setDossier(dossier);
            demandeDao.save(demande);
            return 2 ;
        } else {
            demande.setVisiteur(visiteur);
            dossierService.saveDossier(demande.getDossier());
            demandeDao.save(demande);
            return 1;
        }
    }


    public List<Demande> findByCritere(DemandeVo demandeVo) {
        String query = "SELECT d FROM Demande d where 1=1";
        if (demandeVo.getNumOrdre() != null && !demandeVo.getNumOrdre().isEmpty())
            query += "AND d.numOrdre ='" + demandeVo.getNumOrdre() + "'";
        if (demandeVo.getStaut() != null && !demandeVo.getStaut().isEmpty())
            query += "AND d.statut.nomStatutFR ='" + demandeVo.getStaut() + "'";
        if (demandeVo.getTypeDemande() != null && !demandeVo.getTypeDemande().isEmpty())
            query += "AND d.typeDemande.nomTypeDemandeFR ='" + demandeVo.getTypeDemande() + "'";
        if (demandeVo.getTheme() != null && !demandeVo.getTheme().isEmpty())
            query += "AND d.theme.nomThemeFR <='" + demandeVo.getTheme() + "'";
        return entityManager.createQuery(query).getResultList();
    }

   /* public int saveDemandeAvecVisiteur(Demande demande){
        Visiteur visiteur = visiteurService.findByNumCin(demande.getVisiteur().getNumCin());
        if(visiteur != null){
            return -1;
        }else{
            visiteurService.saveVisiteur(demande.getVisiteur());
            dossierService.saveDossier(demande.getDossier());
            Theme theme = themeService.findByCodeTheme(demande.getTheme().getCodeTheme());
            Statut statut = statutService.findByCodeStatut(demande.getStatut().getCodeStatut());
            Division division = divisionService.findByCodeDivision(demande.getDivision().getCodeDivision());
            CommuneLocale communeLocale = communeLocaleService.findByCodeCommuneLocale(demande.getCommuneLocale().getCodeCommuneLocale());
            TypeDemande typeDemande = typeDemandeService.findByCodeTypeDemande(demande.getTypeDemande().getCodeTypeDemande());
            ServiceExt serviceExt = serviceExtService.findByCodeServiceExt(demande.getServiceExt().getCodeServiceExt());
            demande.setTypeDemande(typeDemande);
            demande.setServiceExt(serviceExt);
            demande.setDivision(division);
            demande.setTheme(theme);
            demande.setStatut(statut);
            demande.setCommuneLocale(communeLocale);
            demande.setDossier(demande.getDossier());
            demandeDao.save(demande);
            return 1;
        }
    }*/

    /*public int saveDemandeAvecVisiteur(Demande demande){
        Visiteur visiteur = visiteurService.findByNumCin(demande.getVisiteur().getNumCin())  ;
        Theme theme = themeService.findByCodeTheme(demande.getTheme().getCodeTheme());
        Statut statut = statutService.findByCodeStatut(demande.getStatut().getCodeStatut());
        Division division = divisionService.findByCodeDivision(demande.getDivision().getCodeDivision());
        CommuneLocale communeLocale = communeLocaleService.findByCodeCommuneLocale(demande.getCommuneLocale().getCodeCommuneLocale());
        TypeDemande typeDemande = typeDemandeService.findByCodeTypeDemande(demande.getTypeDemande().getCodeTypeDemande());
        ServiceExt serviceExt = serviceExtService.findByCodeServiceExt(demande.getServiceExt().getCodeServiceExt());
        demande.setTypeDemande(typeDemande);
        demande.setServiceExt(serviceExt);
        demande.setDivision(division);
        demande.setTheme(theme);
        demande.setStatut(statut);
        demande.setCommuneLocale(communeLocale);
        if(visiteur != null){
            return -1;
        }else if(division == null  || theme == null || statut == null || communeLocale == null  || typeDemande == null || typeDemande == null){
        return -4 ;
            }else{
            Visiteur v = demande.getVisiteur();
            visiteurService.saveVisiteur(v);
            demande.setVisiteur(v);
            dossierService.saveDossier(demande.getDossier());
            demande.setDossier(demande.getDossier());
            saveDemande(demande);
            return 1;
        }
    }*/






    @Autowired
    public DemandeDao demandeDao;
    @Autowired
    public VisiteurService visiteurService;
    @Autowired
    public DossierService dossierService;
    @Autowired
    public ThemeService themeService;
    @Autowired
    public StatutService statutService;
    @Autowired
    public DivisionService divisionService;
    @Autowired
    public CommuneLocaleService communeLocaleService;
    @Autowired
    public CommandementService commandementService;
    @Autowired
    public TypeDemandeService typeDemandeService;
    @Autowired
    public ServiceExtService serviceExtService;
    @Autowired
    EntityManager entityManager;

}
