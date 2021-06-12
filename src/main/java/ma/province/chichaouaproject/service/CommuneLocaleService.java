package ma.province.chichaouaproject.service;

import ma.province.chichaouaproject.bean.Commandement;
import ma.province.chichaouaproject.bean.CommuneLocale;
import ma.province.chichaouaproject.dao.CommuneLocaleDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommuneLocaleService {

    public CommuneLocale findByCodeCommuneLocale(long codeCommuneLocale) {
        return communeLocaleDao.findByCodeCommuneLocale(codeCommuneLocale);
    }

    public CommuneLocale findByNomCommuneLocaleFR(String nomCommuneLocaleFR) {
        return communeLocaleDao.findByNomCommuneLocaleFR(nomCommuneLocaleFR);
    }

    public List<CommuneLocale> findAll() {
        return communeLocaleDao.findAll();
    }

    public int saveCommuneLocal(CommuneLocale communeLocale){
        Commandement commandement = commandementService.findByNomCommandementFR(communeLocale.getCommandement().getNomCommandementFR());
        communeLocale.setCommandement(commandement);
        if (findByCodeCommuneLocale(communeLocale.getCodeCommuneLocale()) != null) {
            return -1;
        } else if( commandement == null){
            return -2 ;
        }
        else{
            communeLocaleDao.save(communeLocale);
            return 1;
        }
    }

    @Autowired
    private CommuneLocaleDao communeLocaleDao;
    @Autowired
    private CommandementService commandementService;
}
