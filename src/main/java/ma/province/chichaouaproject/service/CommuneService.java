package ma.province.chichaouaproject.service;

import ma.province.chichaouaproject.bean.Commune;
import ma.province.chichaouaproject.dao.CommuneDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommuneService {

    public Commune findByCodeCommune(long codeCommune) {
        return communeDao.findByCodeCommune(codeCommune);
    }

    public List<Commune> findAll() {
        return communeDao.findAll();
    }

    @Autowired
    public CommuneDao communeDao;
}
