package ma.province.chichaouaproject.service;

import ma.province.chichaouaproject.bean.*;
import ma.province.chichaouaproject.dao.VisiteurDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class VisiteurService {

    public Visiteur findByNumCin(long numCin) {
        return visiteurDao.findByNumCin(numCin);
    }

    @Transactional
    public int deleteByNumCin(long numCin) {
        return visiteurDao.deleteByNumCin(numCin);
    }


    public List<Visiteur> findAll() {
        return visiteurDao.findAll();
    }

    public int saveVisiteur(Visiteur visiteur){
        Commune commune = communeService.findByCodeCommune(visiteur.getCommune().getCodeCommune());
        Sexe sexe = sexeService.findByCodeSexe(visiteur.getSexe().getCodeSexe());
        Classe classe = classeService.findByCodeClasse(visiteur.getClasse().getCodeClasse());
        visiteur.setCommune(commune);
        visiteur.setSexe(sexe);
        visiteur.setClasse(classe);
        if(findByNumCin(visiteur.getNumCin()) != null){
            return -1 ;
        }else if(sexe == null || commune == null || classe == null){
            return -2;
        }
        else{
            visiteurDao.save(visiteur);
            return 1;
    }
    }

    public int verifyCin(long cin){
        if(findByNumCin(cin) == null){
            return -1;
        }else{
            return 1;
        }
    }

    @Autowired
    public VisiteurDao visiteurDao;
   @Autowired
    public DemandeService demandeService;
   @Autowired
    public SexeService sexeService;
   @Autowired
    public CommuneService communeService;
   @Autowired
    public ClasseService classeService;

}
