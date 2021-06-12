package ma.province.chichaouaproject.service;

import ma.province.chichaouaproject.bean.Sexe;
import ma.province.chichaouaproject.dao.SexeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SexeService {

    public Sexe findByCodeSexe(long codeSexe) {
        return sexeDao.findByCodeSexe(codeSexe);
    }

    public List<Sexe> findAll() {
        return sexeDao.findAll();
    }

    @Autowired
    public SexeDao sexeDao;
}
