package ma.province.chichaouaproject.service;

import ma.province.chichaouaproject.bean.Dossier;
import ma.province.chichaouaproject.dao.DossierDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DossierService {

    public Dossier findByNumDossier(long numDossier) {
        return dossierDao.findByNumDossier(numDossier);
    }

    public int deleteByNumDossier(long numDossier) {
        return dossierDao.deleteByNumDossier(numDossier);
    }

    public Dossier findByNomDossier(String nomDossier) {
        return dossierDao.findByNomDossier(nomDossier);
    }

    @Transactional
    public int deleteByNomDossier(String nomDossier) {
        return dossierDao.deleteByNomDossier(nomDossier);
    }

    public List<Dossier> findAll() {
        return dossierDao.findAll();
    }

    public int saveDossier(Dossier dossier){
        if(findByNumDossier(dossier.getNumDossier()) != null){
            return -1;
        }else{
            dossierDao.save(dossier);
            return 1;
        }
    }

    @Autowired
    public DossierDao dossierDao;
}
