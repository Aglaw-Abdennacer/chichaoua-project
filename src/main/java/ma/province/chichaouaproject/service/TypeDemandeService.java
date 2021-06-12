package ma.province.chichaouaproject.service;

import ma.province.chichaouaproject.bean.TypeDemande;
import ma.province.chichaouaproject.dao.TypeDemandeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TypeDemandeService {
    public TypeDemande findByCodeTypeDemande(long codeTypeDemande) {
        return typeDemandeDao.findByCodeTypeDemande(codeTypeDemande);
    }

    @Transactional
    public int deleteByCodeTypeDemande(long codeTypeDemande) {
        return typeDemandeDao.deleteByCodeTypeDemande(codeTypeDemande);
    }

    public List<TypeDemande> findAll() {
        return typeDemandeDao.findAll();
    }

    public int saveTypeDemande(TypeDemande typeDemande){
        if(findByCodeTypeDemande(typeDemande.getCodeTypeDemande()) != null){
            return -1;
        }else{
            typeDemandeDao.save(typeDemande);
            return 1;
        }
    }

    @Autowired
    private TypeDemandeDao typeDemandeDao;
}
