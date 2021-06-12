package ma.province.chichaouaproject.service;

import ma.province.chichaouaproject.bean.Statut;
import ma.province.chichaouaproject.dao.StatutDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StatutService {
    public Statut findByCodeStatut(long codeStatut) {
        return statutDao.findByCodeStatut(codeStatut);
    }

    public Statut findByNomStatutFR(String nomStatutFR) {
        return statutDao.findByNomStatutFR(nomStatutFR);
    }

    public List<Statut> findAll() {
        return statutDao.findAll();
    }

    public int saveStatut(Statut statut){
        if (findByCodeStatut(statut.getCodeStatut()) != null){
            return -1;
        }else{
            statutDao.save(statut);
            return 1;
        }
    }

    @Autowired
    private StatutDao statutDao;
}
