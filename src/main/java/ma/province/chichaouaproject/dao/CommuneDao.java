package ma.province.chichaouaproject.dao;

import ma.province.chichaouaproject.bean.Commune;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommuneDao extends JpaRepository <Commune, Long >  {
    Commune findByCodeCommune(long codeCommune);
}
