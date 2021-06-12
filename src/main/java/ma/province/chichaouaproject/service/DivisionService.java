package ma.province.chichaouaproject.service;

import ma.province.chichaouaproject.bean.Division;
import ma.province.chichaouaproject.dao.DivisionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DivisionService {

    public Division findByCodeDivision(long codeDivision) {
        return divisionDao.findByCodeDivision(codeDivision);
    }

    public List<Division> findAll() {
        return divisionDao.findAll();
    }

    public int saveDivision(Division division){
        if(findByCodeDivision(division.getCodeDivision()) != null){
            return -1;
        }else{
            divisionDao.save(division);
            return 1;
        }
    }

    @Autowired
    private DivisionDao divisionDao;
}
