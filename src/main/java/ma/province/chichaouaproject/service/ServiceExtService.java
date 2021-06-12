package ma.province.chichaouaproject.service;

import ma.province.chichaouaproject.bean.ServiceExt;
import ma.province.chichaouaproject.dao.ServiceExtDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceExtService {

    public ServiceExt findByCodeServiceExt(long codeServiceExt) {
        return serviceExtDao.findByCodeServiceExt(codeServiceExt);
    }

    public List<ServiceExt> findAll() {
        return serviceExtDao.findAll();
    }

    public int saveServicExt(ServiceExt serviceExt){
        if(findByCodeServiceExt(serviceExt.getCodeServiceExt()) != null){
            return -1;
        }else{
            serviceExtDao.save(serviceExt);
            return 1;
        }
    }
    @Autowired
    private ServiceExtDao serviceExtDao;
}
