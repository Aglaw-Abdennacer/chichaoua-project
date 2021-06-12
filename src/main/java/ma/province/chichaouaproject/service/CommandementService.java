package ma.province.chichaouaproject.service;

import ma.province.chichaouaproject.bean.Commandement;
import ma.province.chichaouaproject.dao.CommandementDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommandementService {
    public Commandement findByNomCommandementFR(String nomCommandementFR) {
        return commandementDao.findByNomCommandementFR(nomCommandementFR);
    }

    public List<Commandement> findAll() {
        return commandementDao.findAll();
    }

    public int saveCommandement(Commandement commandement){
        if (findByNomCommandementFR(commandement.getNomCommandementFR()) != null){
            return -1;
        }else{
            commandementDao.save(commandement);
            return 1;
        }
    }

    @Autowired
    private CommandementDao commandementDao;
}
