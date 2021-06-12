package ma.province.chichaouaproject.dao;

import ma.province.chichaouaproject.bean.ServiceExt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceExtDao extends JpaRepository <ServiceExt, Long >  {
    ServiceExt findByCodeServiceExt (long codeServiceExt);
}
