package ma.province.chichaouaproject.service;

import ma.province.chichaouaproject.bean.Classe;
import ma.province.chichaouaproject.dao.ClasseDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClasseService {
    public Classe findByCodeClasse(long codeClasse) {
        return classeDao.findByCodeClasse(codeClasse);
    }

    public List<Classe> findAll() {
        return classeDao.findAll();
    }

    @Autowired
    public ClasseDao classeDao;
}
